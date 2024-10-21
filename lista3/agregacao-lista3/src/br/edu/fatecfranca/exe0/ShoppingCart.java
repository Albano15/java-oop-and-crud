package br.edu.fatecfranca.exe0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date date;
    private String destino;
    private String formaPagamento;
    private float total;
    //composição
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, Date date, String destino, String formaPagamento, float total) {
        this.id = id;
        this.date = date;
        this.destino = destino;
        this.formaPagamento = formaPagamento;
        this.total = total;
        this.carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    // Adicionar um item do carrinho no carrinho de compra
    public void addCarItem(int id, int quantity, Product product) {
        this.carItens.add(new CarItem(id, quantity, product));

    }

    public void calculateTotalPrice() {
        float total = 0;

        for (CarItem carItem : carItens) {
            total += carItem.getProduct().getPrice() * carItem.getQuantity();
        }

        this.total = total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", date=" + date +
                ", destino='" + destino + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", total=" + total +
                ", carItens=" + carItens +
                '}';
    }
}
