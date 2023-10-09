package heima_homework.string_day10;

import java.util.Scanner;

public class day10_4 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isSymmetry(str)) {
            System.out.println("为对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }

    public static boolean isSymmetry(String str) {
        boolean flag = false;
        String result = new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)) {
            flag = true;
        }
        return flag;
    }
}
