package service;

import dao.EmployeeDAO;
import model.Employee;
import java.sql.SQLException;
import java.util.List;

public class EmployeeService {

        private EmployeeDAO employeeDAO_16;

        public EmployeeService() {
                employeeDAO_16 = new EmployeeDAO();
        }

        public List<Employee> getAllEmployee() throws SQLException {
                return employeeDAO_16.getAllEmployee();
        }

        public Employee getEmployeeById(int id) throws SQLException {
                return employeeDAO_16.getEmployeeById(id);
        }

        public Employee getEmployeeByEmail(String email) throws SQLException {
                return employeeDAO_16.getEmployeeByEmail(email);
        }

        public int addEmployee(Employee employee) throws SQLException {
                return employeeDAO_16.addEmployee(employee);
        }

        public int updateEmployee(Employee employee) throws SQLException {
                return employeeDAO_16.updateEmployee(employee);
        }

        public int deleteEmployee(int id) throws SQLException {
                return employeeDAO_16.deleteEmployee(id);
        }
}
