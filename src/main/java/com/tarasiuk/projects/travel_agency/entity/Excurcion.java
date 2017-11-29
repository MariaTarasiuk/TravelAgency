package com.tarasiuk.projects.travel_agency.entity;


import javax.persistence.*;

@Entity
@Table(name = "excurcion")
public class Excurcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "time", unique = false, nullable = false)
    private double time;

    @Column(name = "price", unique = false, nullable = false)
    private double price;

    public long getId() {
        return id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
