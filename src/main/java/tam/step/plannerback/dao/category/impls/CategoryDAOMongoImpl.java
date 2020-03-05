package tam.step.plannerback.dao.category.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tam.step.plannerback.dao.category.interfaces.ICategoryDAO;
import tam.step.plannerback.model.Category;
import tam.step.plannerback.repository.CategoryRepositoryMongo;

import java.util.List;

@Component
public class CategoryDAOMongoImpl implements ICategoryDAO {

    private final CategoryRepositoryMongo repositoryMongo;

    @Autowired
    public CategoryDAOMongoImpl(CategoryRepositoryMongo repositoryMongo) {
        this.repositoryMongo = repositoryMongo;
    }

    @Override
    public Category create(Category category) {
        Integer lastId = this.getAll().stream().mapToInt(Category::getId).max().orElse(0);
        category.setId(lastId + 1);
        return repositoryMongo.save(category);
    }

    @Override
    public Category get(Integer id) {
        return repositoryMongo.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        Integer lastId = this.getAll().stream().mapToInt(Category::getId).max().orElse(0);
        if(category.getId() == null){category.setId(lastId + 1);}
        return repositoryMongo.save(category);
    }

    @Override
    public Category delete(Integer id) {
        Category category = this.get(id);
        repositoryMongo.deleteById(id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return repositoryMongo.findAll();
    }

    @Override
    public void saveAll(List<Category> categories) {
        repositoryMongo.saveAll(categories);
    }
}
