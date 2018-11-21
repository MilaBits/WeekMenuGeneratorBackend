package dal.context;

import domain.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class IngredientContext extends DataContext implements IDataContext<Ingredient> {

    @Override
    public Ingredient get(int id) {
        EntityManager em = getEntityManager;

        TypedQuery<Ingredient> query = em.createQuery("select i from Ingredient i where i.id = " + id, Ingredient.class);

        return query.getSingleResult();
    }

    @Override
    public ArrayList<Ingredient> getAll() {
        EntityManager em = getEntityManager;

        TypedQuery<Ingredient> query = em.createQuery("select i from Ingredient i", Ingredient.class);

        return new ArrayList<Ingredient>(query.getResultList());
    }

    @Override
    public Ingredient post() {
        return null;
    }

    @Override
    public Ingredient put() {
        return null;
    }

    @Override
    public Ingredient delete() {
        return null;
    }
}
