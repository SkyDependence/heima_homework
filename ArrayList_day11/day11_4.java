package heima_homework.ArrayList_day11;

import java.util.ArrayList;
import java.util.Scanner;

public class day11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("--------------welcome to Book Management System--------");
            System.out.println("1. Add book");
            System.out.println("2. Query book");
            System.out.println("3. Search book by name");
            System.out.println("4. Delete book by ISBN");
            System.out.println("5. Modify book info by ISBN");
            System.out.println("6. Quit the system");
            System.out.println("Please choose one to execute");
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> addBook(list);
                case 2 -> queryBook(list);
                case 3 -> searchBook(list);
                case 4 -> deleteBook(list);
                case 5 -> modifyBook(list);
                case 6 -> {
                    System.out.println("Quit");
                    break loop;
                }
                default -> {
                    System.out.println("Your choose is invalid");
                }
            }
        }
    }

    public static boolean isContain(ArrayList<Book> list, String ISBN) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    public static void addBook(ArrayList<Book> list) {
        Book b = new Book();
        System.out.println("Please enter ISBN: ");
        Scanner sc = new Scanner(System.in);
        String ISBN = sc.next();
        if (isContain(list, ISBN)) {
            System.out.println("This ISBN already exited, Please check your ISBN");
            return;
        } else {
            b.setISBN(ISBN);
        }
        System.out.println("Please enter book name:");
        b.setName(sc.next());
        System.out.println("Please enter writer:");
        b.setWriter(sc.next());
        System.out.println("Please enter price:");
        b.setPrice(sc.nextDouble());
        list.add(b);
        System.out.println("Addition successfully");
    }

    public static void queryBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("There is no book now!");
            return;
        }
        System.out.println("ISBN\t\tname\t\twriter\t\tprice");
        for (int i = 0; i < list.size(); i++) {
            show(list.get(i));
        }
    }

    public static void show(Book b) {
        System.out.println(b.getISBN() + "\t\t" + b.getName() + "\t\t" + b.getWriter() + "\t\t" + b.getPrice());
    }

    public static int isExited(ArrayList<Book> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void searchBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = sc.next();
        int index = isExited(list, name);
        if (index != -1) {
            System.out.println("ISBN\t\tname\t\twriter\t\tprice");
            show(list.get(index));
        }else {
            System.out.println("There is no such name book now");
        }
    }

    public static void deleteBook(ArrayList<Book> list) {

    }

    public static void modifyBook(ArrayList<Book> list) {

    }
}

class Book {
    private String ISBN;
    private String name;
    private String writer;
    private double price;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
