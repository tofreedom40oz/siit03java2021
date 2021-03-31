package HomeWork.Teme9;

import java.util.List;

public interface EmployeeDAO {
    //create, read, update, delete

    //create
    void insert(Employee e);

    //delete
    void delete(Employee e);

    //read
    List<Employee> readAll();

    void update(Employee e);
}
