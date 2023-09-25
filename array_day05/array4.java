package heima_homework.array_day05;

public class array4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 8};
        int inter = 0;
        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for(int j = arr.length - 1; j > i; j--) {
                temp *= 10;
            }
            inter += temp;
        }
        System.out.println(inter);
    }
}
