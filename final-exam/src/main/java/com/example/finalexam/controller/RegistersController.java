package com.example.finalexam.controller;

import com.example.finalexam.domain.model.Register;
import com.example.finalexam.domain.service.RegisterService;
import com.example.finalexam.resource.SaveRegisterResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RegistersController {
    @Autowired
    private RegisterService registerService;

    @Operation(summary = "Get All Registers", description = "Get All Registers", tags = {"Registers"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Registers returned", content = @Content(mediaType =
            "application/json"))
    })
    @GetMapping("/registers")
    public ResponseEntity<List<Register>> getAllRegisters(){
        try {
            return new ResponseEntity<>(registerService.getAllRegisters(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Get All Registers by Request", description = "Get All Registers by Request", tags = {"Registers"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Request Registers returned", content = @Content(mediaType =
                    "application/json"))
    })
    @GetMapping("/registers/request/{requestId}")
    public ResponseEntity<List<Register>> getAllRegistersByRequestId(@PathVariable(name = "requestId") Long requestId){
        try {
            return new ResponseEntity<>(registerService.getAllRegistersByRequestId(requestId), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Get All Registers by Hotel", description = "Get All Registers by Hotel", tags = {"Registers"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Hotel Registers returned", content = @Content(mediaType =
                    "application/json"))
    })
    @GetMapping("/registers/hotel/{hotelName}")
    public ResponseEntity<List<Register>> getAllRegistersByHotelName(@PathVariable(name = "hotelName") String hotelName){
        try {
            return new ResponseEntity<>(registerService.getAllRegistersByHotelName(hotelName), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Create Register", description = "Create an Register", tags = {"Registers"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Register cretaed", content = @Content(mediaType =
                    "application/json"))
    })
    @PostMapping("/inscriptions")
    public ResponseEntity<?> createRegister(@Valid @RequestBody SaveRegisterResource resource){
        try {
            return new ResponseEntity<>(registerService.createRegister(resource), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
