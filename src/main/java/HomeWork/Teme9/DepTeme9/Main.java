package HomeWork.Teme9.DepTeme9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Department d = new Department(80,
                "MACELAR",
                "INDIANA");

        Department v = new Department(70, "BUCATAR", "NEW YORK");

        DepartmentDAOImpl deDAO = new DepartmentDAOImpl();

        List<Department> li = deDAO.readAll();
        for (Department de : li) {
            System.out.println(de);
        }
        System.out.println("------------------");
        deDAO.insert(d);
        li = deDAO.readAll();
        for (Department de : li) {
            System.out.println(de);
        }
        System.out.println("------------------");
        deDAO.delete(d);
        li = deDAO.readAll();
        for (Department de : li) {
            System.out.println(de);
        }
        System.out.println("---------------------");
        deDAO.update(v);
        li = deDAO.readAll();
        for (Department de : li) {
            System.out.println(de);
        }

    }

}