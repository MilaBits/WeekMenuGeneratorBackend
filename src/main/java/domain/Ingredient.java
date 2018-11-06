package domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToMany(mappedBy = "foodRestrictions")
    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @ManyToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "ingredients")
    private Set<Recipe> recipes = new HashSet<>();

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String name;
    public int amount;

    public Ingredient() {
    }

    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
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
