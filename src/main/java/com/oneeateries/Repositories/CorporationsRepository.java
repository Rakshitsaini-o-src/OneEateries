package com.oneeateries.Repositories;

import com.oneeateries.Model.Corporation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CorporationsRepository extends MongoRepository<Corporation,String>{
    Corporation findCorporationByCorporationId(String _id);
}
