/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon.tables;

import Canyon.employees.ServerView;

/**
 *
 * @author macdonny
 */
public class TableView extends javax.swing.JFrame {
    
    String table1Status = "Unoccupied";
    String table2Status = "Unoccupied";
    String table3Status = "Unoccupied";
    String table4Status = "Unoccupied";
    String table5Status = "Unoccupied";
    String table6Status = "Unoccupied";
    String table7Status = "Unoccupied";
    String table8Status = "Unoccupied";
    /**
     * Creates new form Table
     */
    public TableView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        table1Button = new javax.swing.JButton();
        table2Button = new javax.swing.JButton();
        table3Button = new javax.swing.JButton();
        table4Button = new javax.swing.JButton();
        table5Button = new javax.swing.JButton();
        table6Button = new javax.swing.JButton();
        table7Button = new javax.swing.JButton();
        table8Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 700));
        setMinimumSize(new java.awt.Dimension(960, 700));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 107, 135));
        jPanel1.setMaximumSize(new java.awt.Dimension(960, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 700));
        jPanel1.setSize(new java.awt.Dimension(960, 700));

        table1Button.setBackground(new java.awt.Color(153, 255, 153));
        table1Button.setText("Table 1");
        table1Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table1Button.setOpaque(true);
        table1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table1ButtonActionPerformed(evt);
            }
        });

        table2Button.setBackground(new java.awt.Color(153, 255, 153));
        table2Button.setText("Table 2");
        table2Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table2Button.setOpaque(true);
        table2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table2ButtonActionPerformed(evt);
            }
        });

        table3Button.setBackground(new java.awt.Color(153, 255, 153));
        table3Button.setText("Table 3");
        table3Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table3Button.setOpaque(true);
        table3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table3ButtonActionPerformed(evt);
            }
        });

        table4Button.setBackground(new java.awt.Color(153, 255, 153));
        table4Button.setText("Table 4");
        table4Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table4Button.setOpaque(true);
        table4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table4ButtonActionPerformed(evt);
            }
        });

        table5Button.setBackground(new java.awt.Color(153, 255, 153));
        table5Button.setText("Table 5");
        table5Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table5Button.setOpaque(true);
        table5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table5ButtonActionPerformed(evt);
            }
        });

        table6Button.setBackground(new java.awt.Color(153, 255, 153));
        table6Button.setText("Table 6");
        table6Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table6Button.setOpaque(true);
        table6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table6ButtonActionPerformed(evt);
            }
        });

        table7Button.setBackground(new java.awt.Color(153, 255, 153));
        table7Button.setText("Table 7");
        table7Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table7Button.setOpaque(true);
        table7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table7ButtonActionPerformed(evt);
            }
        });

        table8Button.setBackground(new java.awt.Color(153, 255, 153));
        table8Button.setText("Table 8");
        table8Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 49, 50), 3, true));
        table8Button.setOpaque(true);
        table8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table8ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tables");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        previousButton.setText("Previous Screen");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ServerView serverView = new ServerView();
        serverView.setVisible(true);
    }//GEN-LAST:event_previousButtonActionPerformed

    private void table1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table1ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table1Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table1ButtonActionPerformed

    private void table2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table2ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table2Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table2ButtonActionPerformed

    private void table3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table3ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table3Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table3ButtonActionPerformed

    private void table4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table4ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table4Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table4ButtonActionPerformed

    private void table5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table5ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table5Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table5ButtonActionPerformed

    private void table6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table6ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table6Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table6ButtonActionPerformed

    private void table7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table7ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table7Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table7ButtonActionPerformed

    private void table8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table8ButtonActionPerformed
        // TODO add your handling code here:
        if("Unoccupied".equals(table8Status)) {
            this.setVisible(false);
            SeatView seatView = new SeatView();
            seatView.setVisible(true);
        }
    }//GEN-LAST:event_table8ButtonActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton table1Button;
    private javax.swing.JButton table2Button;
    private javax.swing.JButton table3Button;
    private javax.swing.JButton table4Button;
    private javax.swing.JButton table5Button;
    private javax.swing.JButton table6Button;
    private javax.swing.JButton table7Button;
    private javax.swing.JButton table8Button;
    // End of variables declaration//GEN-END:variables
}
