package com.waracle.cakemgr.cakemanagercleint.service;


import com.waracle.cakemgr.cakemanager.api.cleint.CakeManagerApi;
import com.waracle.cakemgr.cakemanager.api.cleint.model.Cake;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CakeMangerClientService {
    private final CakeManagerApi cakeManagerApi;

    public List<Cake> getCakeByEmployeeId(String employeeId) {
        return cakeManagerApi.listCakesByEmployeeId(employeeId);
    }

    public List<Cake> getAllCakes() {
        return cakeManagerApi.listCakes();
    }

    public void addCake(Cake cake) {
        cakeManagerApi.cakesPost(cake);
    }
}
