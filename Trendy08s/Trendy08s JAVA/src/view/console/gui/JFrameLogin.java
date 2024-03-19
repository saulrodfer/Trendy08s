/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.console.gui;

import model.validations.UserDataValidations;
import javax.swing.*;

/**
 *
 * @author saulrodfer
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain
     */
    
       public JFrameLogin(){
        initComponents();
        initConfig();
    }
    private void initConfig(){
        resetFields();    
    }
    private void resetFields(){

        jLabelErrorEmail.setVisible(false);
        jLabelErrorPassword.setVisible(false);

        jPanelPassword.setName("");
        jTextFieldEmail.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPassword = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonValidation1 = new javax.swing.JButton();
        jLabelErrorEmail = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelErrorPassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica Swing");

        jPanelPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPassword.setToolTipText("");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(169, 133, 133));
        jLabelTitle.setText("Inicio de sesión Trendy08s");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelEmail.setText("Email: ");

        jButtonClear.setBackground(new java.awt.Color(255, 153, 153));
        jButtonClear.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(153, 0, 51));
        jButtonClear.setText("Limpiar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonValidation1.setBackground(new java.awt.Color(153, 255, 153));
        jButtonValidation1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonValidation1.setForeground(new java.awt.Color(0, 153, 153));
        jButtonValidation1.setText("Enviar");
        jButtonValidation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidation1ActionPerformed(evt);
            }
        });

        jLabelErrorEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelErrorEmail.setForeground(new java.awt.Color(153, 0, 0));
        jLabelErrorEmail.setText("Email Introducido Incorrecto");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelPassword.setText("Contraseña:");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelErrorPassword.setForeground(new java.awt.Color(153, 0, 0));
        jLabelErrorPassword.setText("Mínimo 8 longitud, 1 Número,1 Mayúscula, 1 Minúscula, 1 Carácter especial.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logo231q.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanelPasswordLayout = new javax.swing.GroupLayout(jPanelPassword);
        jPanelPassword.setLayout(jPanelPasswordLayout);
        jPanelPasswordLayout.setHorizontalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasswordLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPasswordLayout.createSequentialGroup()
                        .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPassword)
                            .addComponent(jLabelEmail))
                        .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButtonValidation1))
                            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrorEmail))))
                        .addContainerGap(392, Short.MAX_VALUE))
                    .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasswordLayout.createSequentialGroup()
                            .addComponent(jLabelTitle)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(199, 199, 199))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasswordLayout.createSequentialGroup()
                            .addComponent(jButtonClear)
                            .addGap(563, 563, 563)))))
        );
        jPanelPasswordLayout.setVerticalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPasswordLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitle)
                        .addGap(82, 82, 82)
                        .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelErrorEmail)
                        .addGap(51, 51, 51)))
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelErrorPassword)
                .addGap(143, 143, 143)
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValidation1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
 
    private void jButtonValidation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidation1ActionPerformed
        // TODO add your handling code here:
        String email = jTextFieldEmail.getText();
        String password = jPasswordField1.getName();

        if(!UserDataValidations.checkEmail(email)){
                jLabelErrorEmail.setVisible(true);
        }

        if(!UserDataValidations.checkPassword(password)){
                jLabelErrorPassword.setVisible(true);
        }
    }//GEN-LAST:event_jButtonValidation1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_jButtonClearActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonValidation1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelErrorEmail;
    private javax.swing.JLabel jLabelErrorPassword;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelPassword;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}