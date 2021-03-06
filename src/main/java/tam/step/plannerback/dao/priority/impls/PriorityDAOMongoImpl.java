package tam.step.plannerback.dao.priority.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import tam.step.plannerback.model.Priority;
import tam.step.plannerback.repository.PriorityRepositoryMongo;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("mongo")
public class PriorityDAOMongoImpl implements IPriorityDAO {

    private List<Priority> priorityList = new ArrayList<>(
            Arrays.asList(
                    new Priority(1,"Очень срочно!!", "#F1128D"),
                    new Priority(2,"Высокий", "#F1828D"),
                    new Priority(3,"Средний", "#85D1B2"),
                    new Priority(4,"Низкий", "#000059"),
                    new Priority(5,"Без приоритета", "#e5e5e5")
            )
    );

    private final PriorityRepositoryMongo repositoryMongo;

    @Autowired
    public PriorityDAOMongoImpl(PriorityRepositoryMongo repositoryMongo) {
        this.repositoryMongo = repositoryMongo;
    }

    //@PostConstruct
    void init(){
        repositoryMongo.deleteAll();
        repositoryMongo.saveAll(priorityList);
    }

    @Override
    public Priority create(Priority priority) {
        Integer lastId = this.getAll().stream().mapToInt(Priority::getId).max().orElse(0);
        priority.setId(lastId + 1);
        return repositoryMongo.save(priority);
    }

    @Override
    public Priority get(Integer id) {
        return repositoryMongo.findById(id).orElse(null);
    }

    @Override
    public Priority update(Priority priority) {
        Integer lastId = this.getAll().stream().mapToInt(Priority::getId).max().orElse(0);
        if(priority.getId() == null){priority.setId(lastId + 1);}
        return repositoryMongo.save(priority);
    }

    @Override
    public Priority delete(Integer id) {
        Priority priority = this.get(id);
        repositoryMongo.deleteById(id);
        return priority;
    }

    @Override
    public List<Priority> getAll() {
        return repositoryMongo.findAll();
    }
}
