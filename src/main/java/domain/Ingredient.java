package domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "foodRestrictions")
    private Set<User> users = new HashSet<>();

    public void setUsers(Collection<User> users) {
        this.users = new HashSet<>(users);
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "ingredients")
    private Set<Recipe> recipes = new HashSet<>();

    public void setRecipes(Collection<Recipe> recipes) {
        this.recipes = new HashSet<>(recipes);
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String name;
    public double amount;
    public String unit;

    public Ingredient() {
    }

    public Ingredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public void addUser(User user) {
        users.add(user);
        user.getFoodRestrictions().add(this);
    }

    public void removeUser(User tag) {
        users.remove(tag);
        tag.getFoodRestrictions().remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        return id != null && id.equals(((User) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

}
