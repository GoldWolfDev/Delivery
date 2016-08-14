package ru.delivery.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_opertion")
    private int id_opertion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_operation")
    private Order id_order;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_currency")
    private Set<Currency> id_currency = new HashSet<Currency>();

    @Column(name = "Date")
    private Date operation_date;

    @Column(name = "Sum_Price")
    private double sum_price;

    //getter and setter


    public int getId_opertion() {
        return id_opertion;
    }

    public void setId_opertion(int id_opertion) {
        this.id_opertion = id_opertion;
    }

    public Order getId_order() {
        return id_order;
    }

    public void setId_order(Order id_order) {
        this.id_order = id_order;
    }

    public Set<Currency> getId_currency() {
        return id_currency;
    }

    public void setId_currency(Set<Currency> id_currency) {
        this.id_currency = id_currency;
    }

    public Date getOperation_date() {
        return operation_date;
    }

    public void setOperation_date(Date operation_date) {
        this.operation_date = operation_date;
    }

    public double getSum_price() {
        return sum_price;
    }

    public void setSum_price(double sum_price) {
        this.sum_price = sum_price;
    }
}
