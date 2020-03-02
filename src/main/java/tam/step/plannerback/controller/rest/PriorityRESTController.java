package tam.step.plannerback.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tam.step.plannerback.model.Priority;
import tam.step.plannerback.dao.priority.interfaces.IPriorityDAO;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRESTController {

    IPriorityDAO service;

    @Autowired
    public PriorityRESTController(IPriorityDAO service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Priority> getAll(){
        return null;
    }
}
