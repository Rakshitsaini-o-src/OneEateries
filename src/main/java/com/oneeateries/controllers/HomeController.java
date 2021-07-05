package com.oneeateries.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RequestMapping("/")
@RestController
class HomeController{
    @Value("${server.serverName}")
    private String serverName;
    @GetMapping("")
    public ResponseEntity<String> getHomePage(){
        System.out.println(serverName);
        return ResponseEntity.ok(serverName);
    }


}