package Forms;

import company.MyWindowEvent;
import company.Utils;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.*;

public class FRM_EmployeeManagementDetail extends javax.swing.JFrame {
    
    private Employee SelectedEmployee;        
    private EntityManager em; //Entity manager

    public FRM_EmployeeManagementDetail(EntityManager em, Employee SelectedEmployee) {           
        this.em = em;
        this.SelectedEmployee = SelectedEmployee;          
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        employee1 = SelectedEmployee;
        javax.persistence.Query employeeQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT e FROM Employee e order by e.lname");
        employeeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(employeeQuery.getResultList());
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFSurname = new javax.swing.JTextField();
        TFName = new javax.swing.JTextField();
        TFEmail = new javax.swing.JTextField();
        PBSave = new javax.swing.JButton();
        PBCancel = new javax.swing.JButton();
        CBManager = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Επεξεργασία Εργαζομένου");

        jLabel1.setText("Επώνυμο:");

        jLabel2.setText("Όνομα:");

        jLabel3.setText("E-Mail:");

        jLabel4.setText("Προϊστάμενος:");

        TFSurname.setName("FSurname"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employee1, org.jdesktop.beansbinding.ELProperty.create("${lname}"), TFSurname, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TFSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSurnameActionPerformed(evt);
            }
        });

        TFName.setName("FName"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employee1, org.jdesktop.beansbinding.ELProperty.create("${fname}"), TFName, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TFEmail.setName("FEmail"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employee1, org.jdesktop.beansbinding.ELProperty.create("${email}"), TFEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        PBSave.setText("Αποθήκευση");
        PBSave.setName("PBSave"); // NOI18N
        PBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBSaveActionPerformed(evt);
            }
        });

        PBCancel.setText("Ακύρωση");
        PBCancel.setName("PBCancel"); // NOI18N
        PBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBCancelActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeeList, CBManager);
        jComboBoxBinding.setSourceNullValue(employeeList);
        jComboBoxBinding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employee1, org.jdesktop.beansbinding.ELProperty.create("${managerId}"), CBManager, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        binding.setSourceNullValue(null);
        bindingGroup.addBinding(binding);

        CBManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(PBSave)
                .addGap(42, 42, 42)
                .addComponent(PBCancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PBSave)
                    .addComponent(PBCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBCancelActionPerformed

        MyWindowEvent we = new MyWindowEvent(this,WindowEvent.WINDOW_CLOSED,false);
        for (WindowListener l: this.getWindowListeners()) {
            l.windowClosed(we);
        }
        //this.setVisible(false);        
        dispose();
        /*
        //Ο Χρήστης πάτησε ακύρωση.
        //Οι αλλαγές του θα ΔΕΝ θα σωθούν στη βάση.        
        
        //Επαναφορά των τιμών πρίν τις αλλαγές του χρήστη.
        this.SelectedEmployee.setLname(lname);
        this.SelectedEmployee.setFname(Fname);
        this.SelectedEmployee.setEmail(Emale);
        this.SelectedEmployee.setManagerId(Manager);
        
        //Κλείσιμο παραθύρου
        //Ενεργοποίηση προηγούμενου παραθύρου
        prevwin.setEnabled(true);
        
        closeMe(true);
        //dispose();        
        */
    }//GEN-LAST:event_PBCancelActionPerformed

    private void PBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBSaveActionPerformed

        MyWindowEvent we = new MyWindowEvent(this,WindowEvent.WINDOW_CLOSED,true);
        for (WindowListener l: this.getWindowListeners()) {
            l.windowClosed(we);
        }
        //this.setVisible(false);
        dispose();

        /*
        //Ο Χρήστης πάτησε αποθήκευση.
        //Οι αλλαγές του θα σωθούν στη βάση.
        //Έναρξη διαδικασίας ενημέρωσης ΒΔ
        prevwin.setEnabled(true);
        
        Utils u = new Utils(em);
        
        
        em.getTransaction().begin();        
        try {       
            //Παρακολούθηση αντικειμένου για να γίνει commit στη βάση
            em.persist(SelectedEmployee);
            
            em.getTransaction().commit();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, null, WIDTH, null);
            em.getTransaction().rollback();
        }      

        //Εισάγει τις άδειες που δικαιούται ο κάθε νέος υπάλληλος
        u.insWorkpermit(SelectedEmployee);

        //Κλείσιμο παραθύρου
        //Ενεργοποίηση προηγούμενου παραθύρου        
        dispose();
        */
        
    }//GEN-LAST:event_PBSaveActionPerformed

    private void TFSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSurnameActionPerformed

    private void CBManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBManagerActionPerformed
    
    /**
     * Μέθοδος για τον έλεγχο του τρόπου κλεισίματος του παραθύρου
     *
     * @param exitAndSave boolean true for save changes, false for cancel
     * changes
     */
    /*
    private void closeMe(boolean exitAndSave) {
        MyWindowEvent we = new MyWindowEvent(this, WindowEvent.WINDOW_CLOSED, exitAndSave);
        for (WindowListener l : this.getWindowListeners()) {
            l.windowClosed(we);
        }
        this.setVisible(false);
    }   
    */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBManager;
    private javax.swing.JButton PBCancel;
    private javax.swing.JButton PBSave;
    private javax.swing.JTextField TFEmail;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFSurname;
    private model.Employee employee1;
    private java.util.List<model.Employee> employeeList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
