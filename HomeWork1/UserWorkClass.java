package src.Lessons13.HomeWork1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class UserWorkClass {

    public void addNewUser(String uri) throws IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of("src/Lessons13/HomeWork1/addUser.json")))
                .build();
        HttpResponse <String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 1.1 (addNewUser)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

    }
    public void replaceUser(String uri) throws IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofFile(Path.of("src/Lessons13/HomeWork1/replaceUser.json")))
                .build();
        HttpResponse <String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 1.2 (replaceUser)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

    }
    public void delUser(String uri) throws IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .DELETE()
                .build();
        HttpResponse <String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 1.3 (delUser)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

    }
    public void allGetUser(String uri) throws IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
        HttpResponse <String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 1.4 (allGetUser)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

    }
    public void getIdUser(String uri, int id) throws IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        String uriID=uri+"/"+id;
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uriID))
                .GET()
                .build();
        HttpResponse <String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 1.5 (getIdUser)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

    }
    public void getUserName(String uri, String userName) throws IOException, InterruptedException {
        String uriUserName=uri+"?username="+userName;
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uriUserName))
                .GET()
                .build();
        HttpResponse <String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("TaskNumber - 1.6 (getUserName)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("response.body() = " + response.body());
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("--------------------------------------------------------------------------------------");

    }


}