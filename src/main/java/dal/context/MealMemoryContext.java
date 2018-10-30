package dal.context;

import domain.Ingredient;
import domain.Meal;
import domain.Recipe;
import domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MealMemoryContext implements IDataContext<Meal> {
    @Override
    public Meal get() {
        return null;
    }

    @Override
    public ArrayList<Meal> getAll() {

        ArrayList<Meal> mock = new ArrayList<>();
        mock.add(new Meal(
                new Date(),
                new ArrayList<>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new ArrayList<>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new ArrayList<>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new ArrayList<>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new ArrayList<User>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new ArrayList<>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
                        new Ingredient("Sugar", 5),
                        new Ingredient("Sugar", 5))))));
        mock.add(new Meal(
                new Date(),
                new ArrayList<>(Arrays.asList(
                        new User("Milly", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Sugar", 5),
                                new Ingredient("Salt", 5)))),
                        new User("Tim", "", new ArrayList<>(Arrays.asList(
                                new Ingredient("Milk", 5),
                                new Ingredient("Sugar", 5)))))),
                new Recipe("Pasta", "Test food", new ArrayList<>(Arrays.asList(
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
