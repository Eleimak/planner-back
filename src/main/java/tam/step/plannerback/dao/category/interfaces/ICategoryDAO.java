package tam.step.plannerback.dao.category.interfaces;

import tam.step.plannerback.dao.IGenericDAO;
import tam.step.plannerback.model.Category;

import java.util.List;

public interface ICategoryDAO extends IGenericDAO<Category> {
    void saveAll(List<Category> categories);
}
