package tam.step.plannerback.service;

import java.util.List;

public interface IGenericService<T> {
    T create(T t);
    T get(Integer id);
    T update(T t);
    T delete(Integer id);
    List<T> getAll();
}
