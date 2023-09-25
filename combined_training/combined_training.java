package heima_homework.combined_training;

import java.util.Scanner;

public class combined_training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入舱室等级：（1为头等舱，0为经济舱）");
        int grade = sc.nextInt();
        double newPrice = computePrice(price, month, grade);
        if(newPrice > 0){
            System.out.println("打折后为：" + newPrice);
        }
    }

    public static double computePrice(double price, int month, int grade) {
        // Judge whether hot or cold season
        if(month >= 5 && month <= 10) {
            if(grade == 0) {
                return price * 0.85;
            }else if(grade == 1){
                return price * 0.9;
            }else {
                System.out.println("舱室等级选择错误");
                return -1;
            }
        }else if((month >= 11 && month <= 12) || month >= 1 && month <= 4) {
            if(grade == 0) {
                return price * 0.7;
            }else if(grade == 1){
                return price * 0.65;
            }else {
                System.out.println("舱室等级选择错误");
                return 1.0;
            }
        }else {
            System.out.println("月份输入错误！");
            return -1;
        }
    }
}
