package com.oneeateries.service;

import com.oneeateries.Model.Corporation;
import com.oneeateries.Repositories.CorporationsRepository;
import lombok.AllArgsConstructor;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CorporationService {
    private final CorporationsRepository corporationsRepository;

    public List<Corporation> getAllCorporation(){
        return corporationsRepository.findAll();
    }
    @Cacheable(value = "Corporation", key = "#corporationId")
    public Corporation getCorporationByID(String corporationId){
        Corporation corporation = corporationsRepository.findCorporationByCorporationId(corporationId);
        return corporation;
    }
    public void addCorporation(Corporation corporation){
        corporationsRepository.save(corporation);
    }
}
