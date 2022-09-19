package com.store.model;

import java.util.Date;
import java.util.List;

public class Sale {
    private final String serialSale;
    private Date dateOfSale;
    private Client client;
    private List<Product> products;

    public Sale(String serialSale, Date dateOfSale, Client client, List<Product> products) {
        this.serialSale = serialSale;
        this.dateOfSale = dateOfSale;
        this.client = client;
        this.products = products;
    }

    public String getSerialSale() {
        return serialSale;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "serialSale='" + serialSale + '\'' +
                ", dateOfSale=" + dateOfSale +
                ", client=" + client +
                ", products=" + products +
                '}';
    }
}
