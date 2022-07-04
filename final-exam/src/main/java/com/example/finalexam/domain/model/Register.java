package com.example.finalexam.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "registers")
public class Register implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private long requestId;

    @Column(nullable = false, length = 150)
    private String hotelName;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar initialDate;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar finalDate;

    @Column(nullable = false)
    private Float totalCost;

    public Register() {}

    public Register(Long id, Long requestId, String hotelName, Calendar initialDate, Calendar finalDate, Float totalCost) {
        this.id = id;
        this.requestId = requestId;
        this.hotelName = hotelName;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.totalCost = totalCost;
    }
    public Register(Long requestId, String hotelName, Calendar initialDate, Calendar finalDate, Float totalCost) {
        this.requestId = requestId;
        this.hotelName = hotelName;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.totalCost = totalCost;
    }

    public Long getId() {
        return id;
    }
    public Register setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRequestId() {
        return requestId;
    }
    public Register setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getHotelName() {
        return hotelName;
    }
    public Register setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public Calendar getInitialDate() {
        return initialDate;
    }
    public Register setInitialDate(Calendar initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    public Calendar getFinalDate() {
        return finalDate;
    }
    public Register setFinalDate(Calendar finalDate) {
        this.finalDate = finalDate;
        return this;
    }

    public Float getTotalCost() {return totalCost;}
    public Register setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
        return this;
    }
}
