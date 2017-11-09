/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon.tables;

import Canyon.employees.ServerView;
import Canyon.orders.OrderView;

/**
 *
 * @author macdonny
 */
public class SeatView extends javax.swing.JFrame {

    /**
     * Creates new form SeatView
     */
    public SeatView() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tableButton = new javax.swing.JButton();
        seat1Button = new javax.swing.JButton();
        seat2Button = new javax.swing.JButton();
        seat3Button = new javax.swing.JButton();
        seat4Button = new javax.swing.JButton();
        seat5Button = new javax.swing.JButton();
        seat6Button = new javax.swing.JButton();
        seat7Button = new javax.swing.JButton();
        seat8Button = new javax.swing.JButton();
        seat9Button = new javax.swing.JButton();
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

        jLabel1.setText("Table");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableButton.setText("Table");
        tableButton.setMaximumSize(new java.awt.Dimension(635, 445));
        tableButton.setMinimumSize(new java.awt.Dimension(635, 445));
        tableButton.setPreferredSize(new java.awt.Dimension(635, 445));
        tableButton.setSize(new java.awt.Dimension(635, 445));

        seat1Button.setText("Seat 1");
        seat1Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat1Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat1Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat1Button.setSize(new java.awt.Dimension(120, 100));
        seat1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat1ButtonActionPerformed(evt);
            }
        });

        seat2Button.setText("Seat 2");
        seat2Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat2Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat2Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat2Button.setSize(new java.awt.Dimension(120, 100));
        seat2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat2ButtonActionPerformed(evt);
            }
        });

        seat3Button.setText("Seat 3");
        seat3Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat3Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat3Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat3Button.setSize(new java.awt.Dimension(120, 100));
        seat3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat3ButtonActionPerformed(evt);
            }
        });

        seat4Button.setText("Seat 4");
        seat4Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat4Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat4Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat4Button.setSize(new java.awt.Dimension(120, 100));
        seat4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat4ButtonActionPerformed(evt);
            }
        });

        seat5Button.setText("Seat 5");
        seat5Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat5Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat5Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat5Button.setSize(new java.awt.Dimension(120, 100));
        seat5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat5ButtonActionPerformed(evt);
            }
        });

        seat6Button.setText("Seat 6");
        seat6Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat6Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat6Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat6Button.setSize(new java.awt.Dimension(120, 100));
        seat6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat6ButtonActionPerformed(evt);
            }
        });

        seat7Button.setText("Seat 7");
        seat7Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat7Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat7Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat7Button.setSize(new java.awt.Dimension(120, 100));
        seat7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat7ButtonActionPerformed(evt);
            }
        });

        seat8Button.setText("Seat 8");
        seat8Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat8Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat8Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat8Button.setSize(new java.awt.Dimension(120, 100));
        seat8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat8ButtonActionPerformed(evt);
            }
        });

        seat9Button.setText("Seat 9");
        seat9Button.setMaximumSize(new java.awt.Dimension(120, 100));
        seat9Button.setMinimumSize(new java.awt.Dimension(120, 100));
        seat9Button.setPreferredSize(new java.awt.Dimension(120, 100));
        seat9Button.setSize(new java.awt.Dimension(120, 100));
        seat9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat9ButtonActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(seat4Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(seat5Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(seat6Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(seat1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seat3Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seat2Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seat7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seat8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seat9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(445, 445, 445)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(seat1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(seat3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(seat9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(seat7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seat4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seat1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat1ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat1ButtonActionPerformed

    private void seat2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat2ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat2ButtonActionPerformed

    private void seat3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat3ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat3ButtonActionPerformed

    private void seat4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat4ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat4ButtonActionPerformed

    private void seat5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat5ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat5ButtonActionPerformed

    private void seat6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat6ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat6ButtonActionPerformed

    private void seat9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat9ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat9ButtonActionPerformed

    private void seat8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat8ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat8ButtonActionPerformed

    private void seat7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat7ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }//GEN-LAST:event_seat7ButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ServerView serverView = new ServerView();
        serverView.setVisible(true);
    }//GEN-LAST:event_previousButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SeatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton seat1Button;
    private javax.swing.JButton seat2Button;
    private javax.swing.JButton seat3Button;
    private javax.swing.JButton seat4Button;
    private javax.swing.JButton seat5Button;
    private javax.swing.JButton seat6Button;
    private javax.swing.JButton seat7Button;
    private javax.swing.JButton seat8Button;
    private javax.swing.JButton seat9Button;
    private javax.swing.JButton tableButton;
    // End of variables declaration//GEN-END:variables
}