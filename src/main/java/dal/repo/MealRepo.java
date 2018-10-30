package dal.repo;

import dal.context.IDataContext;
import domain.Meal;

import java.util.ArrayList;

public class MealRepo implements IRepo<Meal> {

    private IDataContext<Meal> context;

    public MealRepo(IDataContext<Meal> context) {
        this.context = context;
    }

    @Override
    public Meal get() {
        return context.get();
    }

    @Override
    public ArrayList<Meal> getAll() {
        return context.getAll();
    }

    @Override
    public Meal post() {
        return context.post();
    }

    @Override
    public Meal put() {
        return context.put();
    }

    @Override
    public Meal delete() {
        return context.delete();
    }
}
