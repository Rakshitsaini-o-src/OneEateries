/*
 * Project Name-   OneEateries
 * Project Author- rakshitsaini
 * Date- 03/06/21_12:53 AM
 * Description-
 */
package com.oneeateries.Repositories;

import com.oneeateries.Model.Corporation;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CorporationsRepository {
    public List<Corporation> corporationList = new ArrayList<>();

    public void addCorporation(Corporation corporation){
        corporation.setCorporationId(ObjectId.get().toHexString());
        corporationList.add(corporation);
    }

    public Corporation getCorporationById(String corporationId){
        return corporationList
                .stream()
                .filter(corp -> corp.getCorporationId().equals(corporationId))
                .collect(Collectors.toList()).get(0);
    }
}
