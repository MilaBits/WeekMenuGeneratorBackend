package dal;

import domain.Meal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class MealActions extends DataContext {

    public Meal get(int id) {
        EntityManager em = getEntityManager;

        TypedQuery<Meal> query = em.createQuery("select m from Meal m where m.id = " + id, Meal.class);

        return query.getSingleResult();
    }

    public ArrayList<Meal> getAll() {
        EntityManager em = getEntityManager;

        TypedQuery<Meal> query = em.createQuery("select m from Meal m", Meal.class);

        return new ArrayList<Meal>(query.getResultList());
    }

    public Meal updateUsers(long id, Meal meal) {
        EntityManager em = getEntityManager;

        Meal existingMeal = em.getReference(Meal.class, id);

        em.getTransaction().begin();
        existingMeal.setParticipants(meal.getParticipants()); // not detected automatically
//        JDOHelper.makeDirty(employee, "projects"); // reported as dirty
        em.getTransaction().commit();

        return existingMeal;
    }
}
