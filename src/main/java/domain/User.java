package domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String imagePath;

    @JsonBackReference
    @ManyToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "participants")
    private Set<Meal> meals = new HashSet<>();

    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    @JsonManagedReference
    @ManyToMany(cascade = javax.persistence.CascadeType.ALL)
    Set<Ingredient> foodRestrictions = new HashSet<>();

    public void setFoodRestrictions(Set<Ingredient> foodRestrictions) {
        this.foodRestrictions = foodRestrictions;
    }

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
