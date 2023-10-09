package heima_homework.string_day10;


import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String result = strRandom(str);
        System.out.println(result);
    }

    public static String strRandom(String str) {
        char[] chr = stringToArr(str);
        Random r = new Random();
        for(int i = 0; i < str.length(); i++) {
            int index = r.nextInt(chr.length);
            char temp = chr[index];
            chr[index] = chr[i];
            chr[i] = temp;
        }
        String result = new String(chr);
        return result;
    }

    public static char[] stringToArr(String srt) {
        char[] result = new char[srt.length()];
        for(int i = 0; i < srt.length(); i++) {
            result[i] = srt.charAt(i);
        }
        return result;
    }
}
