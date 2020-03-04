package tam.step.plannerback.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/delete/{id}")
    public Priority delete(@PathVariable("id")Integer id){
        return priorityService.delete(id);
    }

    @PostMapping("/create")
    public Priority create(@RequestBody Priority priority){
        return priorityService.create(priority);
    }

    @PostMapping("/update")
    public Priority update(@RequestBody Priority priority){
        return priorityService.create(priority);
    }
}
