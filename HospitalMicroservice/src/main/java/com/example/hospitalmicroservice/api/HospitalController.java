package com.example.hospitalmicroservice.api;

import com.example.hospitalmicroservice.dto.Hospital;
import com.example.hospitalmicroservice.restClient.HospitalFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feign")
public class HospitalController {

    @Autowired
    private HospitalFeignClient hospitalFeignClient;

    private final Logger logger = LoggerFactory.getLogger(HospitalController.class);

// Api endpoint method to get all the nurses data
    @GetMapping(value = "/getNurses")
    public List<Hospital> getAllNurses(){
        logger.info("Fetching nurse data from server");
       return hospitalFeignClient.getAllNurses();
    }

//    Api endpoint method to get the nurses data by first name
    @GetMapping("/getNurseByFirstName/{firstName}")
    public Optional<Hospital> getNurseByFirstName(@PathVariable String firstName){
        logger.info("Getting nurse data by first name");
        return hospitalFeignClient.getNurseByFirstName(firstName);
    }

    // Api endpoint method to save the nurses data
    @PostMapping("/saveNurse")
    public ResponseEntity<String> saveNurse(@RequestBody Hospital hospital){
        hospitalFeignClient.saveNurse(hospital);
        return ResponseEntity.status(200).body("Nurse data has been saved");
    }
}
