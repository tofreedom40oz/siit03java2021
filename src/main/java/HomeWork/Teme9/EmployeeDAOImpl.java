package HomeWork.Teme9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private Connection dbConnection;

    public EmployeeDAOImpl() {
        dbConnection = getConnection();
    }

    @Override
    public void insert(Employee e) {
        try {
            String sql = "INSERT INTO EMP VALUES " +
                    "(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);

            preparedStatement.setString(1, e.getEmpno());
            preparedStatement.setString(2, e.getEname());
            preparedStatement.setString(3, e.getJob());
            preparedStatement.setInt(4, e.getMgr());
            preparedStatement.setDate(5, e.getDate());
            preparedStatement.setInt(6, e.getSal());
            preparedStatement.setInt(7, e.getComm());
            preparedStatement.setInt(8, e.getDepno());

            int affectedRows = preparedStatement.executeUpdate();
            dbConnection.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Employee e) {
        try {
            String sql = "DELETE FROM EMP WHERE EMPNO = ?";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setString(1, e.getEmpno());

            int affectedRows = preparedStatement.executeUpdate();
            dbConnection.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Employee> readAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM EMP";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            dbConnection.setAutoCommit(false);

            ResultSet rs = preparedStatement.executeQuery();

            //int empno, String ename, String job, int mgr, Date date, int sal, int comm, int depno
            while (rs.next()) {
                Employee e = new Employee(
                        rs.getString("EMPNO"),
                        rs.getString("ENAME"),
                        rs.getString("JOB"),
                        rs.getInt("MGR"),
                        rs.getDate("HIREDATE"),
                        rs.getInt("SAL"),
                        rs.getInt("COMM"),
                        rs.getInt("DEPTNO")
                        );

                employeeList.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return employeeList;
    }

    @Override
    public void update(Employee e) {
        try {
            String sql = "UPDATE EMP set  ENAME = ? where EMPNO = ?";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);

            preparedStatement.setString(1, e.getEname());
            preparedStatement.setString(2, e.getEmpno());


            int affectedRows = preparedStatement.executeUpdate();


            // commit().

            dbConnection.commit();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hr",
                    "root",
                    "ontherun");

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
