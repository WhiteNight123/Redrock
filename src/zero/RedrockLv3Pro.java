package zero;

import java.util.Scanner;

public class RedrockLv3Pro {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentsService s = new StudentsService(20);
        boolean loop = true;
        while (loop) {
            s.showMenu();
            int a = myScanner.nextInt();
            switch (a) {
                case 1 -> s.addStudent();
                case 2 -> s.deleteStudent();
                case 3 -> s.findStudent();
                case 4 -> s.modifyStudent();
                case 5 -> s.showStudent();
                case 6 -> loop = false;
                default -> System.out.println("Please input number 1-5.");
            }
        }
    }


}

class Students {
    private int number;
    private String name;

    public Students(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return number + " " + name;
    }
}

class StudentsService {
    Scanner myScanner = new Scanner(System.in);
    int index = 0;
    public Students[] students;

    int studentNums = 6; //当前拥有的学生数

    public StudentsService(int size) { //当前数据
        students = new Students[size];
        students[0] = new Students(2021214229, "郭晓强");
        students[1] = new Students(2020212442, "王中泰");
        students[2] = new Students(2020214629, "廖俊枭");
        students[3] = new Students(2020214988, "郭祥瑞");
        students[4] = new Students(2020211614, "王兮");
        students[5] = new Students(2020211534, "邱天");

    }

    //展示菜单
    public void showMenu() {
        System.out.println("\n**********************");
        System.out.println("***** 1.添加学生 ******");
        System.out.println("***** 2.删除学生 ******");
        System.out.println("***** 3.查找学生 ******");
        System.out.println("***** 4.修改学生 ******");
        System.out.println("***** 5.展示学生(冒泡)**");
        System.out.println("***** 6.退出 *********");
        System.out.println("**********************");
    }

    //判断是否存在
    public int isExist() {
        System.out.print("Please input the number: ");
        int number = myScanner.nextInt();
        for (int i = 0; i < studentNums; i++) {
            if (number == students[i].getNumber()) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    //添加学生
    public void addStudent() {
        if (isExist() != -1) {
            System.out.println("The student is existed.");
        } else {
            System.out.print("Please input the number you want to add: ");
            int number = myScanner.nextInt();
            System.out.print("Please input the name you want to add: ");
            String name = myScanner.next();
            Students newStudent = new Students(number, name);
            students[studentNums++] = newStudent;
            System.out.println("Add student successfully. ");

        }
    }

    //删除学生
    public void deleteStudent() {
        if (isExist() != -1) {
            for (int i = index; i < studentNums - 1; i++) {
                students[i] = students[i + 1];
            }
            students[--studentNums] = null;
            System.out.println("Delete the student successfully.");
        } else {
            System.out.println("Sorry,the student does not exist. ");
        }
    }

    //查找学生
    public void findStudent() {
        if (isExist() != -1) {
            System.out.println("Find the student. \n" + students[index]);
        } else {
            System.out.println("The student does exist. ");
        }
    }

    //修改学生
    public void modifyStudent() {
        if (isExist() != -1) {
            System.out.println("Find the student. \n" + students[index]);
            System.out.print("Please input the number you want to change: ");
            int number = myScanner.nextInt();
            System.out.print("Please input the name you want to change: ");
            String name = myScanner.next();
            Students newStudent = new Students(number, name);
            students[index] = newStudent;
            System.out.println("Modify the student successfully.");
        } else {
            System.out.println("Sorry,the student does not exist. ");
        }
    }

    //展示学生
    public void showStudent() {
        Students temp;
        //冒泡排序
        for (int i = 0; i < studentNums - 1; i++) {
            for (int j = 0; j < studentNums - 1 - i; j++) {
                if (students[j].getNumber() > students[j + 1].getNumber()) {
                    temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        //打印输出
        for (int i = 0; i < studentNums; i++) {
            System.out.println(students[i]);
        }
    }
}