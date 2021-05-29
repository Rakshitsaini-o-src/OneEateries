/**
  Project Name-   oneeateries
  Project Author- rakshitsaini
  Date- 01/05/21_9:52 PM
  Description- For database Connection and methods
 **/
package com.oneeateries.Repositories;

import com.oneeateries.Model.MenuItem;
import com.oneeateries.Model.Restaurant;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantsRepository {
    //List of Restaurant
    public List<Restaurant> restaurantList = new ArrayList<>();
    //Adding Restaurant to the list
    public String addRestaurant(Restaurant restaurant){
        //a unique 24-byte hexadecimal string
        restaurant.setRestaurantId(ObjectId.get().toHexString());
        //a unique 24-byte hexadecimal string
        restaurant.setMenuId(ObjectId.get().toHexString());
        for(var i:restaurant.getMenuItem()){
            //a unique 24-byte hexadecimal string
            i.setItemID(ObjectId.get().toHexString());
        }
        restaurantList.add(restaurant);
        return restaurant.toString();
    }
    //Adding MenuItems to the Required Restaurant
    public String addMenu(String restaurantID,List<MenuItem> menuItems){
        Restaurant restaurant = restaurantById(restaurantID);
        for(var menuItem:menuItems){
            menuItem.setItemID(ObjectId.get().toHexString());
            restaurant.getMenuItem().add(menuItem);
        }
        return restaurant.toString();
    }
    //get menuItems of required Restaurant
    public List<MenuItem> getMenu(String restaurantID){
        Restaurant restaurant = restaurantById(restaurantID);
        return restaurant.getMenuItem();
    }
    //Get Restaurant by ID
    public Restaurant restaurantById(String restaurantID){
        return restaurantList
                .stream()                                                    //Need for processing data
                .filter(res -> res.getRestaurantId().equals(restaurantID))// Filtering a restaurant using id
                .collect(Collectors.toList()).get(0);                       // used to process stream
    }
}
