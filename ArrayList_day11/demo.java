package heima_homework.ArrayList_day11;

import heima_homework.object_oriented_day08.Student;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "1234");
        User u3 = new User("heima003", "wangwu", "1234qwer");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = getIndex(list, "heima001");
        System.out.println(index);
   }

   public static int getIndex(ArrayList<User> list, String id) {
        for(int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if(id.equals(u.getId())){
                return i;
            }
        }
        return -1;
   }
}
class User {
    private String id;
    private String userName;
    private String password;

    public User() {}
    public User(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }
}

