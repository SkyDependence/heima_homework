package heima_homework.ArrayList_day11;

import java.util.ArrayList;

public class day11_2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaae");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名： " + list.get(i).getName() + ", 专业： " + list.get(i).getMajor());
        }
    }
}

class Teacher {
    private String name;
    private String major;

    public Teacher() {}
    public Teacher(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
