package domain;

import java.util.ArrayList;

public class Recipe {

    public String name;
    public String description;
    public ArrayList<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(String name, String description, ArrayList<Ingredient> ingredients) {

        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }
}
