/*
 * Project Name-   OneEateries
 * Project Author- rakshitsaini
 * Date- 03/06/21_1:02 AM
 * Description-
 */
package com.oneeateries.controllers;

import com.oneeateries.Model.Corporation;
import com.oneeateries.Repositories.CorporationsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/corporation")
public class CorporationsController {
    @Autowired
    private CorporationsRepository corporationsRepository;
    @GetMapping("/")
    public List<Corporation> getAllCorporation(){
        log.info(corporationsRepository.corporationList.toString());
        return corporationsRepository.corporationList;
    }

    @GetMapping("/{id}")
    public Corporation getCorporationById(@PathVariable("id")String id){
        Corporation corporation = corporationsRepository.getCorporationById(id);
        log.info(corporation.toString());
        return corporation;
    }

    @PostMapping("/")
    public String addCorporation(@Validated @RequestBody Corporation corporation){
        corporationsRepository.addCorporation(corporation);
        log.info(corporation.toString());
        return corporation.toString();
    }
}
