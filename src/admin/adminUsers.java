/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 */
public class adminUsers extends javax.swing.JFrame {

    /**
     * Creates new form adminUsers
     */
    public adminUsers() {
        initComponents();
        displayData();
        
    }
    Color navcolor = new Color(255,255,255);
    Color hovercolor = new Color(0,204,204);

    public void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_contact, u_email, status FROM users");
            usersTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navi = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        p_add = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Mainpanel.setBackground(new java.awt.Color(0, 153, 153));
        Mainpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 204, 204));
        Header.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Header.setForeground(new java.awt.Color(255, 204, 102));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Users Form");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 840, 80));

        Mainpanel.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 80));

        navi.setBackground(new java.awt.Color(0, 102, 102));
        navi.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        navi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        navi.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 12));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("USERS");
        navi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Current User:");
        navi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 280, 40));

        acc_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        navi.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 280, 40));

        Mainpanel.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 280, 570));

        usersTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        Mainpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 700, 430));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Mainpanel.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 100, 40));

        p_add.setBackground(new java.awt.Color(255, 255, 255));
        p_add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_add.setText("ADD");
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_addActionPerformed(evt);
            }
        });
        Mainpanel.add(p_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 100, 40));

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        edit.setText("EDIT");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        Mainpanel.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        

    }//GEN-LAST:event_deleteActionPerformed

    private void p_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_addActionPerformed
addUser au = new addUser();
au.setVisible(true);
this.dispose();

    }//GEN-LAST:event_p_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

    }//GEN-LAST:event_editActionPerformed
        
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    Session sess = Session.getInstance();
    acc_id.setText(""+sess.getUid());

    }//GEN-LAST:event_formWindowActivated

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
   

        p_add.setBackground(hovercolor);
    
        
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
    
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = usersTable.getSelectedRow();
        
        if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Plss Select an Item"); 
        }else{    
            try{
             dbConnect dbc = new dbConnect();
            TableModel tbl = usersTable.getModel();
            ResultSet rs = dbc.getData("SELECT*FROM users WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
            if(rs.next()){   
                
                 addUser au = new addUser();
                 au.uid.setText(""+rs.getInt("u_id"));
                  au.fname.setText(""+rs.getString("u_fname"));
                  au.lname.setText(""+rs.getString("u_lname"));
                  au.phone.setText(""+rs.getString("u_contact")); 
                  au.email.setText(""+rs.getString("u_email"));
                  au.un.setText(""+rs.getString("u_un"));
                  au.pass.setText(""+rs.getString("u_pass"));
                  au.type.setSelectedItem(""+rs.getString("u_type"));
                  au.ut.setSelectedItem(""+rs.getString("status"));
                  au.add.setEnabled(false);
                  au.update.setEnabled(true);
                   au.setVisible(true);
                   this.dispose();
            }  
        }catch(SQLException ex){
            
                System.out.println(""+ex);
        
    }                                        
        }
        
        
       
        
        
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
  
    }//GEN-LAST:event_deleteMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(hovercolor);
    }//GEN-LAST:event_editMouseEntered

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
 delete.setBackground(hovercolor);        
    }//GEN-LAST:event_deleteMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
      edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
         delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
    addUser au = new addUser();
    au.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_p_addMouseClicked

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
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JLabel acc_id;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel navi;
    private javax.swing.JButton p_add;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
