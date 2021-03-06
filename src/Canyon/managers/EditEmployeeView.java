
package Canyon.managers;

import Canyon.db.tables.EmployeesTable;
import Canyon.db.tables.PayrollTable;
import Canyon.employees.Employee;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditEmployeeView extends javax.swing.JFrame {
    
    EmployeesTable employeesTable;
    PayrollTable payrollTable;
    
    public EditEmployeeView() {
        employeesTable = EmployeesTable.getInstance();
        payrollTable = PayrollTable.getInstance();
        
        initComponents();
        addPanel.setVisible(false);
        try {
            refreshNames();
        } catch (SQLException ex) {
            Logger.getLogger(EditEmployeeView.class.getName()).log(Level.SEVERE, null, ex);
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

        removePanel = new javax.swing.JPanel();
        editEmpLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empListTextArea = new javax.swing.JTextArea();
        refreshButton = new javax.swing.JButton();
        editLabel = new javax.swing.JLabel();
        editTextField = new javax.swing.JTextField();
        validateNameButton = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        newUsernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        empLevelLabel = new javax.swing.JLabel();
        empLevelComboBox = new javax.swing.JComboBox<>();
        getUNPWButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee - Edit");
        setResizable(false);

        removePanel.setBackground(new java.awt.Color(102, 102, 102));

        editEmpLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        editEmpLabel.setText("Edit Employee");

        empListTextArea.setEditable(false);
        empListTextArea.setColumns(20);
        empListTextArea.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        empListTextArea.setRows(5);
        jScrollPane1.setViewportView(empListTextArea);

        refreshButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        editLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        editLabel.setText("Edit:");

        editTextField.setText("Enter Employee's First Name");
        editTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearText(evt);
            }
        });
        editTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextFieldActionPerformed(evt);
            }
        });

        validateNameButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        validateNameButton.setText("Validate Name");
        validateNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateNameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removePanelLayout = new javax.swing.GroupLayout(removePanel);
        removePanel.setLayout(removePanelLayout);
        removePanelLayout.setHorizontalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addComponent(editEmpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addComponent(editLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editTextField))
                    .addComponent(validateNameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        removePanelLayout.setVerticalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmpLabel)
                    .addComponent(refreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(editTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addPanel.setBackground(new java.awt.Color(102, 102, 102));

        firstNameLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name");

        firstNameTextField.setBackground(new java.awt.Color(240, 240, 240));

        lastNameLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name");

        lastNameTextField.setBackground(new java.awt.Color(240, 240, 240));

        usernameLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        usernameLabel.setText("Username:");

        newUsernameLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        newUsernameLabel.setText(firstNameTextField.getText());

        passwordLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        passwordLabel.setText("Password:");

        newPasswordLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        newPasswordLabel.setText(lastNameTextField.getText());

        empLevelLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        empLevelLabel.setText("Employee Level");

        empLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Waiter" }));

        getUNPWButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        getUNPWButton.setText("Generate Username | Password");
        getUNPWButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getUNPWButtonActionPerformed(evt);
            }
        });

        confirmButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Hours");

        jLabel2.setText("Hourly");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(firstNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(getUNPWButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(empLevelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(empLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))))
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(newUsernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(newPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empLevelLabel)
                    .addComponent(empLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getUNPWButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(removePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        try {
            // TODO add your handling code here:
            refreshNames();
        } catch (SQLException ex) {
            Logger.getLogger(EditEmployeeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    public void refreshNames() throws SQLException {
        
        String setEmpList = "";
        ArrayList<Employee> employees = employeesTable.getAllEmployees();
        
        for (int i = 0; i < employees.size(); i++) {
            setEmpList += (employees.get(i).getfName()) + 
                    " " + (employees.get(i).getlName()) +
                    " " + (employees.get(i).getUserName()) + 
                    " " + (employees.get(i).getPosition()) + "\n";
        }
        
        empListTextArea.setText(setEmpList);
    }
    
    private void clearText(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearText
        // TODO add your handling code here:

        if (editTextField.getText().equals("Enter First Name To Edit")) {
            editTextField.setText("");
        }
        addPanel.setVisible(false);
    }//GEN-LAST:event_clearText

    private void validateNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateNameButtonActionPerformed
        // TODO add your handling code here:

        if (employeesTable.VerifyLogin(editTextField.getText())) {
            employeesTable.ViewEmployee(editTextField.getText()).get(0);
            addPanel.setVisible(true);
        } else {
            addPanel.setVisible(false);
        }
        
        ArrayList<Employee> employee = new ArrayList();
        employee = employeesTable.ViewEmployee(editTextField.getText());
        
        firstNameTextField.setText(employee.get(0).getfName());
        lastNameTextField.setText(employee.get(0).getlName());
        
        ArrayList<String> pr = new ArrayList();
        pr = payrollTable.getEmployeePayrollInfo(editTextField.getText());
        
        jTextField1.setText(pr.get(1));
        jTextField2.setText(pr.get(2));
        
        confirmButton.setVisible(false);
        
        
    }//GEN-LAST:event_validateNameButtonActionPerformed

    private void getUNPWButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUNPWButtonActionPerformed
        // TODO add your handling code here:

        if (firstNameTextField.getText().equals("") && lastNameTextField.getText().equals("")) {
            confirmButton.setVisible(false);
        } else {
            confirmButton.setVisible(true);
            newUsernameLabel.setText(firstNameTextField.getText());
            newPasswordLabel.setText(lastNameTextField.getText());
        }

    }//GEN-LAST:event_getUNPWButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:

        int level = 0;
        if (empLevelComboBox.getSelectedItem().equals("Manager")) {
            level = 1;
        } else if (empLevelComboBox.getSelectedItem().equals("Waiter")) {
            level = 2;
        }

        employeesTable.RemoveEmployee(editTextField.getText());
        System.out.println("Removed: " + editTextField.getText());
        
        employeesTable.AddEmployee(firstNameTextField.getText(), lastNameTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), level);
        System.out.println("Added" + employeesTable.ViewEmployee(firstNameTextField.getText()));
        this.setVisible(false);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextFieldActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployeeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel editEmpLabel;
    private javax.swing.JLabel editLabel;
    private javax.swing.JTextField editTextField;
    private javax.swing.JComboBox<String> empLevelComboBox;
    private javax.swing.JLabel empLevelLabel;
    private javax.swing.JTextArea empListTextArea;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton getUNPWButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JLabel newUsernameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel removePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton validateNameButton;
    // End of variables declaration//GEN-END:variables
}
