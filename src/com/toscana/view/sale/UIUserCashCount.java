/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toscana.view.sale;

/**
 *
 * @author SG_05
 */
public class UIUserCashCount extends javax.swing.JDialog {

    /**
     * Creates new form UIUseCashCount
     */
    public UIUserCashCount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldPesosAmount = new javax.swing.JTextField();
        fieldDollarAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldCardsAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textFieldTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Corte de Caja");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Pesos:");

        fieldPesosAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldPesosAmount.setText("0.0");
        fieldPesosAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPesosAmountActionPerformed(evt);
            }
        });
        fieldPesosAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldPesosAmountFocusLost(evt);
            }
        });

        fieldDollarAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldDollarAmount.setText("0.0");
        fieldDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDollarAmountActionPerformed(evt);
            }
        });
        fieldDollarAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldDollarAmountFocusLost(evt);
            }
        });

        jLabel3.setText("Dolares:");

        jLabel4.setText("Tarjetas:");

        fieldCardsAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldCardsAmount.setText("0.0");
        fieldCardsAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCardsAmountActionPerformed(evt);
            }
        });
        fieldCardsAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCardsAmountFocusLost(evt);
            }
        });

        jButton1.setText("Aceptar");

        textFieldTotal.setEditable(false);
        textFieldTotal.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        textFieldTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldPesosAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(fieldDollarAmount)
                            .addComponent(fieldCardsAmount)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldPesosAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldCardsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldPesosAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPesosAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPesosAmountActionPerformed

    private void fieldCardsAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCardsAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCardsAmountActionPerformed

    private void fieldPesosAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPesosAmountFocusLost
        /*int total = Integer.parseInt(textFieldTotal.getText().toString());
        total= total+ Integer.parseInt(textFieldPesos.getText());
        textFieldTotal.setText(total+"");*/
    }//GEN-LAST:event_fieldPesosAmountFocusLost

    private void fieldDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDollarAmountActionPerformed

    private void fieldDollarAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldDollarAmountFocusLost
        int totalPesos = Integer.parseInt(fieldPesosAmount.getText().toString());
        int totalDolares = Integer.parseInt(fieldDollarAmount.getText().toString());
        int totalTarjetas = Integer.parseInt(fieldCardsAmount.getText().toString());
        int total= totalPesos + totalDolares + totalTarjetas;
        textFieldTotal.setText(total+"");
    }//GEN-LAST:event_fieldDollarAmountFocusLost

    private void fieldCardsAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCardsAmountFocusLost
       /* int total = Integer.parseInt(textFieldTotal.getText().toString());
        total= total+ Integer.parseInt(textFieldTarjetas.getText());
        textFieldTotal.setText(total+"");*/
    }//GEN-LAST:event_fieldCardsAmountFocusLost

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
            java.util.logging.Logger.getLogger(UIUserCashCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIUserCashCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIUserCashCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIUserCashCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UIUserCashCount dialog = new UIUserCashCount(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCardsAmount;
    private javax.swing.JTextField fieldDollarAmount;
    private javax.swing.JTextField fieldPesosAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textFieldTotal;
    // End of variables declaration//GEN-END:variables
}