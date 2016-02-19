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
    
}
