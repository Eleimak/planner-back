package tam.step.plannerback.service.priority.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.step.plannerback.model.Priority;
import tam.step.plannerback.dao.priority.interfaces.IPriorityDAO;

import java.util.List;

@Service
public class PriorityServiceImpl implements IPriorityDAO {

    private final IPriorityDAO iPriorityDAO;

    @Autowired
    public PriorityServiceImpl(@Qualifier("mongo") IPriorityDAO iPriorityDAO) {
        this.iPriorityDAO = iPriorityDAO;
    }

    @Override
    public Priority create(Priority priority) {
        return iPriorityDAO.create(priority);
    }

    @Override
    public Priority get(Integer id) {
        return iPriorityDAO.get(id);
    }

    @Override
    public Priority update(Priority priority) {
        return iPriorityDAO.update(priority);
    }

    @Override
    public Priority delete(Integer id) {
        return iPriorityDAO.delete(id);
    }

    @Override
    public List<Priority> getAll() {
        return iPriorityDAO.getAll();
    }
}
