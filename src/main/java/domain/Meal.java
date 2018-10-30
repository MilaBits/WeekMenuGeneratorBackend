package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Meal {

    @Id
    public Long id;

    public Date date;
    public Set<User> participants = new HashSet<>();
    public Recipe recipe;

    public Meal() {
    }

    public Meal(Date date, Set<User> participants, Recipe recipe) {

        this.date = date;
        this.participants = participants;
        this.recipe = recipe;
    }
}
