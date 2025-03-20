
package myapp;

import user.UserDashboard;
import admin.adminDashboard;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
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
            String query = "SELECT * FROM users  WHERE u_un = '" + username + "'";
            ResultSet resultSet = dbc.getData(query);
           if(resultSet.next()){
               
               
                 String hashedPass = resultSet.getString("u_pass");
                 String rehashedPass =  passwordHasher.hashPassword(passs);
                 
                 System.out.println(""+hashedPass);
                 System.out.println(""+rehashedPass);
                 
               if(hashedPass.equals(rehashedPass)){    
               status = resultSet.getString("status");
               type = resultSet.getString("u_type");
               Session sess = Session.getInstance();
               sess.setUid(resultSet.getInt("u_id"));
               sess.setU_fname(resultSet.getString("u_fname"));
               sess.setU_lname(resultSet.getString("u_lname"));
               sess.setU_fname(resultSet.getString("u_fname"));
               sess.setU_contact(resultSet.getString("u_contact"));
               sess.setU_type(resultSet.getString("u_type"));
               sess.setU_email(resultSet.getString("u_email"));
               sess. setU_un(resultSet.getString("u_un"));
               return true;
               
         }else{
         return false;
 }
  
        }else{
         return false;
        }
        }catch (SQLException | NoSuchAlgorithmException ex) {
         return false;
        }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passs = new javax.swing.JPasswordField();
        regs = new javax.swing.JLabel();
        blexit = new javax.swing.JButton();
        blogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mainpanel.setBackground(new java.awt.Color(103, 10, 10));
        Mainpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGN IN");
        Mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, -1));

        username.setBackground(new java.awt.Color(103, 10, 10));
        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        Mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 270, 50));

        passs.setBackground(new java.awt.Color(103, 10, 10));
        passs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        Mainpanel.add(passs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 259, 270, 50));

        regs.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        regs.setForeground(new java.awt.Color(255, 255, 255));
        regs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regs.setText("New User? Click Here to Register!");
        regs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regsMouseClicked(evt);
            }
        });
        Mainpanel.add(regs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 397, 270, 20));

        blexit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        blexit.setText("Exit");
        blexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        blexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blexitActionPerformed(evt);
            }
        });
        Mainpanel.add(blexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 90, 30));

        blogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        blogin.setText("Login");
        blogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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
        Mainpanel.add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
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
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JButton blexit;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passs;
    private javax.swing.JLabel regs;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
