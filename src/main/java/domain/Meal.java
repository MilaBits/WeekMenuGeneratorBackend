package domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Temporal(TemporalType.DATE)
    public Date date;

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    @JsonManagedReference
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<User> participants = new HashSet<>();

    public void setParticipants(Collection<User> participants) {
        this.participants = new HashSet<>(participants);
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    @OneToOne(cascade = CascadeType.ALL)
    Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Meal() {
    }

    public Meal(Date date, Set<User> participants, Recipe recipe) {

        this.date = date;
        this.participants = participants;
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal)) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id) &&
                Objects.equals(date, meal.date) &&
                Objects.equals(participants, meal.participants) &&
                Objects.equals(recipe, meal.recipe);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, participants, recipe);
    }
}
