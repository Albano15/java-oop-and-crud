package br.edu.fatecfranca;
import br.edu.fatecfranca.exe3.Flight;
import br.edu.fatecfranca.exe3.Passenger;
import br.edu.fatecfranca.exe3.Reservation;

import java.util.Date;

public class MainReservation {
    public static void main(String[] args) {
        // Criando passageiros
        Passenger passenger1 = new Passenger(1, "João", "12345678901");
        Passenger passenger2 = new Passenger(2, "Jane", "98765432100");

        // Criando voos
        Flight flight1 = new Flight(1, "SP", "São Paulo");
        Flight flight2 = new Flight(2, "Franca", "Rio de Janeiro");

        // Criando reservas
        Reservation reservation1 = new Reservation(1, new Date(), passenger1, flight1);
        Reservation reservation2 = new Reservation(2, new Date(), passenger2, flight2);
        Reservation reservation3 = new Reservation(3, new Date(), passenger1, flight2);

        // Adicionando reservas aos passageiros
        passenger1.addReservation(reservation1);
        passenger1.addReservation(reservation3);
        passenger2.addReservation(reservation2);

        // Adicionando reservas aos voos
        flight1.addReservation(reservation1);
        flight2.addReservation(reservation2);
        flight2.addReservation(reservation3);

        // Exibindo dados
        System.out.println("Passenger: " + passenger1.getName() + " (CPF: " + passenger1.getCpf() + ")");
        for (Reservation reservation : passenger1.getReservations()) {
            System.out.println("Reservation: " + reservation.getId() + " for Flight: " +
                    reservation.getFlight().getOrigin() + " to " + reservation.getFlight().getDestination());
        }

        System.out.println("\nPassenger: " + passenger2.getName() + " (CPF: " + passenger2.getCpf() + ")");
        for (Reservation reservation : passenger2.getReservations()) {
            System.out.println("Reservation: " + reservation.getId() + " for Flight: " +
                    reservation.getFlight().getOrigin() + " to " + reservation.getFlight().getDestination());
        }
    }
}
