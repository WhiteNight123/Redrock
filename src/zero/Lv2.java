import java.util.Scanner;
import java.math.BigDecimal;

public class Lv2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input total number:");
        int n = myScanner.nextInt();
        System.out.println("Please input you chosen number:");
        int m = myScanner.nextInt();
        int son = 1;
        int mother = 1;
        m = m > (n - m) ? (n - m) : m;   //C(6,4)=C(6,2)
        double probability = 0;
        for (int i = m; i > 0; i--) {
            son *= n;
            mother *= i;
            n--;
            probability = (double) mother / (double) son;
        }
        System.out.println("Your got 5000000 dollars probability is " + probability);
    }
}
