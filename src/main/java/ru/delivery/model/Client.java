package ru.delivery.model;

import javax.persistence.*;

@Entity
@Table(name = "Operation")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client")
    private int id_client;

    @Column(name = "First_Name")
    private String first_name;

    @Column(name = "Last_Name")
    private String last_name;

    @Column(name = "Phone")
    private String phone_client;

    @Column(name = "Address")
    private String address_client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Order id_order;

    //getter and setter

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_client() {
        return phone_client;
    }

    public void setPhone_client(String phone_client) {
        this.phone_client = phone_client;
    }

    public String getAddress_client() {
        return address_client;
    }

    public void setAddress_client(String address_client) {
        this.address_client = address_client;
    }

    public Order getId_order() {
        return id_order;
    }

    public void setId_order(Order id_order) {
        this.id_order = id_order;
    }
}
