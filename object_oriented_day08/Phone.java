package heima_homework.object_oriented_day08;

public class Phone {
    private String brand;
    private int price;
    private String color;
    public Phone() {

    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("输入的价格有误");
        }else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String call() {
        return "打电话";
    }
    public String sendMessage() {
        return "发短信";
    }
}
