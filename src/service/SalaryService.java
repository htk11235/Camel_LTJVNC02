/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.SalaryDAO;
import java.sql.SQLException;
import java.util.List;
import model.Salary;

/**
 *
 * @author PC
 */
public class SalaryService {

    private SalaryDAO sd = new SalaryDAO();

    public List<Salary> getAllSalary() throws SQLException {
        return sd.getAllSalary();
    }

    public Salary getSalaryById(int id) throws SQLException {
        return sd.getSalaryById(id);
    }

    public List<Salary> getSalaryByYearAndMonth(int m, int y) throws SQLException {
        return sd.getSalaryByYearAndMonth(m, y);
    }

    public int updateSalary(Salary sa) throws SQLException {
        return sd.updateSalary(sa);
    }
}
