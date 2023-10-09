package heima_homework.string_day10;

import java.util.Random;

public class day10_2 {
    public static void main(String[] args) {
        char[] verificationCode = new char[5];
        Random r = new Random();
        boolean[] isDigit = new boolean[5];
        isDigit[r.nextInt(5)] = true;
        for(int i = 0; i < verificationCode.length; i++) {
            if(isDigit[i]) {
                verificationCode[i] = (char)('0' + r.nextInt(10));
            }else {
                int flag = r.nextInt(2);
                if(flag == 0) {
                    verificationCode[i] = (char)('a' + r.nextInt(26));
                }else {
                    verificationCode[i] = (char)('A' + r.nextInt(26));
                }
            }
        }
        String ver = new String(verificationCode);
        System.out.println(ver);
    }
}
