package com.oneeateries.service;

import com.oneeateries.Model.Corporation;
import com.oneeateries.Repositories.CorporationsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CorporationService {
    private final CorporationsRepository corporationsRepository;

    public List<Corporation> getAllCorporation(){
        return corporationsRepository.findAll();
    }

    public Corporation getCorporationByID(String corporationId){
        return corporationsRepository.findCorporationByCorporationId(corporationId);
    }
    public void addCorporation(Corporation corporation){
        corporationsRepository.save(corporation);
    }
}
