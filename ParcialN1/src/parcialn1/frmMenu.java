/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcialn1;

/**
 *
 * @author dbpan
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
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
        btnProblema1 = new javax.swing.JButton();
        btnProblema2 = new javax.swing.JButton();
        btnProblema3 = new javax.swing.JButton();
        btnProblema4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ejercicios del parcial 1");

        btnProblema1.setText("Problema 1");
        btnProblema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProblema1ActionPerformed(evt);
            }
        });

        btnProblema2.setText("Problema 2");
        btnProblema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProblema2ActionPerformed(evt);
            }
        });

        btnProblema3.setText("Problema 3");
        btnProblema3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProblema3ActionPerformed(evt);
            }
        });

        btnProblema4.setText("Problema 4");
        btnProblema4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProblema4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProblema3)
                    .addComponent(btnProblema1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProblema2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProblema4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProblema1)
                    .addComponent(btnProblema2))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProblema3)
                    .addComponent(btnProblema4))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProblema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProblema1ActionPerformed
        frmProblema1 frm1 = new frmProblema1();
        frm1.setTitle("Calificación");
        frm1.setVisible(true);
    }//GEN-LAST:event_btnProblema1ActionPerformed

    private void btnProblema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProblema3ActionPerformed
        frmProblema3 frm3 = new frmProblema3();
        frm3.setTitle("Indice de Masa Corporal");
        frm3.setVisible(true);
    }//GEN-LAST:event_btnProblema3ActionPerformed

    private void btnProblema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProblema4ActionPerformed
       frmProblema4 frm4 = new frmProblema4();
        frm4.setTitle("Mini Encuesta");
        frm4.setVisible(true);
    }//GEN-LAST:event_btnProblema4ActionPerformed

    private void btnProblema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProblema2ActionPerformed
        frmProblema2 frm2 = new frmProblema2();
        frm2.setTitle("Estacionamientos");
        frm2.setVisible(true);
    }//GEN-LAST:event_btnProblema2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProblema1;
    private javax.swing.JButton btnProblema2;
    private javax.swing.JButton btnProblema3;
    private javax.swing.JButton btnProblema4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
