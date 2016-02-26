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
        
        //Αναμονή 10 έως 30 sec με τυχαίο τρόπο (R4.Β).
        try {
            //Αναμονή σε milisecond. 1000msec = 1sec
            int i = 10000 + rnd.nextInt(20000);
            sleep(i);            
        } catch (InterruptedException ex) {
            Logger.getLogger(WorkPermitSimulation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Έλεγχος εάν υπάρχει υποβληθέν αίτημα που δεν έχει ελεγθεί (R4.C).
        if (u.chkMyWorkpermit(emp)) {
            System.out.println(emp.getLname() + " --- > Yparxei!!!");
        }else {
            System.out.println(emp.getLname() + " --- > DEN Yparxei...");
            //Αν δεν υπάρχει άλλο αίτημα, το οποίο δεν έχει ελεγχθεί 
            //τότε υποβάλλει αίτημα άδειας με τυχαίο τρόπο
        }
        
        System.out.println(emp.getLname() + " ---> Τέλος");
    }    
 





///test-------------------------


    public void getEmployeeBalanceForWorkPermitType(Employee emp){
       

            for (int i=0; i<empList.size(); i++){
                Employee emp = (Employee)empList.get(i);
                //Για κάθε υπάλληλο βρίσκεται το σύνολο των αδειών που έχει πάρει, 
                //για τον δοθέντα τύπο άδειας.
                Query wpQuery = em.createQuery(  "select wp.workPermitTypeId, sum(wp.numdays) as dsum \n" +
                                                  " from Workpermit wp \n" +
                                                  "where wp.employeeId = :emp \n" +
                                                  "  and wp.workPermitTypeId.workPermitTypeId = :workPermitTypeId \n" +                        
                                               "group by wp.workPermitTypeId");

                wpQuery.setParameter("emp", emp);
                wpQuery.setParameter("workPermitTypeId", workPermitId);

                List workPermitTypeIdList = wpQuery.getResultList();

                if (workPermitTypeIdList != null){
                    for (int j=0; j<workPermitTypeIdList.size(); j++){
                        
                        Workpermittype wpt = (Workpermittype)((Object[])workPermitTypeIdList.get(j))[0];
                        Long dsum = (Long)((Object[])workPermitTypeIdList.get(j))[1];

                        //Για κάθε υπάλληλο αναζητείται πόσες ημέρες άδειας δικαιούται 
                        //για τον δοθέντα τύπο άδειας
                        Query awpQuery = em.createQuery(  "select awp.availableDays \n" +
                                                  "  from Availableworkpermit awp \n" +
                                                  " where awp.employeeId = :emp \n"+
                                                  "   and awp.workPermitTypeId = :workPermitTypeId");

                        awpQuery.setParameter("emp", emp);
                        awpQuery.setParameter("workPermitTypeId", wpt);

                        int availableDays = (int)awpQuery.getSingleResult();                  
                        //Το string εξόδου παράγεται υπολογίζοντας τις ημέρες που δικαιούται,
                        //πλύν τις ημέρες που έχει ήδη πάρει
                        myList.add( "Όνομα Εργαζόμενου:" + emp.getLname() + " " + emp.getFname() + ", Υπόλοιπο άδειας:" + (availableDays - dsum));

                    }
                }
            }
        }
        return myList;
    }






    
}
