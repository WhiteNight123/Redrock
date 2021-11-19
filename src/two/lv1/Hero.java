package two.lv1;
import java.util.Scanner;

public class Hero extends Character {
    Scanner sc = new Scanner(System.in);

    private Hero hero;
    private Skill skill;

    protected double crit = 1.1; //暴击率

    public void start() {//初始化英雄
        setName();
        setHp();
        setAtk();
        setDef();
    }

    public Hero() {
    }

    @Override
    public void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character[] c2, int index) {
        if (loop) {
            int sumDamage = 0; //计算总伤害
            for (int i = 0; i < c2.length; i++) {
                setDamage(c1, c2, i); //计算伤害
                modifyHp(getDamage()); //减血
                //System.out.println(c1.getName()+"第"+(i+1)+"次受到了"+c2[i].getName()+c1.getDamage()+"点伤害");
                sumDamage += getDamage();
            }
            System.out.println(getName() + "受到了" + sumDamage + "点伤害");
        }
        if (getHp() > 0) {
            System.out.println(getName() + "血量:" + getHp());
            attack(fi, c1, c2); //继续攻击
        } else {
            setHp(0); //英雄死亡
            System.out.println(getName() + "已阵亡");
            System.out.println("\nDefeat");
        }
    }

    //攻击方法
    public void attack(FightInterface fi, Character c1, Character[] c2) {
        c1.print(c2);
        System.out.println("-------------");
        System.out.print("请选择你要攻击的小兵:");
        int index = sc.nextInt();
        fi = (FightInterface) c2[index];
        if (c2[index].getHp() > 0) {
            fi.attacked(damage, this, true, c1, c2, index);
        } else {
            c2[index].setHp(0);
            System.out.println(c2[index].getName() + "已阵亡");
            fi = (FightInterface) c1;
            hero = (Hero) c1;
            hero.attack(fi, c1, c2);
        }
    }

    //计算伤害 伤害= 攻击力 * 爆率 * (1-(敌方防御力/(100+敌方防御力)))
    public void setDamage(Character c1, Character[] c2, int i) { //c1是己方 c2是敌方
        if (c2[i].getHp() != 0) {
            int s = (int) (Math.random() * 5);//生成随机数
            this.damage = (int) (s + c2[i].getAtk() * (1.0 - c1.getDef() / (100 + c1.getDef())));
        } else {
            this.damage = 0;
        }
    }

    //修改血量
    public void modifyHp(int damage) {
        this.hp -= damage;
    }

    public void setName() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("请输入名称(10字符):");
        this.name=InputException.setName();
    }

    public void setHp() {
        System.out.print("请输入血量(1-9999):");
        this.hp=InputException.setHp();
    }

    public void setAtk() {
        while (true) {
            System.out.print("请输入攻击力(1-999):");
            double atk = sc.nextInt();
            if (atk > 0 && atk < 1000) {
                this.atk = atk;
                break;
            } else {
                System.out.println("攻击力不合要求...");
            }
        }
    }

    public void setDef() {
        while (true) {
            System.out.print("请输入防御力(1-999):");
            int def = sc.nextInt();
            if (def > 0 && def < 1000) {
                this.def = def;
                break;
            } else {
                System.out.println("防御力不合要求...");
            }
        }
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

}
