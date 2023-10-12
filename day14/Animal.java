package heima_homework.day14;

public class Animal {
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String eat(String something) {
        return "";
    }
}

class Dog extends Animal {
    public Dog(){}
    public Dog(int age, String color) {
        super.setAge(age);
        super.setColor(color);
    }
    public void lookHome() {
        System.out.println("look home");
    }

    @Override
    public String eat(String something) {
        return "两只前腿死死的抱住" + something + "猛吃";
    }
}

class Cat extends Animal {
    public Cat() {}
    public Cat(int age, String color) {
        super.setAge(age);
        super.setColor(color);
    }
    public void catchMouse() {
        System.out.println("catch mouse");
    }

    @Override
    public String eat(String something) {
        return "眯着眼睛侧着头吃" + something;
    }
}