/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.table.*;
import java.lang.*;

public class Uploadhw extends javax.swing.JFrame {

    private String id;
    private String name;
    
    public Uploadhw() {
        initComponents();
    }

    public ArrayList<Homework> courselist(){
     ArrayList<Homework> courselist = new  ArrayList<>();
     try{
     Connection con;
        Connectiondatabase Rcon = new Connectiondatabase();
        con = Rcon.getConnection();
        String query = "select * from homework";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        Homework hw;
        while(rs.next()){
            hw= new Homework(rs.getInt("id"), rs.getString("homedes"));
            courselist.add(hw);
        }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
     return courselist;
    }
    
        
    public void setid(String id) {
        this.id = id;
    }
    
    public String getstudentid() {
        return id;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    
    public String getstudentname() {
        return name;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        uploadbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 560));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Check Homework and Upload Homework:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 60, 380, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Please write your Student ID and your Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 90, 400, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("(Leave Comment if any Questions)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 120, 330, 40);

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 170, 350, 120);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(60, 310, 350, 120);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Check Homework");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 210, 150, 49);

        uploadbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uploadbutton.setText("Upload");
        uploadbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadbutton);
        uploadbutton.setBounds(440, 340, 150, 46);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setText("Return to Home");
        jButton1.setMaximumSize(new java.awt.Dimension(73, 29));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 29));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 29));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 459, 154, 40);

        jPanel1.setBackground(java.awt.Color.gray);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Upload HomeWork");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 10, 360, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/abstract-background-1061121_640.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, -6, 640, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        text.setText("");
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/coursemanagementsystem", "root", "");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT file FROM homework ");
            while (rs.next()) {
                String id = rs.getString("file");
                text.setText(text.getText() + "\n");
                text.setText(text.getText() + "Homework/Message: " + id + "\n");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uploadbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbuttonActionPerformed
        Connection con;
        Connectiondatabase Rcon = new Connectiondatabase();
        con = Rcon.getConnection();
        String query = "insert into answer (answer) values (?)";
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jTextField1.getText());
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY");
            pst.executeUpdate();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"FAILED"+ ex);
        }
    }//GEN-LAST:event_uploadbuttonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Studenthome sh = new Studenthome();
        sh.setVisible(true);
        sh.pack();
        sh.setLocationRelativeTo(null);
        String id = getstudentid();
        String name = getstudentname();
        sh.setid(id);
        sh.studentid(id);
        sh.studentname(name);
        sh.setname(name);
        sh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Uploadhw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uploadhw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uploadhw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uploadhw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uploadhw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea text;
    private javax.swing.JButton uploadbutton;
    // End of variables declaration//GEN-END:variables
}
