package dev.aula.fiasco.Projeto.de.Aprendizado.controller;

import dev.aula.fiasco.Projeto.de.Aprendizado.model.Food;
import dev.aula.fiasco.Projeto.de.Aprendizado.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    // injecao de dependencia

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        foodService.delete(id);
    }

}
