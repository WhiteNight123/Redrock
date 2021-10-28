package one;

import java.util.Scanner;

public class RedrockLv2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 15, 9, 11};
        int temp;
        //冒泡排序
        System.out.println("冒泡排序结果(从大到小):");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //选择排序
        System.out.println("\n选择排序结果(从小到大):");
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //插入数据
        System.out.print("\n请输入要插入的数:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int index = -1;

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a && a < arr[i + 1]) {
                index = i;
                break;
            }
        }
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(newArr, index + 1, newArr, index + 1 + 1, newArr.length - 2 - index);
        newArr[index + 1] = a;

        System.out.println("添加后的数组:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
