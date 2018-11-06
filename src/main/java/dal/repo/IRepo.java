package dal.repo;

import java.util.ArrayList;

public interface IRepo<T> {

    T get(int id);

    ArrayList<T> getAll();

    T post();

    T put();

    T delete();
}
