package domain;

import java.util.ArrayList;
import java.util.Date;

public class Meal {

    public Date date;
    public ArrayList<User> participants;
    public Recipe recipe;

    public Meal() {
    }

    public Meal(Date date, ArrayList<User> participants, Recipe recipe) {

        this.date = date;
        this.participants = participants;
        this.recipe = recipe;
    }
}
