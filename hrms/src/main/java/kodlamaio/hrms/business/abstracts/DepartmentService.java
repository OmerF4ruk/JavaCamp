package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
}
