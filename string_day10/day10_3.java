package heima_homework.string_day10;

import java.util.Scanner;

public class day10_3 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int letterCount = 0;
        int digitCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                digitCount++;
            }else if(Character.isLetter(str.charAt(i))) {
                letterCount++;
            }
        }
        System.out.println("字母：" + letterCount + "个, 数字：" + digitCount + "个");
    }
}
