/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


public class Timekeeping {
        private int timekeeping_Id;
        private int employee_Id;
        private Date day_keeping;
        private String status_;

    public int getTimekeeping_Id() {
        return timekeeping_Id;
    }

    public void setTimekeeping_Id(int timekeeping_Id) {
        this.timekeeping_Id = timekeeping_Id;
    }

    public int getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
    }

    public Date getDay_keeping() {
        return day_keeping;
    }

    public void setDay_keeping(Date day_keeping) {
        this.day_keeping = day_keeping;
    }

    public String getStatus_() {
        return status_;
    }

    public void setStatus_(String status_) {
        this.status_ = status_;
    }
        
}
