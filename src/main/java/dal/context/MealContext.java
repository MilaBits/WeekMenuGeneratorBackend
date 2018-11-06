package dal.context;

import domain.Meal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class MealContext extends DataContext implements IDataContext<Meal> {

    @Override
    public Meal get(int id) {
        EntityManager em = getEntityManager;

        TypedQuery<Meal> query = em.createQuery("select m from Meal m where m.id = " + id, Meal.class);

        return query.getSingleResult();
    }

    @Override
    public ArrayList<Meal> getAll() {
        EntityManager em = getEntityManager;

        TypedQuery<Meal> query = em.createQuery("select m from Meal m", Meal.class);

        return new ArrayList<Meal>(query.getResultList());
    }

    @Override
    public Meal post() {
        return null;
    }

    @Override
    public Meal put() {
        return null;
    }

    @Override
    public Meal delete() {
        return null;
    }
}
