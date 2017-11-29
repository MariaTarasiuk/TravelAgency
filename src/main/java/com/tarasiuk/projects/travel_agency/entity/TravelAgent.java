package com.tarasiuk.projects.travel_agency.entity;


import javax.persistence.*;

@Entity
@Table(name = "travel_agent")
public class TravelAgent  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fullname", unique = true, nullable = false)
    private String fullname;

    @Column(name = "earnings_percent", unique = true, nullable = false)
    private int earningsPercent;

    public long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getEarnings_percent() {
        return earningsPercent;
    }

    public void setEarnings_percent(int earnings_percent) {
        this.earningsPercent = earnings_percent;
    }
}
