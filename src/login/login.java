/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.Toolkit;
import koneksi.conek;
import login.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imam
 */
public class login extends javax.swing.JFrame {

    public static String user;
    private Dimension dmn = Toolkit.getDefaultToolkit().getScreenSize();
    public java.sql.Connection con;
    private String sql;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private DefaultTableModel dtm;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        this.setLocation(dmn.width/2-this.getWidth()/2,dmn.height/2-this.getHeight()/2);
        this.setTitle("koneksi");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        log1 = new javax.swing.JButton();
        username1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(208, 19, 19));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log1.setText("login");
        log1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log1ActionPerformed(evt);
            }
        });
        log1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                log1KeyPressed(evt);
            }
        });
        getContentPane().add(log1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 106, -1));

        username1.setToolTipText("");
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 170, 30));

        jLabel1.setText("username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel2.setText("password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jButton1.setText("keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 94, -1));
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log1ActionPerformed
        // TODO add your handling code here:
        aksi_login();
        
        
        
     /**
        try {
        String url="jdbc:mysql://localhost:3306/toko";
        String user="root";
        String pass="";
        
        java.sql.Connection conn = (java.sql.Connection) koneksi.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select * from user where username='"+username1.getText()+"'");
        if(sql.next()){
            if(pass1.getText().equals(sql.getString("password"))){
            this.dispose();
            JOptionPane.showMessageDialog(null, "login berhasil");
            }
            else{
                JOptionPane.showMessageDialog(null, "username dan password salah");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "username dan password tidak tersedia");
        }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "terjadi kesalahan");
        }
        */
        
    }//GEN-LAST:event_log1ActionPerformed

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        this.setVisible(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void log1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_log1KeyPressed
        // TODO add your handling code here:
        aksi_login();
    }//GEN-LAST:event_log1KeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JButton log1;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables

    private void aksi_login() {                
          
      
       
        try{
        String akses ="";
        Connection _Cnn;
        conek getCnn = new conek();
        _Cnn= null;
        _Cnn= (Connection) getCnn.getConnection();
       String sql = "  SELECT username,password,level " +
                    "       FROM user " +
                    "       WHERE username='"+username1.getText().replaceAll("'", "")+"' " +
                    "           AND password = '"+ jpass.getText().replaceAll("'", "")+"'";
        Statement stat = _Cnn.createStatement();
        ResultSet res = stat.executeQuery(sql);
        
        while(res.next()){
        user = res.getString(3);
        akses="-";
        this.setVisible(false);
        menu x = new menu(user);
        x.setVisible(true);
        
        }
        if(akses.equals("")){
        JOptionPane.showMessageDialog(this,"periksa kembali");
        }
        
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }//To change body of generated methods, choose Tools | Templates.
    }
 private void updatemember(String tingkatan,String member) {
         
         String sql1="Update member Set tingkatan=  ? where idmember=?";
    try {        
  
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        
            com.mysql.jdbc.PreparedStatement st=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql1);
            st.setString(1, tingkatan); 
            st.setString(2, member);
            
           
         
            st.executeUpdate();
            st.close();
            
    }catch(SQLException e) {
//        /System.out.println(e);
         JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
   
    }
    
    

