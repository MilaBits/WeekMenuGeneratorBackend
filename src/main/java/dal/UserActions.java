package dal;

import domain.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class UserActions extends DataContext {
    public User get(int id) {
        EntityManager em = getEntityManager;

        TypedQuery<User> query = em.createQuery("select u from User u where u.id = " + id, User.class);

        return query.getSingleResult();
    }

    public ArrayList<User> getAll() {
        EntityManager em = getEntityManager;

        TypedQuery<User> query = em.createQuery("select u from User u", User.class);

        return new ArrayList<User>(query.getResultList());
    }

    public User updateFoodPrefs(long id, User user) {

        EntityManager em = getEntityManager;

        User existingUser = em.getReference(User.class, id);

        em.getTransaction().begin();
        existingUser.setFoodRestrictions(user.getFoodRestrictions()); // not detected automatically
//        JDOHelper.makeDirty(employee, "projects"); // reported as dirty
        em.getTransaction().commit();

        return existingUser;
    }

    public User addUser(User user) {
        EntityManager em = getEntityManager;
        em.getTransaction().begin();

        em.persist(user); // not detected automatically
//        JDOHelper.makeDirty(employee, "projects"); // reported as dirty
        em.getTransaction().commit();
        em.flush();

        return user;
    }
}
