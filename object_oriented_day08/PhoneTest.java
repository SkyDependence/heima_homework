package heima_homework.object_oriented_day08;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setColor("黑色");
        p.setPrice(3988);
        System.out.println("正在使用" + p.getPrice() + "元" + p.getColor() + "的" + p.getBrand() + "手机" + p.call());
        System.out.println("正在使用" + p.getPrice() + "元" + p.getColor() + "的" + p.getBrand() + "手机" + p.sendMessage());
    }
}
