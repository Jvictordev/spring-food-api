package dev.aula.fiasco.Projeto.de.Aprendizado.model;

// anotation
// entidade
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime expirationDate;
    private Integer quantity;

    public Food() {

    }

    public Food(Long id, String name, Integer quantity, LocalDateTime expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
