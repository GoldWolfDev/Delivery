package ru.delivery.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private int id_product;

    @Column(name = "Name")
    private String name_product;

    @Column(name = "Final_Price")
    private double final_price_product;

    @Column(name = "Price")
    private double price_product;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_category")
    private Set<Category> id_category = new HashSet<Category>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Order order;


    //getter and setter


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getFinal_price_product() {
        return final_price_product;
    }

    public void setFinal_price_product(double final_price_product) {
        this.final_price_product = final_price_product;
    }

    public double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(double price_product) {
        this.price_product = price_product;
    }

    public Set<Category> getId_category() {
        return id_category;
    }

    public void setId_category(Set<Category> id_category) {
        this.id_category = id_category;
    }
}
