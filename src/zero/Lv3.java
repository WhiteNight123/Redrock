import java.util.Scanner;

public class Lv3 {
    //学生数据库
    static String[][] students = {
            {"2021214229", "郭晓强"},
            {"2020212442", "王中泰"},
            {"2020214629", "廖俊枭"},
            {"2020214988", "郭祥瑞"},
            {"2020211614", "王兮"},
            {"2020211534", "邱天"}
    };
    static Scanner myScanner = new Scanner(System.in);
    static String numberInput;

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int case1 = myScanner.nextInt();
            switch (case1) {
                case 1 -> addPerson(students);
                case 2 -> deletePerson(students);
                case 3 -> findPerson();
                case 4 -> modifyPerson();
                case 5 -> showPerson(students);
                default -> System.out.println("Please input number 1-6.");
            }
        }
    }

    //菜单
    public static void showMenu() {
        System.out.println("\n************************");
        System.out.println("***** 1.添加学生 *****");
        System.out.println("***** 2.删除学生 *****");
        System.out.println("***** 3.查找学生 *****");
        System.out.println("***** 4.修改学生 *****");
        System.out.println("***** 5.PLUS 展示学生(冒泡排序) *****");
        System.out.println("************************");
    }

    //添加学生
    public static void addPerson(String[][] s) {
        int a = isExist(students);
        if (a == -1) {
            String number = numberInput;
            System.out.print("Please input name you want to add: ");
            String name = myScanner.next();
            String[][] studentNew = new String[s.length + 1][2];
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].length; j++) {
                    studentNew[i][j] = s[i][j];
                }
                studentNew[i + 1][0] = number;
                studentNew[i + 1][1] = name;
                students = studentNew;
            }
        } else {
            System.out.println("The student is existed.");
        }
    }
    //几行废话
    // 检查是否存在(为什么要遍历数组为空?)
//    public  int isExist(String[][]students) {
//        for (int i = 0; i < students.length; i++) {
//            if (students[i][0] != null && students[i][1] != null){
//                return i;
//            }
//        }
//        return -1;
//    }

    //检查是否存在
    public static int isExist(String[][] s) {
        System.out.print("Please enter the number: ");
        numberInput = myScanner.next();
        for (int i = 0; i < s.length; i++) {
            if (numberInput.equals(s[i][0])) {
                return i;
            }
        }
        return -1;
    }

    //删除学生
    public static void deletePerson(String[][] s) {
        int index = isExist(students);
        if (index != -1) {
            String[][] studentNew = new String[s.length - 1][2];
            for (int i = 0; i < s.length - 1; i++) {
                if (i < index) {
                    for (int j = 0; j < 2; j++) {
                        studentNew[i][j] = s[i][j];
                    }
                } else {
                    for (int j = 0; j < 2; j++) {
                        studentNew[i][j] = s[i + 1][j];
                    }
                }
                students = studentNew;
            }
        } else {
            System.out.println("The student doesn't exist. ");
        }
    }

    //查找学生
    public static void findPerson() {
        int index = isExist(students);
        if (index != -1) {
            System.out.println("Find this student. ");
            for (int i = 0; i <= 1; i++) {
                System.out.print(students[index][i] + " ");
            }
        } else {
            System.out.println("This student doesn't exist. ");
        }

    }

    //修改学生
    public static void modifyPerson() {
        int index = isExist(students);
        if (index != -1) {
            System.out.print("Please enter the name you want to change: ");
            String name = myScanner.next();
            System.out.print("Please enter the number you want to change: ");
            String number = myScanner.next();
            students[index][1] = name;
            students[index][0] = number;
        } else {
            System.out.print("This student does not exist.");
        }
    }

    //PLUS 展示学生(冒泡排序)
    public static void showPerson(String[][] s) {
        int[] arr = new int[s.length];
        int temp;
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i][0]);
        }
        //冒泡排序
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //输出
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (Integer.toString(arr[i]).equals(s[j][0])) {
                    System.out.println(s[j][0] + " " + s[j][1]);
                }
            }
        }
    }
}


