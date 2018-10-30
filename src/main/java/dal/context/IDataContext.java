package dal.context;

import java.util.ArrayList;

public interface IDataContext<T> {

    T get();

    ArrayList<T> getAll();

    T post();

    T put();

    T delete();
}
