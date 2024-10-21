package br.edu.fatecfranca.exe1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String user;
    private List<Message> messages; // Relacionamento 1:N com Message

    public Person(int id, String name, String user) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.messages = new ArrayList<>();
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }
}
