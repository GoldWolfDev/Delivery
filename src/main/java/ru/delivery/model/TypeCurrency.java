package ru.delivery.model;


import javax.persistence.*;

@Entity
@Table(name = "TypeCurrency")
public class TypeCurrency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_type")
    private int id_type;

    @Column(name = "Name")
    private String name_type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_currency")
    private Currency id_currency;

    //getter and setter


    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    public Currency getId_currency() {
        return id_currency;
    }

    public void setId_currency(Currency id_currency) {
        this.id_currency = id_currency;
    }
}
