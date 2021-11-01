import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input your usualGrade:");
        double usualGrade = myScanner.nextDouble();
        System.out.println("Please input your midtermGrade:");
        double midtermGrade = myScanner.nextDouble();
        System.out.println("Please input your finalGrade:");
        double finalGrade = myScanner.nextDouble();
        double grade = usualGrade * 0.2 + midtermGrade * 0.3 + finalGrade * 0.5;
        System.out.println("Your grade is " + grade);
    }


}
