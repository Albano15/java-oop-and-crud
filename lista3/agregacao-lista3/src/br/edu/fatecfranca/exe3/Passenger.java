package br.edu.fatecfranca.exe3;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private int id;
    private String name;
    private String cpf;
    private List<Reservation> reservations; // Relacionamento 1:N com Reservation

    public Passenger(int id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.reservations = new ArrayList<>();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
