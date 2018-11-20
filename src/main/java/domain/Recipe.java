package domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    @Column(length = 10000)
    public String description;

    @JsonManagedReference
    @ManyToMany(cascade = javax.persistence.CascadeType.ALL)
    Set<Ingredient> ingredients = new HashSet<>();

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe() {
    }

    public Recipe(String name, String description, Set<Ingredient> ingredients) {

        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }
}
