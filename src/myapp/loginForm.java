
package myapp;

import admin.UserDashboard;
import admin.adminDashboard;
import config.dbConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import myapp.registrationForm;




 
public class loginForm extends javax.swing.JFrame {

    
    public loginForm() {
        initComponents();
    }
    
    
    Color hover = new Color(0, 51, 255);
    static String status;
    static String type;
   public static boolean loginAcc(String username, String passs ){
       dbConnect dbc = new dbConnect();
       try{
            String query = "SELECT * FROM users  WHERE u_un = '" + username + "' AND u_pass = '" + passs + "'";
            ResultSet resultSet = dbc.getData(query);
           if(resultSet.next()){
               status = resultSet.getString("status");
               type = resultSet.getString("u_type");
               return true;
           }else{
               return false;
           }
        }catch (SQLException ex) {
            return false;
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passs = new javax.swing.JPasswordField();
        regs = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        blexit = new javax.swing.JButton();
        blogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mainpanel.setBackground(new java.awt.Color(0, 153, 153));
        Mainpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 204, 204));
        Header.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Header.setForeground(new java.awt.Color(255, 204, 102));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log in system");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 840, 80));

        Mainpanel.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1013, 80));

        navi.setBackground(new java.awt.Color(0, 102, 102));
        navi.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        navi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Mainpanel.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 510, 570));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Login Form");
        Mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 210, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Username:");
        Mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 90, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Password:");
        Mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 90, 50));

        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        Mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 260, 50));

        passs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mainpanel.add(passs, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 260, 50));

        regs.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        regs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regs.setText("New User? Click Here to Register!");
        regs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regsMouseClicked(evt);
            }
        });
        Mainpanel.add(regs, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 260, -1));

        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Mainpanel.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, 40));

        blexit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        blexit.setText("Exit");
        blexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blexitActionPerformed(evt);
            }
        });
        Mainpanel.add(blexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 100, 40));

        blogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        blogin.setText("Login");
        blogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloginMouseClicked(evt);
            }
        });
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        Mainpanel.add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void regsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regsMouseClicked
       
        registrationForm rfm = new registrationForm();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regsMouseClicked

    private void blexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blexitActionPerformed
        System.exit(0);

        
    }//GEN-LAST:event_blexitActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        

        
        if(loginAcc(username.getText(),passs.getText())){
            if(!status.equals("Active")){
            JOptionPane.showMessageDialog(null,"In-Active Account,Contact the Admin");
        }else {
            
              
                   if(type.equals("Admin")){                
                       JOptionPane.showMessageDialog(null,"Login Successfully!");
                        adminDashboard ads = new adminDashboard();
                        ads.setVisible(true);
                        this.dispose();
                        
                   }else if(type.equals("User")){
                        JOptionPane.showMessageDialog(null,"Login Successfully!");
                        UserDashboard usf = new UserDashboard();
                        usf.setVisible(true);
                        this.dispose();
                        
                   }else{
                        JOptionPane.showMessageDialog(null,"No account type found,Contact the Admin");
                   
                }
            
    
            }
            
        }else{
          JOptionPane.showMessageDialog(null,"invalid Account!");  
    } 
    }//GEN-LAST:event_bloginActionPerformed

    private void bloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloginMouseClicked
     
    }//GEN-LAST:event_bloginMouseClicked

    
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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JButton blexit;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel login;
    private javax.swing.JPanel navi;
    private javax.swing.JPasswordField passs;
    private javax.swing.JLabel regs;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
