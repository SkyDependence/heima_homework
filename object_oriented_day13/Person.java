package heima_homework.object_oriented_day13;

public class Person {
    private String nationality;
    private String name;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    public void work() {
        System.out.println("Work");
    }
}

class Student extends Person {
    private String school;
    private String stuNumber;

    @Override
    public void work() {
        System.out.println("Study");
    }
}

class Worker extends Person {
    private String unit;
    private int workAge;

    @Override
    public void work() {
        System.out.println("Build");
    }
}

class StudentLeader extends Student {
    private String job;

    public void meeting() {
        System.out.println("Meeting");
    }
}
