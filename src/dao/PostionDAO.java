/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Department;
import model.Postion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Poisition_Employee;

/**
 *
 * @author htk11
 */
public class PostionDAO {
     public List<Poisition_Employee> getAllPostion_Employee() throws SQLException {
        List<Poisition_Employee> Poisition_Employee = new ArrayList<Poisition_Employee>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "select employee_Name,position_Name\n" +
"from positions p,employees e,employees_positions ep\n" +
"where ep.employee_Id = e.employee_Id and p.position_Id = ep.position_Id";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                 Poisition_Employee pe_child = new Poisition_Employee();
                 pe_child.setEmployee_Name(rs.getString("employee_Name"));
                 pe_child.setPostion_Name(rs.getString("position_Name"));
               
                Poisition_Employee.add(pe_child);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Poisition_Employee;
    }
    
     public List<Postion> getAllPostion() throws SQLException {
        List<Postion> Poisition_Employee = new ArrayList<Postion>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "select * from positions order by position_Id asc";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                 Postion pos_child = new Postion();
                 pos_child.setPostion_Id(rs.getInt("position_Id"));
                 pos_child.setPostion_Name(rs.getString("position_Name"));
               
                Poisition_Employee.add(pos_child);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Poisition_Employee;
    }
    public Postion getPostionById(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  postions WHERE postion_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Postion postion = new Postion();
                preparedStatement.setInt(1, id);

                postion.setPostion_Id(rs.getInt("postion_Id"));
                postion.setPostion_Name(rs.getString("postion_Name"));
             
                return postion;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
 public Postion getPostionByName(String name) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  postions WHERE postion_Name = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Postion postion = new Postion();
                preparedStatement.setString(1, name);

                postion.setPostion_Id(rs.getInt("postion_Id"));
                postion.setPostion_Name(rs.getString("postion_Name"));
             
                return postion;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public int addPostion(Postion postion) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO postions(postion_Name) VALUES(?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, postion.getPostion_Name());
           
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updatePostion(Postion postion) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE postions SET postion_Name = ? WHERE postion_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
              preparedStatement.setString(1, postion.getPostion_Name());
           
            
            preparedStatement.setInt(2, postion.getPostion_Id());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deletePostion(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM postions WHERE postion_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}