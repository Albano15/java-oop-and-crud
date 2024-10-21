package br.edu.fatecfranca;

import br.edu.fatecfranca.exe1.Forum;
import br.edu.fatecfranca.exe1.Message;
import br.edu.fatecfranca.exe1.Person;

public class MainPerson {
    public static void main(String[] args) {
        // Criando um fórum
        Forum forum = new Forum(1, "Java Programming", "https://forum.java.com");

        // Criando uma pessoa
        Person person = new Person(1, "John Doe", "johndoe");

        // Criando mensagens
        Message message1 = new Message(1, "Hello World", forum);
        Message message2 = new Message(2, "Hello?", forum);

        // Adicionando mensagens ao fórum
        forum.addMessage(message1);
        forum.addMessage(message2);

        // Adicionando mensagens à pessoa
        person.addMessage(message1);
        person.addMessage(message2);

        // Exibindo dados
        System.out.println("Person: " + person.getName() + " (User: " + person.getUser() + ")");
        for (Message message : person.getMessages()) {
            System.out.println("Message: " + message.getText() + " in Forum: " + message.getForum().getName());
        }
    }
}
