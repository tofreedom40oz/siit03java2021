package HomeWork.Teme9.DepTeme9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
    private Connection dbConnection;

    public DepartmentDAOImpl() {
        dbConnection = getConnection();
    }

    @Override
    public void insert(Department d) {
        try {
            String sql = "INSERT INTO DEPT VALUES " +
                    "(?, ?, ?)";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);

            preparedStatement.setInt(1, d.getDeptno());
            preparedStatement.setString(2, d.getDname());
            preparedStatement.setString(3, d.getCity());

            int affectedRows = preparedStatement.executeUpdate();
            dbConnection.commit();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete(Department d) {
        try {
            String sql = "DELETE FROM DEPT WHERE DEPTNO = ?";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setInt(1, d.getDeptno());

            int affectedRows = preparedStatement.executeUpdate();
            dbConnection.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Department> readAll() {
        List<Department> departmentList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM DEPT";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            dbConnection.setAutoCommit(false);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Department de = new Department(
                        rs.getInt("DEPTNO"),
                        rs.getString("DNAME"),
                        rs.getString("CITY"));

                departmentList.add(de);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return departmentList;
    }

    @Override
    //update la DEPTNO si nume dupa CITY

    public void update(Department d) {
        try {
            String sql = "UPDATE DEPT set DEPTNO = ?, DNAME = ? where CITY = ?";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);

            preparedStatement.setInt(1, d.getDeptno());
            preparedStatement.setString(2, d.getDname());
            preparedStatement.setString(3, d.getCity());


            int affectedRows = preparedStatement.executeUpdate();


            // commit().

            dbConnection.commit();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    private Connection getConnection () {
            try {
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/hr",
                        "root",
                        "ontherun");

            } catch (SQLException ex) {
                System.out.println(ex);
            }
            return null;
        }
    }
