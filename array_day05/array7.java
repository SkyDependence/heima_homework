package heima_homework.array_day05;

import java.util.Random;

public class array7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] newArr = new int[10];
        for(int i = 0, rear = newArr.length - 1, front = 0; i < newArr.length; i++) {
            if(arr[i] % 2 == 0) {
                newArr[rear] = arr[i];
                rear--;
            }else {
                newArr[front] = arr[i];
                front++;
            }
        }
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
