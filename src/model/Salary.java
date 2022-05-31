/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC
 */
public class Salary {
    private int salary_Id,employee_Id,coefficient_salary;

    public int getSalary_Id() {
        return salary_Id;
    }

    public void setSalary_Id(int salary_Id) {
        this.salary_Id = salary_Id;
    }

    public int getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
    }

    public int getCoefficient_salary() {
        return coefficient_salary;
    }

    public void setCoefficient_salary(int coefficient_salary) {
        this.coefficient_salary = coefficient_salary;
    }
    
}
