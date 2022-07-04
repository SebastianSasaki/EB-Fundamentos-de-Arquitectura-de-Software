package com.example.finalexam.service;

import com.example.finalexam.domain.model.Register;
import com.example.finalexam.domain.repository.RegisterRepository;
import com.example.finalexam.domain.service.RegisterService;
import com.example.finalexam.exception.ResourceNotFoundException;
import com.example.finalexam.resource.SaveRegisterResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public List<Register> getAllRegisters() {return registerRepository.findAll();}

    @Override
    public List<Register> getAllRegistersByRequestId(Long requestId) {
        return registerRepository.findByRequestId(requestId);
    }

    @Override
    public List<Register> getAllRegistersByHotelName(String hotelName) {
        return registerRepository.findByHotelName(hotelName);
    }

    @Override
    public Register createRegister(SaveRegisterResource resource) {
        Register newRegister = new Register(
                resource.getRequestId(),
                resource.getHotelName(),
                resource.getInitialDate(),
                resource.getFinalDate(),
                resource.getTotalCost()
        );
        if(registerRepository.existsRegistersByRequestIdAndHotelName(newRegister.getRequestId(), newRegister.getHotelName()))
            throw new ResourceNotFoundException("El usuario ya se ha registrado en ese hotel");
        return registerRepository.save(newRegister);
    }
}
