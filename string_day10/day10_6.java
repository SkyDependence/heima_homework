package heima_homework.string_day10;

public class day10_6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = combine(arr);
        System.out.println(str);
    }

    public static String combine(int[] arr) {
        if(arr == null) {
            return "null";
        }
        if(arr.length == 0) {
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                str.append(arr[i]).append(", ");
            }else {
                str.append(arr[i]).append("]");
            }
        }
        return str.toString();
    }
}
