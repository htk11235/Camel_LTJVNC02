/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Salary;

/**
 *
 * @author PC
 */
public class SalaryDAO {
    public List<Salary> getAllSalary() throws SQLException {
        List<Salary> sas = new ArrayList<Salary>();

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "select * from salaries order by salary_Id asc";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);

            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                 Salary sa_child = new Salary();
                 sa_child.setSalary_Id(rs_16.getInt("salary_Id"));
                 sa_child.setEmployee_Id(rs_16.getInt("employee_Id"));
                 sa_child.setCoefficient_salary(rs_16.getInt("coefficient_salary"));
                 sa_child.setBonus(rs_16.getDouble("bonus"));
                 sa_child.setYear(rs_16.getInt("year"));
                 sa_child.setMonth(rs_16.getInt("month"));
                sas.add(sa_child);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sas;
    }
    public Salary getSalaryById(int id) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  salaries WHERE salary_Id = ?";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                 Salary sa_child = new Salary();
                 sa_child.setSalary_Id(rs_16.getInt("salary_Id"));
                 sa_child.setEmployee_Id(rs_16.getInt("employee_Id"));
                 sa_child.setCoefficient_salary(rs_16.getInt("coefficient_salary"));
                 sa_child.setBonus(rs_16.getDouble("bonus"));
                 sa_child.setYear(rs_16.getInt("year"));
                 sa_child.setMonth(rs_16.getInt("month"));
           
             
                return sa_child;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public List<Salary> getSalaryByYearAndMonth(int m,int y) throws SQLException {
        List<Salary> sas = new ArrayList<Salary>();
        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  salaries WHERE year = ? and month = ? ";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
            preparedStatement.setInt(1, y);
            preparedStatement.setInt(1, m);
            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                 Salary sa_child = new Salary();
                 sa_child.setSalary_Id(rs_16.getInt("salary_Id"));
                 sa_child.setEmployee_Id(rs_16.getInt("employee_Id"));
                 sa_child.setCoefficient_salary(rs_16.getInt("coefficient_salary"));
                 sa_child.setBonus(rs_16.getDouble("bonus"));
                 sa_child.setYear(rs_16.getInt("year"));
                 sa_child.setMonth(rs_16.getInt("month"));
                 sas.add(sa_child);
                
            }
            return sas;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
 

    public int updateSalary(Salary sa) throws SQLException {

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE salaries SET coefficient_salary = ?, bonus = ?, year = ?, month =? WHERE salary_Id = ?";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql);
              preparedStatement.setInt(1, sa.getCoefficient_salary());
            preparedStatement.setDouble(2, sa.getBonus());
            preparedStatement.setInt(3, sa.getYear());
            preparedStatement.setInt(4, sa.getMonth());
            preparedStatement.setInt(5,sa.getSalary_Id());
            int rs_16 = preparedStatement.executeUpdate();
            System.out.println(rs_16);
            return rs_16;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
