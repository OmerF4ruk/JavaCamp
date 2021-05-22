package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        super();
        this.departmentService = departmentService;
    }

    @GetMapping("/getall")
    public List<Department> getAll(){
        return this.departmentService.getAll();
    }
}
