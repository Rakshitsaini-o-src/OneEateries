/**
  Project Name-   oneeateries
  Project Author- rakshitsaini
  Date- 01/05/21_9:52 PM
  Description- For database Connection and methods
 **/
package com.oneeateries.Repositories;

import com.oneeateries.Model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantsRepository extends MongoRepository<Restaurant,String> {
    Restaurant getRestaurantByRestaurantId(String id);
}
