package com.example.finalexam.domain.service;

import com.example.finalexam.domain.model.Register;
import com.example.finalexam.resource.SaveRegisterResource;

import java.util.List;

public interface RegisterService {
    List<Register> getAllRegisters();
    List<Register> getAllRegistersByRequestId(Long requestId);
    List<Register> getAllRegistersByHotelName(String hotelName);
    Register createRegister(SaveRegisterResource resource);
}
