package tam.step.plannerback.dao;

import java.util.List;

public interface IGenericDAO<T> {
    T create(T t);
    T get(Long id);
    T update(T t);
    T delete(Long id);
    List<T> getAll();
}
