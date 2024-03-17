package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static Bank instance;
    private String name;
    private List<Product> bankProducts;

    private Bank() {
        this.bankProducts = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getBankProducts() {
        return bankProducts;
    }

    public void setBankProducts(List<Product> bankProducts) {
        this.bankProducts = bankProducts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bankProducts=" + bankProducts +
                '}';
    }
}
