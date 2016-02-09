package Forms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.*;

public class FRM_EmployeeManagement extends javax.swing.JFrame {
    
    List<Employee> EmployeeList;
    
    public FRM_EmployeeManagement() {
        initComponents();
        
        //test data
        Employee e1 = new Employee(1L,"Nikos","Nikolaou","nik.nik@yahoo.gr");
        Employee e2 = new Employee(2L,"Dionysis","Dionysiou","Dio.Dio@gmail.gr");
        Employee e3 = new Employee(3L,"Katerina","Katerinoy","kat.kat@gmail.gr");
        

        EmployeeList = new ArrayList<>();
        
        EmployeeList.add(e1);
        EmployeeList.add(e2);
        EmployeeList.add(e3);
        
        //Γεμίζουμε τον πίνακα με δεδομένα
        int k = 0;
        for (Employee e : EmployeeList) {            
            TAEmployee.setValueAt(e.getFname(), k, 0);
            TAEmployee.setValueAt(e.getLname(), k, 1);
            TAEmployee.setValueAt(e.getEmail(), k, 2);                    
            k++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBNew = new javax.swing.JButton();
        PBUpd = new javax.swing.JButton();
        PBDel = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAEmployee = new javax.swing.JTable();
        PBExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Εργαζόμενοι");
        setResizable(false);

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
        label2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label2.setText("Διαχείριση Εργαζομένων");

        TAEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "'Ονομα", "Επώνυμο", "E-Mail", "Προϊστάμενος"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TAEmployee);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PBNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBUpd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBDel)))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PBExit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PBNew)
                    .addComponent(PBUpd)
                    .addComponent(PBDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(PBExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBNewActionPerformed

    private void PBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBDelActionPerformed

    private void PBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBExitActionPerformed
        // TODO add your handling code here:
        //Κλείσιμο παραθύρου
        dispose();
    }//GEN-LAST:event_PBExitActionPerformed


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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_EmployeeManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PBDel;
    private javax.swing.JButton PBExit;
    private javax.swing.JButton PBNew;
    private javax.swing.JButton PBUpd;
    private javax.swing.JTable TAEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
