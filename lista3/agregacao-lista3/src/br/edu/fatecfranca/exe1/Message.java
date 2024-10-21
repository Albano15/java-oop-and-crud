package br.edu.fatecfranca.exe1;

public class Message {
    private int id;
    private String text;
    private Forum forum; // Relacionamento N:1 com Forum

    public Message(int id, String text, Forum forum) {
        this.id = id;
        this.text = text;
        this.forum = forum;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }
}
