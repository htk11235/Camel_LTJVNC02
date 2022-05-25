/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author htk11
 */
public class EmployeeDAO {

    public List<Employee> getAllEmployee() throws SQLException {
        List<Employee> employees = new ArrayList<Employee>();

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM employees Order By employee_Id";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);

            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                Employee employee = new Employee();

                employee.setEmployee_Id(rs_16.getInt("employee_Id"));
                employee.setEmployee_Name(rs_16.getString("employee_Name"));
                employee.setDepartment_Id(rs_16.getInt("department_Id"));
                employee.setPosition_Id(rs_16.getInt("position_Id"));
                employee.setSex(rs_16.getString("sex"));
                employee.setBirthday(rs_16.getDate("birthday"));
                employee.setEmail(rs_16.getString("email"));
                employee.setTel(rs_16.getString("tel"));
                employees.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public Employee getEmployeeById(int id) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  employees WHERE employee_Id = ?";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                Employee employee = new Employee();
                preparedStatement.setInt(1, id);

                employee.setEmployee_Id(rs_16.getInt("employee_Id"));
                employee.setEmployee_Name(rs_16.getString("employee_Name"));
                employee.setDepartment_Id(rs_16.getInt("department_Id"));
                employee.setSex(rs_16.getString("sex"));
                employee.setBirthday(rs_16.getDate("birthday"));
                employee.setEmail(rs_16.getString("email"));
                employee.setTel(rs_16.getString("tel"));

                return employee;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

        public Employee getEmployeeByEmail(String email) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  employees WHERE email = ?";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
            preparedStatement.setString(1, email);
            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                Employee employee = new Employee();
                employee.setEmployee_Id(rs_16.getInt("employee_Id"));
                employee.setEmployee_Name(rs_16.getString("employee_Name"));
                employee.setDepartment_Id(rs_16.getInt("department_Id"));
                employee.setSex(rs_16.getString("sex"));
                employee.setBirthday(rs_16.getDate("birthday"));
                employee.setEmail(rs_16.getString("email"));
                employee.setTel(rs_16.getString("tel"));
                return employee;
            }

        } catch (SQLException e) {
        }
        return null;
    }
    
    public int addEmployee(Employee employee) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
            preparedStatement.setString(1, employee.getEmployee_Name());
            preparedStatement.setInt(2, employee.getDepartment_Id());
            preparedStatement.setInt(3, employee.getPosition_Id());
            preparedStatement.setString(4, employee.getSex());
            preparedStatement.setDate(5, (Date) employee.getBirthday());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getTel());
             preparedStatement.setString(8, "1");
            int rs_16 = preparedStatement.executeUpdate();
            System.out.println(rs_16);
            return rs_16;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateEmployee(Employee employee) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE employees SET employee_Name = ?, department_Id =?,  postion_Id=?, sex=?, birthday=?, email=?, tel=? WHERE employee_Id = ?";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
             preparedStatement.setString(1, employee.getEmployee_Name());
            preparedStatement.setInt(2, employee.getDepartment_Id());
            preparedStatement.setString(4, employee.getSex());
            preparedStatement.setDate(5, (Date) employee.getBirthday());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getTel());
            preparedStatement.setInt(8, employee.getEmployee_Id());

            int rs_16 = preparedStatement.executeUpdate();
            System.out.println(rs_16);
            return rs_16;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteEmployee(int id) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM employees WHERE employee_Id = ?";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs_16 = preparedStatement.executeUpdate();
            System.out.println(rs_16);
            return rs_16;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public boolean isLoginUser(model.Employee user) throws SQLException {

                Connection connection_16 = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM employees WHERE email = ? AND password = ?";
                PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
                preparedStatement.setString(1, user.getEmail());
                preparedStatement.setString(2, user.getPassword());

                 ResultSet rs_16 = preparedStatement.executeQuery();

                return rs_16.next();     
        }
}
