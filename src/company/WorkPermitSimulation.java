package company;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import model.Employee;


public class WorkPermitSimulation extends Thread{
    private Employee emp;
    private Random rnd = new Random();
    private EntityManager em;
    private Utils u;
    
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
        if (u.chkManagerExist(emp)) {
            System.out.println(emp.getLname() + " ---> IamManager");
            //Έγκριση - Απόρριψη αιτημάτων άδειας (R4.A)
            u.WorkpermitApproval(emp);
        }               
        
        //Αναμονή 10 έως 30 sec με τυχαίο τρόπο.
        try {
            int i = 10000 + rnd.nextInt(20000);
            sleep(30000);            
        } catch (InterruptedException ex) {
            Logger.getLogger(WorkPermitSimulation.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(emp.getLname() + " ---> Τέλος");
    }    
     
}
