/**
 * Project Name-   oneEateries
 * Project Author- rakshitsaini
 * Date- 01/05/21_9:48 PM
 * Description- Mapping url to a function
 **/
package com.oneeateries.controllers;

import com.oneeateries.Model.MenuItem;
import com.oneeateries.Model.Restaurant;
import com.oneeateries.Repositories.RestaurantsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/oneeateries/rest/restaurant/")
public class RestaurantsController {
    @Autowired
    private RestaurantsRepository repository;
    @GetMapping("/")
    public List<Restaurant> getAllRestaurant(){
        log.info(repository.restaurantList.toString());
        return repository.restaurantList;
    }
    @PostMapping("/")
    public void addRestaurant(@Validated @RequestBody Restaurant restaurant){
        log.info(repository.addRestaurant(restaurant));
    }

    @GetMapping("/{id}/menu/")
    public List<MenuItem> getAllMenuItem(@PathVariable("id")String restaurantId){
        List<MenuItem> menus = repository.getMenu(restaurantId);
        log.info(menus.toString());
        return menus;
    }

    @PostMapping("/{id}/menu/")
    public void addMenu(@PathVariable("id")String restaurantId, @Validated @RequestBody List<MenuItem> menuItems){
        log.info(repository.addMenu(restaurantId,menuItems));
    }
}
