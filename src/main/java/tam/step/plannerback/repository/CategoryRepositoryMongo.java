package tam.step.plannerback.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.step.plannerback.model.Category;
import tam.step.plannerback.model.Priority;

@Repository
public interface CategoryRepositoryMongo extends MongoRepository<Category, Integer> {
}
