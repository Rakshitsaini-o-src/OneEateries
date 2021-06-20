package com.oneeateries.Repositories;

import com.oneeateries.Model.Corporation;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface CorporationsRepository extends MongoRepository<Corporation,String> {
    Corporation findCorporationByCorporationId(String _id);
}
