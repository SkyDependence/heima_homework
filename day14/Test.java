package heima_homework.day14;

public class Test {
    public static void main(String[] args) {
        Person s1 = new Person("老王", 30);
        Person s2 = new Person("老李", 25);
        Animal c = new Cat(3, "灰");
        Animal d = new Dog(2, "黑");
        s1.keepPet(d, "骨头");
        s2.keepPet(c, "鱼");
    }
}
