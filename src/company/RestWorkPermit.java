//Η κλάση αυτή χρησημοποιείται για να κρατά τα υπόλοιπα
//αδειών από κάθε τύπο. 
package company;

import model.Availableworkpermit;
import model.Employee;
import model.Workpermittype;

public class RestWorkPermit {
    private Employee emp;
    private Availableworkpermit AworkPermit;
    private int ypoloipo;

    public RestWorkPermit(Employee emp, Availableworkpermit AworkPermit, int sumNdays) {
        this.emp = emp;
        this.AworkPermit = AworkPermit;
        this.ypoloipo = AworkPermit.getAvailableDays() - sumNdays;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Availableworkpermit getWorkPermitTypeId() {
        return AworkPermit;
    }

    public void setWorkPermitTypeId(Availableworkpermit AworkPermit) {
        this.AworkPermit = AworkPermit;
    }

    public int getYpoloipo() {
        return ypoloipo;
    }

    public void setYpoloipo(int ypoloipo) {
        this.ypoloipo = ypoloipo;
    }
    
    
}
