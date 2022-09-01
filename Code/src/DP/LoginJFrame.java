package DP;

import javax.swing.JOptionPane;

public class LoginJFrame extends javax.swing.JFrame {

    public LoginJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelUserID = new javax.swing.JLabel();
        jLabelUserPass = new javax.swing.JLabel();
        jTextFieldUserID = new javax.swing.JTextField();
        jPasswordFieldUserPassword = new javax.swing.JPasswordField();
        jLabelAccType = new javax.swing.JLabel();
        jRadioButtonAdminAccType = new javax.swing.JRadioButton();
        jRadioButtonCustomerAccType = new javax.swing.JRadioButton();
        jButtonLogIn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        jLabelUserID.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUserID.setFont(new java.awt.Font("Garuda", 1, 12)); // NOI18N
        jLabelUserID.setText("User ID :");

        jLabelUserPass.setFont(new java.awt.Font("Garuda", 1, 12)); // NOI18N
        jLabelUserPass.setText("User Password :");

        jTextFieldUserID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPasswordFieldUserPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelAccType.setFont(new java.awt.Font("Garuda", 1, 12)); // NOI18N
        jLabelAccType.setText("Account Type :");

        jRadioButtonAdminAccType.setBackground(new java.awt.Color(255, 204, 153));
        buttonGroup1.add(jRadioButtonAdminAccType);
        jRadioButtonAdminAccType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonAdminAccType.setText("Admin");
        jRadioButtonAdminAccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdminAccTypeActionPerformed(evt);
            }
        });

        jRadioButtonCustomerAccType.setBackground(new java.awt.Color(255, 204, 153));
        buttonGroup1.add(jRadioButtonCustomerAccType);
        jRadioButtonCustomerAccType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonCustomerAccType.setText("Customer");

        jButtonLogIn.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLogIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jRadioButtonAdminAccType)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonCustomerAccType))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabelUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonAdminAccType)
                    .addComponent(jRadioButtonCustomerAccType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButtonLogIn)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 320, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shop Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        // TODO add your handling code here:
        String userInputID = jTextFieldUserID.getText();
        String userInputPassword = jPasswordFieldUserPassword.getText();
        boolean userLoginStuccessful=false;
        int loginAccountType = 0;
        FileOperations fops = new FileOperations();

        //radio button to choose acc type
        if (jRadioButtonAdminAccType.isSelected()){
          //to activate search at Admin.txt
          loginAccountType = 1;
          userLoginStuccessful = fops.LoginOperation(userInputID,userInputPassword,loginAccountType);

        } else if (jRadioButtonCustomerAccType.isSelected()){
          //to activate search at Customer.txt
          loginAccountType = 2;
          userLoginStuccessful = fops.LoginOperation(userInputID,userInputPassword,loginAccountType);
        }

         if (userLoginStuccessful==true){
           JOptionPane.showMessageDialog(null, "Login Successful!");
           if(loginAccountType == 1){
             String AdminLoginID = jTextFieldUserID.getText();
             new AdminJFrame(AdminLoginID).setVisible(true);
             dispose();
           }else if(loginAccountType == 2){
             String CustomerLoginID = jTextFieldUserID.getText();
             new CustomerJFrame(CustomerLoginID).setVisible(true);
             dispose();
           }else{
             JOptionPane.showMessageDialog(null, "Select Account Type!");
           }
         }else{
            jTextFieldUserID.setText("");
            jPasswordFieldUserPassword.setText("");
            JOptionPane.showMessageDialog(null, "Login Denied! Try Again");
         }

    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jRadioButtonAdminAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdminAccTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdminAccTypeActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAccType;
    private javax.swing.JLabel jLabelUserID;
    private javax.swing.JLabel jLabelUserPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldUserPassword;
    private javax.swing.JRadioButton jRadioButtonAdminAccType;
    private javax.swing.JRadioButton jRadioButtonCustomerAccType;
    private javax.swing.JTextField jTextFieldUserID;
    // End of variables declaration//GEN-END:variables
}
