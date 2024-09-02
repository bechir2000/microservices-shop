package com.microservices.inventory_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.inventory_service.service.InventoryService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus; 

@RestController
@RequiredArgsConstructor
public class InventoryController {
    
        private final InventoryService inventoryService;
    
        @GetMapping
        @RequestMapping("/api/inventory")
        @ResponseStatus(HttpStatus.OK)
        public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
            return inventoryService.isInStock(skuCode, quantity);
        }
}
