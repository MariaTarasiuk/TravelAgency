package com.tarasiuk.projects.travel_agency.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "travel")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "price", unique = false, nullable = false)
    private double price;

    @Column(name = "country", unique = false, nullable = false)
    private String counttry;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_hostel", unique = true, nullable = false)
    private Hostel hostel;

    @OneToMany
    //@JoinColumn(name = "id_excurcion", unique = true, nullable = false)
    private List<Excurcion> excurcion;

    @Column(name = "continuance", unique = false, nullable = false)
    private int continuance;

    @Column(name = "type", unique = false, nullable = false)
    private String type;

    @Column(name = "date")
    LocalDate date;

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCounttry() {
        return counttry;
    }

    public void setCounttry(String counttry) {
        this.counttry = counttry;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    public List<Excurcion> getExcurcion() {
        return excurcion;
    }

    public void setExcurcion(List<Excurcion> excurcion) {
        this.excurcion = excurcion;
    }

    public int getContinuance() {
        return continuance;
    }

    public void setContinuance(int continuance) {
        this.continuance = continuance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
