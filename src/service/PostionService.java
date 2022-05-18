/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.PostionDAO;
import model.Postion;
import java.sql.SQLException;
import java.util.List;
import model.Poisition_Employee;

/**
 *
 * @author htk11
 */
public class PostionService {
     private PostionDAO posDAO;

    public PostionService() {
        posDAO = new PostionDAO();
    }

    public List<Poisition_Employee> getAllPostion_Employee() throws SQLException {
        return posDAO.getAllPostion_Employee();
    }
  public List<Postion> getAllPostion() throws SQLException {
        return posDAO.getAllPostion();
    }
    public Postion getPostionById(int id) throws SQLException {
        return posDAO.getPostionById(id);
    }

    public int addPostion(Postion pos) throws SQLException {
        return posDAO.addPostion(pos);
    }

    public int updatePostion(Postion pos) throws SQLException {
        return posDAO.updatePostion(pos);
    }

    public int deletePostion(int id) throws SQLException {
        return posDAO.deletePostion(id);
    }
     public Postion getPostionByName(String name) throws SQLException {
           return posDAO.getPostionByName(name);
     }
}
