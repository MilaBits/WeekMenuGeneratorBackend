package dal.context;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataContext {
    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceUnit");

    public EntityManager getEntityManager = factory.createEntityManager();
}

