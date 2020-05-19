package Day28DatabaseUser.User;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//blueprint for user
public class User {

    String userName;
    String password;
    int age;
    Set<Integer> orderIds;

    User(String userName,String password,int age,Set<Integer> orderIds) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.orderIds = orderIds;
    }

    public static void main(String[] args) {

        //Create User
        Set a = new HashSet();  //Set is interface implemented by HashSet class
        a.add(1212);

        User disha = new User("disha_patel","helloWorld",30,a);
        String s = "Hello, Goodbye, Farewell";
        Pattern p = Pattern.compile("\\p{Alpha}+");
        Matcher m = p.matcher(s);

        while( m.find() ){
            System.out.println(m.group());
        }
    }
}
