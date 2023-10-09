package heima_homework.string_day10;

import java.util.Scanner;

public class day10_5 {
    public static void main(String[] args) {
        System.out.println("请输入身份证号码");
        Scanner sc = new Scanner(System.in);
        String ID = sc.next();
        if(ID.length() != 18) {
            System.out.println("身份证号码非法");
            return;
        }
        if (ID.charAt(0) == '0') {
            System.out.println("身份证号码非法");
            return;
        }
        boolean flag = true;
        for(int i = 0; i < ID.length(); i++) {
            if(!Character.isDigit(ID.charAt(i)) && i != ID.length() - 1) {
                flag = false;
            }else if(i == ID.length() - 1) {
                if (!Character.isDigit(ID.charAt(i)) && !(ID.charAt(i) == 'X')) {
                    flag = false;
                }
            }
        }
        if(flag) {
            System.out.println("是合法身份证号码");
        }else {
            System.out.println("不是合法身份证号码");
        }
    }
}
