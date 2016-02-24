package company;

import java.util.Random;
import javax.persistence.EntityManager;
import model.Employee;


public class WorkPermitSimulation extends Thread{
    private Employee emp;
    Random rnd = new Random();
    EntityManager em;
    Utils u;
    
    public WorkPermitSimulation(Employee emp) {
        super("WorkPermitSimulation");
        this.emp = emp;
        this.em = DBManager.em;
        u = new Utils();
        
    }
    
    @Override
    public void run() {
        System.out.println(emp.getLname() + " ---> Αρχή");
        
        //Έλεγχος εάν ο εργαζόμενος είναι προϊστάμενος (R4.A)
        if (IamManager(emp)) {
            System.out.println(emp.getLname() + " ---> IamManager");
            u.WorkpermitApproval(emp);
        }
        

        
        
        System.out.println(emp.getLname() + " ---> Τέλος");
    }
    
    public boolean IamManager(Employee emp){
        
        return u.chkManagerExist(emp);
    }    
    
}
