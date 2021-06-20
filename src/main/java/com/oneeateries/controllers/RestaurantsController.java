/**
 * Project Name-   oneEateries
 * Project Author- rakshitsaini
 * Date- 01/05/21_9:48 PM
 * Description- Mapping url to a function
 **/
package com.oneeateries.controllers;

import com.oneeateries.Model.MenuItem;
import com.oneeateries.Model.Restaurant;
import com.oneeateries.service.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/restaurant/")
@AllArgsConstructor
public class RestaurantsController {
    private final RestaurantService restaurantService;

    @GetMapping("/")
    public ResponseEntity<List<Restaurant>> getAllRestaurant(){
        return ResponseEntity.ok(restaurantService.getAllRestaurant());
    }
    @PostMapping("/")
    public ResponseEntity<Void> addRestaurant(@Validated @RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/menu/")
    public ResponseEntity<List<MenuItem>> getAllMenuItem(@PathVariable("id")String restaurantId){
        return ResponseEntity.ok(restaurantService.getAllMenuItems(restaurantId));
    }

    @PostMapping("/{id}/menu/")
    public ResponseEntity<Void> addMenu(@PathVariable("id")String restaurantId, @Validated @RequestBody List<MenuItem> menuItems){
        restaurantService.addMenuItems(restaurantId,menuItems);
        return ResponseEntity.ok().build();
    }
}
