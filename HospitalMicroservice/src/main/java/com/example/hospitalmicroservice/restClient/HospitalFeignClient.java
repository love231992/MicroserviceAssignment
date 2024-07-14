package com.example.hospitalmicroservice.restClient;

import com.example.hospitalmicroservice.dto.Hospital;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

// Feign client interface to point to SpringMySQL microservice controller request mapping endpoint
@FeignClient(value = "HospitalClient", url = "http://localhost:8080/hospital")
public interface HospitalFeignClient {

//    Abstract method to get all the nurse data
    @GetMapping("/allNurses")
    List<Hospital> getAllNurses();

//    Abstract method to get nurse data by first name
    @GetMapping("/getNurseByFirstName/{firstName}")
    Optional<Hospital> getNurseByFirstName(@PathVariable String firstName);

//   Abstract method to save nurse data
    @PostMapping("/saveNurse")
    ResponseEntity<String> saveNurse(@RequestBody Hospital hospital);
}
