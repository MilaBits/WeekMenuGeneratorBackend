package domain;

import java.util.ArrayList;

public class User {

    public String name;
    public String imagePath;
    public ArrayList<Ingredient> foodRestrictions;

    public User() {
    }

    public User(String name, String imagePath, ArrayList<Ingredient> foodRestrictions) {

        this.name = name;
        this.imagePath = imagePath;
        this.foodRestrictions = foodRestrictions;
    }
}
