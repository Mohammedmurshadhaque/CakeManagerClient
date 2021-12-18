package com.waracle.cakemgr.cakemanagercleint.controller;

import com.waracle.cakemgr.cakemanager.api.cleint.model.Cake;
import com.waracle.cakemgr.cakemanagercleint.service.CakeMangerClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CakeManagerClientController {

    private final CakeMangerClientService cakeMangerClientService;

    @GetMapping("/cakes/{employeeId}")
    public ResponseEntity<List<Cake>> listCakesByEmployeeId(@PathVariable("employeeId") String employeeId) {
        return new ResponseEntity(cakeMangerClientService.getCakeByEmployeeId(employeeId), HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Cake>> listCakes() {
        return new ResponseEntity(cakeMangerClientService.getAllCakes(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/cakes")
    public ResponseEntity<Void> cakesPost(@RequestBody Cake cake) {
        cakeMangerClientService.addCake(cake);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
