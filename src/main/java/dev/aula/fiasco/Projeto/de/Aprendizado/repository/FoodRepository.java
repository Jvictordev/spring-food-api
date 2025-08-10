package dev.aula.fiasco.Projeto.de.Aprendizado.repository;


import dev.aula.fiasco.Projeto.de.Aprendizado.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

// é preciso passar para o JpaRepository<Model, identificador(tipo)>
public interface FoodRepository extends JpaRepository<Food, Long> {
    // aqui ele extend a class do JpaRepository onde vem todo o crud
    // get, getAll, getById ...
}
