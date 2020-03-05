package tam.step.plannerback.controller.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.step.plannerback.model.Category;
import tam.step.plannerback.service.category.impls.CategoryServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRESTController {

    CategoryServiceImpl categoryService;

    @Autowired
    public CategoryRESTController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/list")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/delete/{id}")
    public Category delete(@PathVariable("id")Integer id){
        return categoryService.delete(id);
    }

    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }

    @PostMapping("/update")
    public Category update(@RequestBody Category category){
        return categoryService.create(category);
    }

    @RequestMapping("/list/save")
    public void save(@RequestBody List<Category> categories){
        System.out.println("flag");
        categoryService.saveAll(categories);
    }
}
