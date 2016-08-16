package ru.delivery.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_order")
    private String id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_product")
    private Set<Product> id_product = new HashSet<Product>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_operation")
    private Set<Operation> id_operation = new HashSet<Operation>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_client")
    private Set<Client> id_client = new HashSet<Client>();

    @Column(name = "Count")
    private double count_order;

    //getter and setter


    public Set<Product> getId_product() {
        return id_product;
    }

    public void setId_product(Set<Product> id_product) {
        this.id_product = id_product;
    }

    public Set<Operation> getId_operation() {
        return id_operation;
    }

    public void setId_operation(Set<Operation> id_operation) {
        this.id_operation = id_operation;
    }

    public Set<Client> getId_client() {
        return id_client;
    }

    public void setId_client(Set<Client> id_client) {
        this.id_client = id_client;
    }

    public double getCount_order() {
        return count_order;
    }

    public void setCount_order(double count_order) {
        this.count_order = count_order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
