package com.example.finalexam.resource;

import com.example.finalexam.domain.model.Register;

import java.util.Calendar;

public class SaveRegisterResource {
    private long requestId;
    private String hotelName;
    private Calendar initialDate;
    private Calendar finalDate;
    private Float totalCost;

    public Long getRequestId() {
        return requestId;
    }
    public SaveRegisterResource setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getHotelName() {
        return hotelName;
    }
    public SaveRegisterResource setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public Calendar getInitialDate() {
        return initialDate;
    }
    public SaveRegisterResource setInitialDate(Calendar initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    public Calendar getFinalDate() {
        return finalDate;
    }
    public SaveRegisterResource setFinalDate(Calendar finalDate) {
        this.finalDate = finalDate;
        return this;
    }

    public Float getTotalCost() {return totalCost;}
    public SaveRegisterResource setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
        return this;
    }
}
