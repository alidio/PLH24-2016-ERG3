package company;

import model.Employee;

public class EmployeeWPData {
    private String fname;
    private String lname;
    private String email;
    private Employee managerId;
    private int sumWpDays;
    private int approvedWpDays;
    
    public void EmployeeWPData(String fname, String lname, String email, Employee managerId, int sumWpDays, int approvedWpDays) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.managerId = managerId;
        this.sumWpDays = sumWpDays;
        this.approvedWpDays = approvedWpDays;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public Employee getManagerId() {
        return managerId;
    }

    public int getSumWpDays() {
        return sumWpDays;
    }

    public int getApprovedWpDays() {
        return approvedWpDays;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setManagerId(Employee managerId) {
        this.managerId = managerId;
    }

    public void setSumWpDays(int sumWpDays) {
        this.sumWpDays = sumWpDays;
    }

    public void setApprovedWpDays(int approvedWpDays) {
        this.approvedWpDays = approvedWpDays;
    }
    
}
