package dal.context;

import domain.Ingredient;
import domain.Meal;
import domain.Recipe;
import domain.User;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MealContextTest {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceUnit");
    EntityManager entityManager;

    IDataContext<Meal> mealContext = new MealContext();

    private Meal meal;

    @Before
    public void setUp() {
        meal = new Meal(
                new Date(),
                new HashSet(Arrays.asList(new User("Milly", "path", new HashSet(Arrays.asList(new Ingredient("TestIngredient", 15)))))),
                new Recipe("TestRecipe", "TestDescription", new HashSet(Arrays.asList(new Ingredient("IngredientTest", 25)))));

        entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(meal);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Test
    public void get() {
        int id = 1;

        Meal returnedMeal = mealContext.get(id);

        assertEquals(meal.getId(), returnedMeal.getId());
        assertEquals(meal.getDate(), returnedMeal.getDate());
//        assertEquals(meal.getParticipants(), returnedMeal.getParticipants());
//        assertEquals(meal.getRecipe(), returnedMeal.getRecipe());
    }

    @Test
    public void getAll() {
    }

    @Test
    public void post() {
    }

    @Test
    public void put() {
    }

    @Test
    public void delete() {
    }
}