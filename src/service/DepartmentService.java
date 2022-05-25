/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.DepartmentDAO;
import java.sql.SQLException;
import java.util.List;
import model.Department;

/**
 *
 * @author htk11
 */
public class DepartmentService {
     private DepartmentDAO depDAO_16;

    public DepartmentService() {
        depDAO_16 = new DepartmentDAO();
    }

    public List<Department> getAllDepartment() throws SQLException {
        return depDAO_16.getAllDepartment();
    }

    public Department getDepartmentById(int id) throws SQLException {
        return depDAO_16.getDepartmentById(id);
    }

    public int addDepartment(Department dep) throws SQLException {
        return depDAO_16.addDepartment(dep);
    }

    public int updateDepartment(Department dep) throws SQLException {
        return depDAO_16.updateDepartment(dep);
    }

    public int deleteDepartment(int id) throws SQLException {
        return depDAO_16.deleteDepartment(id);
    }
      public Department getDepartmentByName(String  name) throws SQLException {
          return depDAO_16.getDepartmentByName(name);
      }
}
