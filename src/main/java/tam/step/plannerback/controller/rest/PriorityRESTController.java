package tam.step.plannerback.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tam.step.plannerback.model.Priority;
import tam.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import tam.step.plannerback.service.priority.impls.PriorityServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRESTController {

    PriorityServiceImpl priorityService;

    @Autowired
    public PriorityRESTController(PriorityServiceImpl priorityService) {
        this.priorityService = priorityService;
    }

    @RequestMapping("/list")
    public List<Priority> getAll(){
        return priorityService.getAll();
    }
}
