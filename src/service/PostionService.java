/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.PostionDAO;
import model.Postion;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author htk11
 */
public class PostionService {
     private PostionDAO posDAO_16;

    public PostionService() {
        posDAO_16 = new PostionDAO();
    }
  public List<Postion> getAllPostion() throws SQLException {
        return posDAO_16.getAllPostion();
    }
    public Postion getPostionById(int id) throws SQLException {
        return posDAO_16.getPostionById(id);
    }

    public int addPostion(Postion pos) throws SQLException {
        return posDAO_16.addPostion(pos);
    }

    public int updatePostion(Postion pos) throws SQLException {
        return posDAO_16.updatePostion(pos);
    }

    public int deletePostion(int id) throws SQLException {
        return posDAO_16.deletePostion(id);
    }
     public Postion getPostionByName(String name) throws SQLException {
           return posDAO_16.getPostionByName(name);
     }
}
