package com.example.CardapioFit.controller;

import com.example.CardapioFit.food.Food;
import com.example.CardapioFit.food.FoodRepository;
import com.example.CardapioFit.food.FoodRequestDTO;
import com.example.CardapioFit.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){

        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }


    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
