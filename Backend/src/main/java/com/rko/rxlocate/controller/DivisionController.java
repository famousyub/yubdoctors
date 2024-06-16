package com.rko.rxlocate.controller;

import com.rko.rxlocate.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/division")
//@RequiredArgsConstructor
public class DivisionController {

    private final DivisionService divisionService;


    @Autowired
    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @GetMapping("/list")
    public ResponseEntity<?> getAllDivisions() {
        return new ResponseEntity<>(divisionService.getAllDivisions(), HttpStatus.OK);
    }
}
