package src.Lessons13.HomeWork3;


import java.io.IOException;

public class StartFalse {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserWorkFalse falsetodos=new UserWorkFalse();
        falsetodos.getUser("https://jsonplaceholder.typicode.com/users/3/todos?completed=false");

    }

}
