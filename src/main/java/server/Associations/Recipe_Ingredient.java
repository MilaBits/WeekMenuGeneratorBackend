package server.Associations;

import javax.persistence.Entity;

@Entity
public class Recipe_Ingredient {
    public Long recipe_id;
    public Long ingredient_id;
}
