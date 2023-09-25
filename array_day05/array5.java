package heima_homework.array_day05;

public class array5 {
    public static void main(String[] args) {
        int[] grade = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for(int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        System.out.println(sum / (double)grade.length);
    }
}
