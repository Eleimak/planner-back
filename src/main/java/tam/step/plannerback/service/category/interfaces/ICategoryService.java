package tam.step.plannerback.service.category.interfaces;

import tam.step.plannerback.model.Category;
import tam.step.plannerback.service.IGenericService;

import java.util.List;

public interface ICategoryService extends IGenericService<Category> {
    void saveAll(List<Category> categories);
}
