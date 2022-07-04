package com.example.finalexam.domain.repository;

import com.example.finalexam.domain.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegisterRepository extends JpaRepository<Register, Long> {
    List<Register> findByRequestId(Long requestId);
    List<Register> findByHotelName(String hotelName);

    boolean existsRegistersByRequestIdAndHotelName(Long requestId, String hotelName);

}
