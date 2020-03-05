package tam.step.plannerback.service.category.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.step.plannerback.dao.category.impls.CategoryDAOMongoImpl;
import tam.step.plannerback.model.Category;
import tam.step.plannerback.service.category.interfaces.ICategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private final CategoryDAOMongoImpl categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryDAOMongoImpl categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.create(category);
    }

    @Override
    public Category get(Integer id) {
        return categoryRepository.delete(id);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.update(category);
    }

    @Override
    public Category delete(Integer id) {
        return categoryRepository.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public void saveAll(List<Category> categories) {
        categoryRepository.saveAll(categories);
    }
}
