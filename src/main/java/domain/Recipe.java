package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    public Long id;

    public String name;
    public String description;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "recipe_ingredient",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    public Set<Ingredient> ingredients = new HashSet<>();

    public Recipe() {
    }

    public Recipe(String name, String description, Set<Ingredient> ingredients) {

        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }
}
