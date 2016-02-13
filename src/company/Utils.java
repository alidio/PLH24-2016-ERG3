package company;

import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.*;


public class Utils {
    private EntityManager em; //Entity manager

   
    public Utils(EntityManager em){
        this.em = em;
    }
    
    //Η μέθοδος εισάγει τις ημέρες άδειας που δικαιούται ο 
    //Employee κατά την καταχωρησή του (Νέος).
    public void insWorkpermit(Employee e){
        
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {                  
                       
            List<Workpermittype> WPTList = GetWorkPermitById();
            for (Workpermittype w:WPTList){
            
                if (w.getWorkPermitTypeText().contentEquals("ΚΑΝΟΝΙΚΗ ΑΔΕΙΑ")){
                    Availableworkpermit Awp1 = new Availableworkpermit();
                    Awp1.setAvailableDays(25);
                    Awp1.setWorkPermitTypeId(w);
                    Awp1.setEmployeeId(e);
                    em.persist(Awp1);
                }
                if (w.getWorkPermitTypeText().contentEquals("ΑΔΕΙΑ ΜΗΤΡΟΤΗΤΑΣ")){
                    Availableworkpermit Awp2 = new Availableworkpermit();
                    Awp2.setAvailableDays(58);
                    Awp2.setWorkPermitTypeId(w);
                    Awp2.setEmployeeId(e);
                    em.persist(Awp2);
                }
                if (w.getWorkPermitTypeText().contentEquals("ΕΚΠΑΙΔΕΥΤΙΚΗ ΑΔΕΙΑ")){
                    Availableworkpermit Awp3 = new Availableworkpermit();
                    Awp3.setAvailableDays(20);
                    Awp3.setWorkPermitTypeId(w);
                    Awp3.setEmployeeId(e);
                    em.persist(Awp3);
                }               
            }             
            em.getTransaction().commit(); 
        } catch (Exception ex) {
            ex.printStackTrace();            
            em.getTransaction().rollback();
        }        
    }
    
    //Επιστρέφει σε λίστα όλες τις εγγραφές των τύπων των αδειών
    public List<Workpermittype> GetWorkPermitById() {
        //ερωτημα
        String sqlqry = "select w from Workpermittype w";

        Query qry = em.createQuery(sqlqry, Workpermittype.class);

        //Εκτέλεση ερωτήματος
        List<Workpermittype> WPList = qry.getResultList();

        return WPList;                     
    }    
    
    //Απάντάει εάν υπάρχει ως Manager ο Employee της παραμέτρου
    public boolean chkManagerExist(Employee emp) {
        boolean retval=false;
        
        //ερωτημα
        String sqlqry = "select e from Employee e";

        Query qry = em.createQuery(sqlqry, Employee.class);

        //Εκτέλεση ερωτήματος
        List<Employee> EList = qry.getResultList();
        
        for (Employee e:EList){
            if (Objects.equals(e.getManagerId(), emp)) retval = true;
        } 
        
        return retval;
    }        
}