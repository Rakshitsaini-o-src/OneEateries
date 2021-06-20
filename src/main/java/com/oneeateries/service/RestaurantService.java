package com.oneeateries.service;

import java.util.List;

import com.oneeateries.Model.MenuItem;
import com.oneeateries.Model.Restaurant;
import com.oneeateries.Repositories.RestaurantsRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RestaurantService {
    private final RestaurantsRepository restaurantsRepository;

    public List<Restaurant> getAllRestaurant(){
        return restaurantsRepository.findAll();
    }

    public void addRestaurant(Restaurant restaurant){
        for(var menuItem: restaurant.getMenuItem()){
            menuItem.setItemID(ObjectId.get().toHexString());
        }
        restaurantsRepository.save(restaurant);
    }
    
    public List<MenuItem> getAllMenuItems(String restuarantID){
        Restaurant restaurant= restaurantsRepository.getRestaurantByRestaurantId(restuarantID);
        return restaurant.getMenuItem();
    }

    public void addMenuItems(String restaurantID,List<MenuItem> menuItems){
        Restaurant restaurant = restaurantsRepository.getRestaurantByRestaurantId(restaurantID);
        for(var menuItem: menuItems){
            menuItem.setItemID(ObjectId.get().toHexString());
            restaurant.getMenuItem().add(menuItem);
        }
    }
    
}