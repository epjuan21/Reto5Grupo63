/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author USER-02
 */
public class VistaRequerimientosReto5 extends javax.swing.JFrame {

    /**
     * Creates new form VistaRequerimientosReto5
     */
    public VistaRequerimientosReto5() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Requerimientos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento1 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnRequerimiento2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRequerimiento2.setText("Requerimiento 2");
        btnRequerimiento2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });

        btnRequerimiento1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRequerimiento1.setText("Requerimiento 1");
        btnRequerimiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });

        btnRequerimiento3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRequerimiento3.setText("Requerimiento 3");
        btnRequerimiento3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRequerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRequerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRequerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed
        
        VistaRequerimiento1Reto5 vr = new VistaRequerimiento1Reto5();
        vr.setVisible(true);
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        VistaRequerimiento2Reto5 vr = new VistaRequerimiento2Reto5();
        vr.setVisible(true);
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento3ActionPerformed
        VistaRequerimiento3Reto5 vr = new VistaRequerimiento3Reto5();
        vr.setVisible(true);
    }//GEN-LAST:event_btnRequerimiento3ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaRequerimientosReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientosReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientosReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientosReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRequerimientosReto5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    // End of variables declaration//GEN-END:variables
}