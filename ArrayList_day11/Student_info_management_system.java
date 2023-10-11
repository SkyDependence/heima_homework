package heima_homework.ArrayList_day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student_info_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> uList = new ArrayList<>();
        User su = new User();
        su.setName("000000su");
        su.setPassword("123456");
        uList.add(su);
        while (true) {
            System.out.println("Welcome to Student info management system");
            System.out.println("Please choose one to execute: ");
            System.out.println("1. Login");
            System.out.println("2. Registration");
            System.out.println("3. Forget password");
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> login(uList);
                case 2 -> registration(uList);
                case 3 -> forgetPassword(uList);
                default -> {
                    System.out.println("Your choose is invalid");
                    System.exit(0);
                }
            }
        }
    }


    public static int isExistent(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (name.equals(u.getName())) {
                return i;
            }
        }
        return -1;
    }

    public static String generateVerificationCode(int count) {
        Random r = new Random();
        int index = r.nextInt(count);
        StringBuilder vCode = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i == index) {
                vCode.append(r.nextInt(10));
            } else {
                int flag = r.nextInt(2);
                if (flag == 0) {
                    vCode.append((char)('A' + r.nextInt(26)));
                } else {
                    vCode.append((char)('a' + r.nextInt(26)));
                }
            }
        }
        return vCode.toString();
    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String vCode = generateVerificationCode(5);
        System.out.print("Verification code: " + vCode);
        System.out.println();
        System.out.println("Please enter verification code");
        String uVCode = sc.next();
        if (!vCode.equals(uVCode)) {
            System.out.println("Wrong");
            return;
        }
        System.out.println("Please enter your account");
        String name = sc.next();
        int i = isExistent(list, name);
        if (i != -1) {
            System.out.println("Please enter your password");
            String password = sc.next();
            if (list.get(i).getPassword().equals(password)) {
                ArrayList<Student> sList = new ArrayList<>();
                while (true) {
                    System.out.println("-------------------Welcome to heima student info management system-------------------");
                    System.out.println("1: Add student");
                    System.out.println("2: Delete student");
                    System.out.println("3: Modify student");
                    System.out.println("4: Query student");
                    System.out.println("5: Quit");
                    System.out.print("Please choose: ");
                    int choose = sc.nextInt();
                    switch (choose) {
                        case 1 -> addStudent(sList);
                        case 2 -> deleteStudent(sList);
                        case 3 -> modifyStudent(sList);
                        case 4 -> queryStudent(sList);
                        case 5 -> {
                            System.out.println("Quit");
                            System.exit(0);
                        }
                        default -> System.out.println("Don't have this choose");
                    }
                }
            } else {
                System.out.println("Your password is wrong");
                return;
            }
        } else {
            System.out.println("Your account is not exited, Please register");
            return;
        }
    }

    public static void registration(ArrayList<User> list) {
        User u = new User();
        System.out.println("Please enter your account");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (isExistent(list, name) != -1) {
            System.out.println("This account already existed");
            return;
        } else {
            if (name.length() < 3 || name.length() > 15) {
                System.out.println("Your account's length must between 3 and 15");
            } else {
                boolean flag = false;
                for (int i = 0; i < name.length(); i++) {
                    if (Character.isLetter(name.charAt(i))) {
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Your account can't be all digits");
                    return;
                } else {
                    u.setName(name);
                    System.out.println("Please enter your password");
                    String password = sc.next();
                    System.out.println("Please enter your password again");
                    if (!password.equals(sc.next())) {
                        System.out.println("Your password is different in two times");
                        return;
                    } else {
                        u.setPassword(password);
                        System.out.println("Please enter your ID code");
                        String ID = sc.next();
                        if (!IDVerification(ID)) {
                            System.out.println("Your ID code is invalid");
                            return;
                        } else {
                            u.setID(ID);
                            System.out.println("Please enter your phone number");
                            String pNumber = sc.next();
                            if (!pNumberVerification(pNumber)) {
                                System.out.println("Your phone number is invalid");
                                return;
                            } else {
                                u.setPhoneNumber(pNumber);
                                list.add(u);
                                System.out.println("Registration successfully");
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean pNumberVerification(String p) {
        if (p.length() != 11) {
            return false;
        }
        if (p.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < p.length(); i++) {
            if (!Character.isDigit(p.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean IDVerification(String ID) {
        if (ID.charAt(0) == '0') {
            return false;
        }
        if (ID.length() != 18) {
            return false;
        }
        for (int i = 0; i < ID.length() - 1; i++) {
            if (!Character.isDigit(ID.charAt(i))) {
                return false;
            }
        }
        if (!(Character.isDigit(ID.charAt(ID.length() - 1)) || ID.charAt(ID.length() - 1) == 'x' || ID.charAt(ID.length() - 1) == 'X')) {
            return false;
        }
        return true;
    }

    public static void forgetPassword(ArrayList<User> list) {
        System.out.println("Please enter your account");
        Scanner sc = new Scanner(System.in);
        String account = sc.next();
        int i = isExistent(list, account);
        if (i == -1) {
            System.out.println("Unregistered");
            return;
        }
        System.out.println("Please enter your ID code");
        String ID = sc.next();
        System.out.println("Please enter your phone number");
        String pNumber = sc.next();
        if (ID.equals(list.get(i).getID()) && pNumber.equals(list.get(i).getPhoneNumber())) {
            System.out.println("Please enter your new password");
            list.get(i).setPassword(sc.next());
        }
        else {
            System.out.println("Account information does not match, modify failed");
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
        sc.nextLine();
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
