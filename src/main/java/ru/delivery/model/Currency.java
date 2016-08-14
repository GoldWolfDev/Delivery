package ru.delivery.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Operation")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_currency")
    private int id_currency;

    @Column(name = "Name")
    private String name_carrency;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_type_currency")
    private Set<TypeCurrency> id_type_currency = new HashSet<TypeCurrency>();

    //getter and setter


    public int getId_currency() {
        return id_currency;
    }

    public void setId_currency(int id_currency) {
        this.id_currency = id_currency;
    }

    public String getName_carrency() {
        return name_carrency;
    }

    public void setName_carrency(String name_carrency) {
        this.name_carrency = name_carrency;
    }

    public Set<TypeCurrency> getId_type_currency() {
        return id_type_currency;
    }

    public void setId_type_currency(Set<TypeCurrency> id_type_currency) {
        this.id_type_currency = id_type_currency;
    }
}
