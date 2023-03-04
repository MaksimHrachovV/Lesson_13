package src.Lessons13.HomeWork2;

import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

class UserWork {

    public void postUser(int userId) throws IOException, InterruptedException {
        String uriUserId="https://jsonplaceholder.typicode.com/users/"+userId+"/posts";
        HttpClient client= HttpClient.newHttpClient();

        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uriUserId))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 2.1 (postUser)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

        Gson gson = new Gson();
        Post[] userArray = gson.fromJson(response.body(), Post[].class);
        int id = 0;
        for(Post user : userArray) {

            id=user.getId();
        }

        String uriComments="https://jsonplaceholder.typicode.com/posts/"+id+"/comments";
        HttpClient client2= HttpClient.newHttpClient();

        HttpRequest request2= HttpRequest.newBuilder()
                .uri(URI.create(uriComments))
                .GET()
                .build();
        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
        client2.send(request2,HttpResponse.BodyHandlers.ofFile(Path.of("user-" + userId + "-post-" + id + "-comments.json")));
        System.out.println("TaskNumber - 2.2 (uriComments)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response2.body());
        System.out.println("response.statusCode() = " + response2.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");


    }


}



