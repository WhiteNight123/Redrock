package two.RedrockLv1;

public interface FightInterface {
    //被攻击
    void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character[] c2, int index);

    //技能
    void skill(Character c1);

    //装备
    void equip(FightInterface fi, Hero hero);
}
