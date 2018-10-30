package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    public Long id;

    @ManyToMany(mappedBy = "foodRestrictions")
    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "ingredients")
    private Set<Recipe> recipes = new HashSet<>();

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
