/**
  Project Name-   oneeateries
  Project Author- rakshitsaini
  Date- 01/05/21_9:52 PM
  Description- For database Connection and methods
 **/
package com.example.oneeateries.Repositories;

import com.example.oneeateries.Model.Restaurant;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantsRepository {

    //List of Restaurant
    public List<Restaurant> restaurantList = new ArrayList<>();

    //Adding Restaurant to the list
    public String addRestaurant(Restaurant restaurant){
        //a unique 24-byte hexadecimal string
        restaurant.set_restaurantId(ObjectId.get().toHexString());
        //a unique 24-byte hexadecimal string
        restaurant.set_menuId(ObjectId.get().toHexString());
        for(var i:restaurant.getMenuItem()){
            //a unique 24-byte hexadecimal string
            i.set_itemID(ObjectId.get().toHexString());
        }
        restaurantList.add(restaurant);
        return restaurant.toString();
    }
}
