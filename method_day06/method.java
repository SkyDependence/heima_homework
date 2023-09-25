package heima_homework.method_day06;

import java.util.Random;

public class method {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7};

        // 调用fill方法，将数组arr中从索引2（包括2）到索引4（不包括4）的元素都填充为9
        fill(arr, 2, 4, 9);

        // 打印填充后的数组
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 创建一个新数组newArray，并调用copyOf方法将数组arr的前3个元素复制到新数组中
        int[] newArray = new int[3];
        newArray = copyOf(arr, 3);

        // 打印复制后的新数组
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        // 调用lottery方法进行模拟抽奖
        lottery();
    }

    // 填充数组的方法
    public static void fill(int[] arr, int fromIndex, int toIndex, int value) {
        for(int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
    }

    // 复制数组的方法，将原数组的前n个元素复制到新数组中
    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArray = new int[newLength];
        for(int i = 0; i < newLength; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    // 模拟抽奖的方法
    public static void lottery() {
        Random r = new Random();
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] arred = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while (true){
                int index = r.nextInt(arr.length);
                int count = 0;

                // 检查抽奖结果是否已经被抽中过
                for(int j = 0; j < arred.length; j++) {
                    if(arr[index] == arred[j]){
                        count++;
                    }
                }

                // 如果没有被抽中过，将奖金加入到抽奖结果数组中，并打印出抽奖结果
                if (count == 0) {
                    for(int j = 0; j < arred.length; j++) {
                        if(arred[j] == 0) {
                            arred[j] = arr[index];
                            break;
                        }
                    }
                    System.out.println(arr[index] + "元的奖金被抽出");
                    break;
                }
            }
        }
    }
}
