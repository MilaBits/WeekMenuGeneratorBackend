package dal;

import domain.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class IngredientActions extends DataContext {

    public Ingredient get(int id) {
        EntityManager em = getEntityManager;

        TypedQuery<Ingredient> query = em.createQuery("select i from Ingredient i where i.id = " + id, Ingredient.class);

        return query.getSingleResult();
    }

    public ArrayList<Ingredient> getAll() {
        EntityManager em = getEntityManager;

        TypedQuery<Ingredient> query = em.createQuery("select i from Ingredient i", Ingredient.class);

        return new ArrayList<Ingredient>(query.getResultList());
    }

    public Ingredient post() {
        return null;
    }

    public Ingredient put() {
        return null;
    }

    public Ingredient delete() {
        return null;
    }
}
