package tam.step.plannerback.dao;

import java.util.List;

public interface IGenericDAO<T> {
    T create(T t);
    T get(Integer id);
    T update(T t);
    T delete(Integer id);
    List<T> getAll();
}
