package heima_homework.ArrayList_day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_info_management_system {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("-------------------Welcome to heima student info management system-------------------");
            System.out.println("1: Add student");
            System.out.println("2: Delete student");
            System.out.println("3: Modify student");
            System.out.println("4: Query student");
            System.out.println("5: Quit");
            System.out.print("Please choose: ");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> addStudent(list);
                case 2 -> deleteStudent(list);
                case 3 -> modifyStudent(list);
                case 4 -> queryStudent(list);
                case 5 -> {
                    System.out.println("Quit");
                    System.exit(0);
                }
                default -> System.out.println("Don't have this choose");
            }
        }
    }

    public static boolean contains(ArrayList<Student> list, String sid) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (sid.equals(s.getSid())) {
                flag = true;
            }
        }
        return flag;
    }

    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        s.setSid(null);
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter sid: ");
            String sid = sc.next();
            flag = contains(list, sid);
            if (flag) {
                System.out.println("This sid is exited, please enter again");
            } else {
                s.setSid(sid);
                break;
            }
        }
        System.out.println("Please enter name");
        String name = sc.next();
        s.setName(name);

        System.out.println("Please enter age");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("Please enter address");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("The student is added successfully");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sid of the student who will be delete:");
        String sid = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(sid)) {
                list.remove(i);
                System.out.println("The student is deleted");
                return;
            }
        }
        System.out.println("Failed to find the student");
    }

    public static void modifyStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sid of the student who will be modified");
        String sid = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(sid)) {
                loop:
                while (true) {
                    System.out.println("Please choose the info to be modified");
                    System.out.println("1. Name");
                    System.out.println("2. Age");
                    System.out.println("3. Address");
                    System.out.println("4. Quit");
                    int choose = sc.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("Please enter a new name:");
                            String name = sc.next();
                            list.get(i).setName(name);
                        }
                        case 2 -> {
                            System.out.println("Please enter a new age:");
                            int age = sc.nextInt();
                            list.get(i).setAge(age);
                        }
                        case 3 -> {
                            System.out.println("Please enter a new address:");
                            String address = sc.next();
                            list.get(i).setAddress(address);
                        }
                        case 4 -> {
                            break loop;
                        }
                        default -> {
                            System.out.println("Your choose is invalid, please enter again");
                    }
                }
            }
        }
    }
        System.out.println("There is no this student");
}

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("There is no student now!");
            return;
        }
        System.out.println("id\t\tname\tage\t\taddress");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).show());
        }
    }

}
