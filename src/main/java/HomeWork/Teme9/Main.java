package HomeWork.Teme9;



import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("4567",
                "Marcel",
                "CLERK",
                7902,
                new Date(1988, 4, 13),
                50000,
                200,
                40);

        Employee v = new Employee("7900",
                "Vasiuca",
                "CLERK",
                7904, new Date(1900,5,22),
                60000,300,30);

        EmployeeDAOImpl emDAO = new EmployeeDAOImpl();

        List<Employee> l = emDAO.readAll();
        for (Employee em : l) {
            System.out.println(em);
        }
        System.out.println("------------------");
        emDAO.insert(e);
        l = emDAO.readAll();
        for (Employee em : l) {
            System.out.println(em);
        }
        System.out.println("------------------");
        emDAO.delete(e);
        l = emDAO.readAll();
        for (Employee em : l) {
            System.out.println(em);
        }
        System.out.println("---------------------");
        emDAO.update(v);
        l = emDAO.readAll();
        for (Employee em : l) {
            System.out.println(em);
        }
    }
}
