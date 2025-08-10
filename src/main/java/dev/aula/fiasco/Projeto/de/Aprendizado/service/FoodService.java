package dev.aula.fiasco.Projeto.de.Aprendizado.service;

import dev.aula.fiasco.Projeto.de.Aprendizado.model.Food;
import dev.aula.fiasco.Projeto.de.Aprendizado.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    //injetar a dependnecia de repository
    public final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    // listar
    public List<Food> getAll() {
        return foodRepository.findAll();
    }
    // criar
    public Food save(Food food) {
        return foodRepository.save(food);
    }
    // deletar
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }


}
