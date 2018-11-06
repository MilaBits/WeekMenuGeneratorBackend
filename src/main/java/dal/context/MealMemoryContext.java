package dal.context;

import domain.Ingredient;
import domain.Meal;
import domain.Recipe;
import domain.User;

import java.util.*;

public class MealMemoryContext implements IDataContext<Meal> {
    @Override
    public Meal get(int id) {
        return null;
    }

    @Override
    public ArrayList<Meal> getAll() {

        // Test date
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);

        ArrayList<Meal> mock = new ArrayList();
        mock.add(new Meal(
                new Date(),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(cal.getTimeInMillis()),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new HashSet(Arrays.asList(
                        new User("Milly", "", new HashSet(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new HashSet(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new HashSet(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));

        return mock;
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
