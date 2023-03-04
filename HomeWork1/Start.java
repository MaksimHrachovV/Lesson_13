package src.Lessons13.HomeWork1;


import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserWorkClass user=new UserWorkClass();
        user.addNewUser("https://jsonplaceholder.typicode.com/users");
        user.replaceUser("https://jsonplaceholder.typicode.com/users/1");
        user.delUser("https://jsonplaceholder.typicode.com/users/2");
        user.allGetUser("https://jsonplaceholder.typicode.com/users");
        user.getIdUser("https://jsonplaceholder.typicode.com/users",10);
        user.getUserName("https://jsonplaceholder.typicode.com/users","Antonette");
    }

}
