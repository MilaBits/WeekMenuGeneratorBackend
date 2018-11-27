package dal.repo;

import dal.context.IDataContext;
import domain.User;

import java.util.ArrayList;

public class UserRepo implements IRepo<User> {

    private IDataContext<User> context;

    public UserRepo(IDataContext<User> context) {
        this.context = context;
    }

    @Override
    public User get(int id) {
        return context.get(id);
    }

    @Override
    public ArrayList<User> getAll() {
        return context.getAll();
    }

    @Override
    public User post() {
        return context.post();
    }

    @Override
    public User put() {
        return context.put();
    }

    @Override
    public User delete() {
        return context.delete();
    }
}
