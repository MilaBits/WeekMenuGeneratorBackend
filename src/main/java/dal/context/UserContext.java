package dal.context;

import domain.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class UserContext extends DataContext implements IDataContext<User> {
    @Override
    public User get(int id) {
        EntityManager em = getEntityManager;

        TypedQuery<User> query = em.createQuery("select u from User u where u.id = " + id, User.class);

        return query.getSingleResult();
    }

    @Override
    public ArrayList<User> getAll() {
        return null;
    }

    @Override
    public User post() {

        return null;
    }

    @Override
    public User put() {

        return null;
    }

    @Override
    public User delete() {
        return null;
    }
}
