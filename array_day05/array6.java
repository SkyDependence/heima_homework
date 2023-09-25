package heima_homework.array_day05;

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        System.out.println("请输入一个整数数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for(int i = 0; i < newArr.length; i++) {
            if(num < newArr[i]) {
                for(int j = newArr.length - 1; j > i; j--) {
                    newArr[j] = newArr[j - 1];
                }
                newArr[i] = num;
                break;
            }
        }
        System.out.println("生成的新数组是：");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
