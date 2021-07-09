/*
 * Project Name-   OneEateries
 * Project Author- rakshitsaini
 * Date- 03/06/21_1:02 AM
 * Description-
 */
package com.oneeateries.controllers;

import com.oneeateries.Model.Corporation;
import com.oneeateries.service.CorporationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/corporation")
@AllArgsConstructor
public class CorporationsController {
    private final CorporationService corporationService;
    @GetMapping("/")
    public ResponseEntity<List<Corporation>> getAllCorporation(){
        return ResponseEntity.ok(corporationService.getAllCorporation());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Corporation> getCorporationById(@PathVariable("id")String id){
        return ResponseEntity.ok(corporationService.getCorporationByID(id));
    }

    @PostMapping("/")
    public ResponseEntity<Void> addCorporation(@Validated @RequestBody Corporation corporation){
        corporationService.addCorporation(corporation);
        return  ResponseEntity.ok().build();
    }
}
