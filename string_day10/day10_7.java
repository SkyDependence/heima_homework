package heima_homework.string_day10;

public class day10_7 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        boolean flag = true;
        int count = 0;
        while(flag) {
            int index = str.indexOf("Java");
            if(index != -1) {
                count++;
                str = str.substring(index + 4);
            }else {
                flag = false;
            }
        }
        System.out.println(count);
    }
}
