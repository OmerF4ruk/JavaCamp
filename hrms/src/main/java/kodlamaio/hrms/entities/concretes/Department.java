package kodlamaio.hrms.entities.concretes;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue
    @Column(name="id")
    String id;

    @Column(name="department_name")
    String department_name;

    public Department() {

    }

    public Department(String id, String department_name) {
        this.id = id;
        this.department_name = department_name;
    }

}
