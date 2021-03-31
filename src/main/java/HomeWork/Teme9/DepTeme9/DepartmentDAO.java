package HomeWork.Teme9.DepTeme9;

import java.util.List;

public interface DepartmentDAO {

    void insert(Department d);

    void delete(Department d);

    List<Department> readAll();

    void update(Department d);

}
