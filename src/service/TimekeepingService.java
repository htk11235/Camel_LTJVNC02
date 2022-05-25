/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import dao.TimekeepingDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import model.Timekeeping;


public class TimekeepingService {
    TimekeepingDAO td = new TimekeepingDAO();
      public List<Timekeeping> getAllTimekeeping() throws SQLException {
        return td.getAllTimekeeping();
    }
     public int addTimekeeping(Timekeeping timekeeping) throws SQLException {
         return td.addTimekeeping(timekeeping);
    }

    public int updateTimekeeping(Timekeeping timekeeping) throws SQLException {
        return td.updateTimekeeping(timekeeping);
    }
    public  List<Timekeeping> getTimekeepingByDay(Date day) throws SQLException {
       return td.getTimekeepingByDay(day);
    }
}
