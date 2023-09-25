package heima_homework.array_day05;

import java.util.Random;

public class array3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
