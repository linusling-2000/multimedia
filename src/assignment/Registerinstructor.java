/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.*;
import java.sql.*;
/**
 *
 * @author User
 */
public class Registerinstructor extends javax.swing.JFrame {

    /**
     * Creates new form Registerinstructor
     */
    public Registerinstructor() {
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

        instname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        instid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        instpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        instdate = new com.toedter.calendar.JDateChooser();
        instaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jReturnButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 570));
        getContentPane().setLayout(null);
        getContentPane().add(instname);
        instname.setBounds(230, 120, 260, 29);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 120, 60, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Instructor ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 170, 110, 25);
        getContentPane().add(instid);
        instid.setBounds(230, 170, 260, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 220, 90, 25);
        getContentPane().add(instpassword);
        instpassword.setBounds(230, 220, 260, 31);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Birth Date:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 280, 90, 25);

        instdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        getContentPane().add(instdate);
        instdate.setBounds(230, 280, 260, 30);
        getContentPane().add(instaddress);
        instaddress.setBounds(230, 330, 260, 132);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Address:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 330, 90, 25);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 470, 83, 36);

        jReturnButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jReturnButton1.setText("Cancel");
        jReturnButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jReturnButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jReturnButton1);
        jReturnButton1.setBounds(320, 470, 75, 36);

        jPanel1.setBackground(java.awt.Color.gray);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Register Instructor Account Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 30, 360, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/abstract-background-1061121_640.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, -6, 640, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jReturnButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReturnButton1MouseClicked
        adminmenu am = new adminmenu();
        am.setVisible(true);
        am.pack();
        am.setLocationRelativeTo(null);
        am.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jReturnButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Connection con;
        Connectiondatabase Rcon = new Connectiondatabase();
        con = Rcon.getConnection();
        String query = "insert into instructor (name, id, password, birthdate, address) values (?, ?, ?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, instname.getText());
            pst.setString(2, instid.getText());
            pst.setString(3, new String(instpassword.getPassword()));
            pst.setString(4, ((JTextField)instdate.getDateEditor().getUiComponent()).getText());
            pst.setString(5, instaddress.getText());
            JOptionPane.showMessageDialog(null, "REGISTER SUCCESSFULLY");
            pst.executeUpdate();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"REGISTER FAILED"+ ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registerinstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerinstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerinstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerinstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registerinstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField instaddress;
    private com.toedter.calendar.JDateChooser instdate;
    private javax.swing.JTextField instid;
    private javax.swing.JTextField instname;
    private javax.swing.JPasswordField instpassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jReturnButton1;
    // End of variables declaration//GEN-END:variables
}
