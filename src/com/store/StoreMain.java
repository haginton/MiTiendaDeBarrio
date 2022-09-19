package com.store;

import com.store.model.Client;
import com.store.model.Product;
import com.store.model.Sale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreMain {
    public static void main(String[] args) {
        Client client1 = new Client(
                "12345677",
                "Pepito Perez",
                "1234567898",
                "pepe@email.com");

        Client client2 = new Client(
                "789556122",
                "Juan Ramos",
                "987654123",
                "pepe@email.com");

        Product product1 = new Product(
                "P1",
                "Leche Entera Alpina",
                "Bolsa x 1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3100.0
        );

        Product product2 = new Product(
                "P2",
                "Leche Alpina Deslactosada",
                "Bolsa x 1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3400.0
        );

        Sale sale1 = new Sale(
                "S1",
                new Date(),
                client1,
                new ArrayList<Product>()
        );
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        sale1.setProducts(products);

        System.out.println(sale1);

    }
}
