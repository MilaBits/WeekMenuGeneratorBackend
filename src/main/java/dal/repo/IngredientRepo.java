package dal.repo;

import dal.context.IDataContext;
import domain.Ingredient;

import java.util.ArrayList;

public class IngredientRepo implements IRepo<Ingredient> {

    private IDataContext<Ingredient> context;

    public IngredientRepo(IDataContext<Ingredient> context) {
        this.context = context;
    }

    @Override
    public Ingredient get(int id) {
        return context.get(id);
    }

    @Override
    public ArrayList<Ingredient> getAll() {
        return context.getAll();
    }

    @Override
    public Ingredient post() {
        return context.post();
    }

    @Override
    public Ingredient put() {
        return context.put();
    }

    @Override
    public Ingredient delete() {
        return context.delete();
    }
}
