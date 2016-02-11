package Forms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.*;

public class FRM_EmployeeManagement extends javax.swing.JFrame {
    
    private JFrame prevwin;
    private EntityManager em;
    private Employee SelectedEmp;
    
    public FRM_EmployeeManagement(EntityManager em, JFrame prevwin) {
        
        this.prevwin = prevwin;
        this.em = em;
        
        //Κλειδωμα προηγούμενου παραθύρου
        this.prevwin.setEnabled(false);        
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

        employeeQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT e FROM Employee e order by e.lname");
        employeeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(employeeQuery.getResultList());
        PBNew = new javax.swing.JButton();
        PBUpd = new javax.swing.JButton();
        PBDel = new javax.swing.JButton();
        label2 = new java.awt.Label();
        SPEmployes = new javax.swing.JScrollPane();
        TAEmployee = new javax.swing.JTable();
        PBExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Εργαζόμενοι");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PBNew.setText("Νέο");
        PBNew.setActionCommand("NewEmployee");
        PBNew.setName("PBNewEmployee"); // NOI18N
        PBNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBNewActionPerformed(evt);
            }
        });

        PBUpd.setText("Μεταβολή");
        PBUpd.setActionCommand("UpdEmployee");
        PBUpd.setName("PBUpdEmployee"); // NOI18N
        PBUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBUpdActionPerformed(evt);
            }
        });

        PBDel.setText("Διαγραφή");
        PBDel.setToolTipText("");
        PBDel.setActionCommand("DelEmployee");
        PBDel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PBDel.setName("PBDelEmployee"); // NOI18N
        PBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBDelActionPerformed(evt);
            }
        });

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label2.setText("Διαχείριση Εργαζομένων");

        TAEmployee.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeeList, TAEmployee);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lname}"));
        columnBinding.setColumnName("Επώνυμο");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fname}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${managerId}"));
        columnBinding.setColumnName("Προϊστάμενος");
        columnBinding.setColumnClass(model.Employee.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        SPEmployes.setViewportView(TAEmployee);

        PBExit.setText("Έξοδος");
        PBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PBExit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PBNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBUpd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBDel)
                        .addGap(0, 440, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SPEmployes))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SPEmployes, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PBNew)
                    .addComponent(PBUpd)
                    .addComponent(PBDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PBExit)
                .addGap(10, 10, 10))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBNewActionPerformed
            //Άνοιγμα παραθύρου επεξεργασίας εργαζομένων
            SelectedEmp = new Employee();
            employeeList.add(SelectedEmp);
            
            FRM_EmployeeManagementDetail FORM_EmpMngmntDet = new FRM_EmployeeManagementDetail(em,this,SelectedEmp);
            FORM_EmpMngmntDet.setVisible(true);
    }//GEN-LAST:event_PBNewActionPerformed

    private void PBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBDelActionPerformed
        //Εάν έχει επιλεγεί κάποιος από τη λίστα
        if (TAEmployee.getSelectedRow()>=0) {
            //ο Επιλεγμένος εργαζόμενος από τη λίστα περνάει για επεξεργασία στο επόμενο παράθυρο.
            SelectedEmp = employeeList.get(TAEmployee.getSelectedRow());
            
            //Ο Χρήστης πάτησε διαγραφή.
            //Οι αλλαγές του θα σωθούν στη βάση.
            //Έναρξη διαδικασίας ενημέρωσης ΒΔ
            
            em.getTransaction().begin();
            try {
                //Διαγραφή αντικειμένου απο τη βάση
                em.remove(SelectedEmp);
                em.getTransaction().commit();

                //Διαγραφή αντικειμένου απο τη λίστα
                employeeList.remove(SelectedEmp);
                
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Δεν μπορεί να γίνει διαγραφή διότι υπάρχει συσχετιζόμενος πίνακας", null, WIDTH, null);
                em.getTransaction().rollback();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Επιλέξτε εργαζόμενο", null, WIDTH, null);
        }
        


    }//GEN-LAST:event_PBDelActionPerformed

    private void PBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBExitActionPerformed
        //Κλείσιμο παραθύρου
        //Ενεργοποίηση προηγούμενου παραθύρου
        prevwin.setEnabled(true);
        dispose();
    }//GEN-LAST:event_PBExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Κλείσιμο παραθύρου
        //Ενεργοποίηση προηγούμενου παραθύρου
        prevwin.setEnabled(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void PBUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBUpdActionPerformed
        
        //Εάν έχει επιλεγεί κάποιος από τη λίστα
        if (TAEmployee.getSelectedRow()>=0) {
            //ο Επιλεγμένος εργαζόμενος από τη λίστα περνάει για επεξεργασία στο επόμενο παράθυρο.
            SelectedEmp = employeeList.get(TAEmployee.getSelectedRow());

            //Άνοιγμα παραθύρου επεξεργασίας εργαζομένων
            FRM_EmployeeManagementDetail FORM_EmpMngmntDet = new FRM_EmployeeManagementDetail(em,this,SelectedEmp);
            FORM_EmpMngmntDet.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Επιλέξτε εργαζόμενο", null, WIDTH, null);
        }
    }//GEN-LAST:event_PBUpdActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_EmployeeManagement().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PBDel;
    private javax.swing.JButton PBExit;
    private javax.swing.JButton PBNew;
    private javax.swing.JButton PBUpd;
    private javax.swing.JScrollPane SPEmployes;
    private javax.swing.JTable TAEmployee;
    private java.util.List<model.Employee> employeeList;
    private javax.persistence.Query employeeQuery;
    private java.awt.Label label2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
