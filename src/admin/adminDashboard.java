/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import javax.swing.JOptionPane;
import myapp.loginForm;

/**
 *
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard() {
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

        navi = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        Mainpanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gouser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navi.setBackground(new java.awt.Color(103, 10, 10));
        navi.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        navi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_name.setForeground(new java.awt.Color(255, 255, 255));
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("ADMIN");
        navi.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 40));

        acc_lname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_lname.setForeground(new java.awt.Color(255, 255, 255));
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("ADMIN");
        navi.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 40));

        getContentPane().add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 280, 570));

        Mainpanel.setBackground(new java.awt.Color(122, 0, 0));
        Mainpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(92, 0, 0));
        Header.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Header.setForeground(new java.awt.Color(255, 204, 102));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Admin Dashboard");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 430, 80));

        Mainpanel.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        gouser.setBackground(new java.awt.Color(102, 102, 102));
        gouser.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gouser.setText("USERS");
        gouser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        gouser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gouserMouseClicked(evt);
            }
        });
        gouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gouserActionPerformed(evt);
            }
        });
        Mainpanel.add(gouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 120, 40));

        getContentPane().add(Mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gouserActionPerformed
        
    }//GEN-LAST:event_gouserActionPerformed

    private void gouserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gouserMouseClicked
       adminUsers adu = new adminUsers();
       adu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gouserMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    Session sess = Session.getInstance();
    if(sess.getUid()==0){
    JOptionPane.showMessageDialog(null, " No Account, Log in sah!");
    loginForm lf = new loginForm();
    lf.setVisible(true);
    this.dispose(); 
}else{
acc_name.setText(""+sess.getU_fname());
acc_lname.setText(""+sess.getU_lname());
    }//GEN-LAST:event_formWindowActivated
    
    
    }
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_name;
    private javax.swing.JButton gouser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel navi;
    // End of variables declaration//GEN-END:variables
}
