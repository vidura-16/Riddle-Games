/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Code.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vidur
 */
public class SignupUI extends javax.swing.JFrame {

    /**
     * Creates new form SignupUI
     */
    public SignupUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backtosignin = new javax.swing.JButton();
        tfusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfage = new javax.swing.JTextField();
        btnsignup = new javax.swing.JButton();
        tfemail = new javax.swing.JTextField();
        tfpassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel1.setText("USER NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        backtosignin.setBackground(new java.awt.Color(0, 153, 153));
        backtosignin.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        backtosignin.setForeground(new java.awt.Color(255, 255, 255));
        backtosignin.setText("BACK TO SIGN IN");
        backtosignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtosigninActionPerformed(evt);
            }
        });
        jPanel1.add(backtosignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));
        jPanel1.add(tfusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 230, -1));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel2.setText("EMAIL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel6.setText("AGE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));
        jPanel1.add(tfage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 230, -1));

        btnsignup.setBackground(new java.awt.Color(0, 153, 153));
        btnsignup.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("SIGN UP");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 141, -1));
        jPanel1.add(tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, -1));

        tfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/generatedtext_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backtosigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtosigninActionPerformed
                dispose();
              LoginUi d = new LoginUi();
              d.setLocationRelativeTo(null);
              d.setTitle("Login");
              d.setVisible(true );   

    }//GEN-LAST:event_backtosigninActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        String username =  tfusername.getText();
        String email = tfemail.getText();
        String password = tfpassword.getText();
        String age = tfage.getText();
        int correct = 0 ;
        if(username.isEmpty()  ||email.isEmpty() || password.isEmpty() || age.isEmpty()){
            JOptionPane.showMessageDialog(this, "FIELDS SHOULD NOT EMPTY","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            userReg(username,email,password,age,correct);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btnsignupActionPerformed

    private void tfpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtosignin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfage;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables

    

    private void userReg(String username, String email, String password, String age,int correct) {
 Connection dbconn = DBConnection.connectDB();//abstract 
    if (dbconn != null){
        try {
         PreparedStatement st = (PreparedStatement)
         dbconn.prepareStatement("INSERT INTO user (username,email,password,age,correct)VALUES(?,?,?,?,?)");
       
          st.setString(1, username);
          st.setString(2, email);
          st.setString(3, password);
          st.setString(4, age);
          st.setInt(5, correct);
         
         int res = st.executeUpdate();
         JOptionPane.showMessageDialog(this, "user data registered","Success ",JOptionPane.ERROR_MESSAGE);    
         
         tfusername.setText("");
         tfemail.setText("");
         tfpassword.setText("");
         tfage.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(LoginUi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
        System.out.println("Connection not available"); 
    }
}
}