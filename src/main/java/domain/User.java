package domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    public Long id;

    public String name;
    public String imagePath;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "user_ingredient",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    public Set<Ingredient> foodRestrictions = new HashSet<>();

    public Set<Ingredient> getFoodRestrictions() {
        return foodRestrictions;
    }

    public User() {
    }

    public User(String name, String imagePath, Set<Ingredient> foodRestrictions) {

        this.name = name;
        this.imagePath = imagePath;
        this.foodRestrictions = foodRestrictions;
    }
}
