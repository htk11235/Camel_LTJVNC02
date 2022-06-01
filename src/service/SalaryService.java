package service;

import dao.SalaryDAO;
import java.sql.SQLException;
import java.util.List;
import model.Salary;

public class SalaryService {

        private SalaryDAO sd12 = new SalaryDAO();

        public List<Salary> getAllSalary() throws SQLException {
                return sd12.getAllSalary();
        }

        public Salary getSalaryById(int id) throws SQLException {
                return sd12.getSalaryById(id);
        }

        public List<Salary> getSalaryByYearAndMonth(int m, int y) throws SQLException {
                return sd12.getSalaryByYearAndMonth(m, y);
        }

        public int updateSalary(Salary sa) throws SQLException {
                return sd12.updateSalary(sa);
        }
}
