/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import koneksi.conek;

import java.sql.*;
import java.awt.*;
import java.lang.*;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import java.lang.NullPointerException;
import java.util.logging.Level;
import java.util.logging.Logger;

    import javax.swing.table.DefaultTableModel;  
    import javax.swing.table.TableModel;  


/**
 *
 * @author imam
 */
public class tambahpegawai extends javax.swing.JFrame {

    
    
    Connection _Cnn;
    conek getCnn = new conek();
    String _user;
    private Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    
    
    private DefaultTableModel dtm = new DefaultTableModel() {
        //membuat tabel tidak bisa diedit saat diklik  
        @Override
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
        }
    };
    
    /**
     * Creates new form tambahpegawai
     */
    public tambahpegawai() {
        initComponents();
        tampilkandata();
        form_awal();
        
      
       
    }
    
    public void refresh(){
      
        try{
        Object [] rows={"username","password","level"};
        dtm=new DefaultTableModel(null,rows);
        jTable1.setModel(dtm);
        jTable1.setBorder(null);
        int no = 1;
        String username="" ,password="" ,level="";
            try{
            String sql="select * from user";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
                while(rs.next()){
                    username=rs.getString("username");
                    password=rs.getString("password");
                    level=rs.getString("level");
                    
                    String [] tampil={""+username,password,level};
                    dtm.addRow(tampil);
                }
            } catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Query Salah" +e);
            }
        } catch (Exception e) {
        e.printStackTrace();}
       
    }
    
   
    
    public Connection con;
    private String sql;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
//    private DefaultTableModel dtm;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(49, 163, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "FORM USER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jPanel1.setBackground(new java.awt.Color(132, 196, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Navigasi"));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add_1.png"))); // NOI18N
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modify.png"))); // NOI18N
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Trash.png"))); // NOI18N
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(btndelete))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntambah)
                    .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndelete)
                    .addComponent(btnedit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jPanel3.setBackground(new java.awt.Color(132, 196, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Form Input"));

        jLabel2.setText("Nama");

        jLabel3.setText("Password");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kasironline", "kasiroffline", "gudang" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Hak Akses");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 157, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(132, 196, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Tabel Data Pegawai"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jScrollPane3.setViewportView(jScrollPane4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 452, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        
        if (bsimpan.getText().equals("simpan")){
            simpan();
        }else{
            ubah();
        }
     
        
    }//GEN-LAST:event_bsimpanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        /*
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        
        
   if ("".equals(jTextField1.getText()) || "".equals(jTextField2.getText()) 
                ) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
                if (rdLaki.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
            String sql = "UPDATE user SET "
                    + "username='"+jTextField1.getText()+"',"
                    + "JenisKelamin='"+JK+"'"
                    
                    + "WHERE NIS='"+txtNIS.getText()+"'";
             
             
           
        
            
            int status = st.execute(sql);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                tampilkandata();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        } 
        */
        
        /*
        try {
        String nama, pass,level ;
        nama = jTextField1.getText().trim();
        pass = jTextField2.getText().trim();
        
        
         conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
              
Statement st = con.createStatement();
        String sql = "UPDATE user SET username = '"+nama+"',"+"password = '"+pass+"', ;";
        st.execute(sql);
        st.close();
        JOptionPane.showMessageDialog(this, "Berhasil di Ubah");
        
tampilkandata();  //Klik link tampilkan untuk melihat sourcodenya
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Maaf Gagal Simpan" + ex);
        }
        
        */
        
        /*
        try{
            String value1 = jTextField1.getText();
            String value2 = jTextField2.getText();
            String value3 = jTextField3.getText();
        
            String sql="update user set username='"+value1+"' ,username ='"+value2+"' ,password='"+value3+"', level=' ";
        st=con.prepareStatement(sql);
        st.execute(sql);
        JOptionPane.showMessageDialog(null, "updated");
        
        } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        }
        */
        
        
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
         try
            {
                String sql="update user set username=?,password=?,level=? where username='"+jTextField1.getText()+"'";
                PreparedStatement st=con.prepareStatement(sql);
                if(ok==0)
                {
                try
                    {
                        st.setString(1,jTextField1.getText());
                        st.setString(2,jTextField2.getText());
                        st.setString(3, (String) jComboBox1.getSelectedItem());
                        
                        st.executeUpdate();
                        
                        kosong();
        tampilkandata();

                        JOptionPane.showMessageDialog(null,"Update Data Sukses");
                    }catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Update Data Gagal");
                    }
                }
           }catch (Exception e){}
        
        
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        hapus();
        /*
        try{
                _Cnn = null;
                _Cnn = getCnn.getConnection(); 
                String sqldelete = "delete from pos_profil where id_profil = '"+jTextField1.getText()+"'";
                Statement state = _Cnn.createStatement();
                state.executeUpdate(sqldelete);
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                }catch(SQLException e) {
                    JOptionPane.showConfirmDialog(null, "Ada kesalahan Input", "Informasi", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                } 
        
        */
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        tambah();
        pegawai();
        jTextField1.requestFocus(true);
       
    }//GEN-LAST:event_btntambahActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          int baris = jTable1.getSelectedRow();
        if (baris != -1) {
            jTextField1.setText(jTable1.getValueAt(baris, 0).toString());
            jTextField2.setText(jTable1.getValueAt(baris, 1).toString());
           
           // jComboBox1.getSelectedItem(jTable1.getValueAt(baris,3).toString())
            
            //txtKelas.setText(tblData.getValueAt(baris, 3).toString());
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(tambahpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambahpegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
    
    private void reset() {
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    private void simpan() {
        
        
        
        
        
        
           try {
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        String sql="insert into user values('"+jTextField1.getText()
                +"','"+jTextField2.getText()
                +"','"+jComboBox1.getSelectedItem()+"')";
        st=con.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data sukses tersimpan");
        
        kosong();
        tampilkandata();
        } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Data GAGAl");
            }
               
               
        
       
    }
    
    public void datatable(){
        
    
    
    }
    
   public void tampilkandata(){
    
       
        DefaultTableModel tabelpegawai = new DefaultTableModel();
        tabelpegawai.addColumn("Nama");
        tabelpegawai.addColumn("pass");
        tabelpegawai.addColumn("level");
        
        try {
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        String sql = "select * from user ";
        Statement stat = con.createStatement();
        ResultSet res=stat.executeQuery(sql);
        while (res.next()){
            tabelpegawai.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
        }
        jTable1.setModel(tabelpegawai);
        } catch(Exception e){}
        
        
    }
    
    
    
    public void aktif(){
    
    }

    private void kosong() {
        jTextField1.setText("");
        jTextField2.setText("");
        
//To change body of generated methods, choose Tools | Templates.
    }
    
     private void form_awal(){
        form_disable();
        form_clear();
        //LoadData();
        bsimpan.setText("simpan");
        bsimpan.setEnabled(false);
        btnedit.setEnabled(false);
        btndelete.setEnabled(false);
        
        jTextField1.setEnabled(false);
        jButton2.setEnabled(false);
        
    }

    private void form_disable() {
        
        jTextField2.setEnabled(false);
        jComboBox1.setEnabled(false);
        
        //To change body of generated methods, choose Tools | Templates.
    }

    private void form_clear() {
        
        jTextField1.setText("");
        jTextField2.setText("");
     
        jComboBox1.setSelectedIndex(0);
     
        //To change body of generated methods, choose Tools | Templates.
    }

    private void ubah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void hapus() {

 try{ 
                _Cnn = null;
                _Cnn = getCnn.getConnection();  
                String sqldelete = "delete from user where username = '"+jTextField1.getText()+"'";
                Statement state = _Cnn.createStatement();
                state.executeUpdate(sqldelete);
                form_awal();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                
                kosong();
        tampilkandata();
                }catch(SQLException e) { 
                    JOptionPane.showConfirmDialog(null, "Ada kesalahan Input", "Informasi", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                }       
        
//To change body of generated methods, choose Tools | Templates.
    }

    private void tambah() {

form_enable();
        btntambah.setEnabled(true);
        bsimpan.setEnabled(true);
        btndelete.setEnabled(true);
        btnedit.setEnabled(true);
                jButton2.setEnabled(true);

         
            
        
//To change body of generated methods, choose Tools | Templates.
    }

    private void pegawai() {
        
        String sql, strAwal = null;
        Integer pnj = null,j;
        try{          
            _Cnn = getCnn.getConnection();  
            sql = "select user from username";
            Statement state = _Cnn.createStatement();
            ResultSet res = state.executeQuery(sql);
            String s,s1;
            s=Integer.toString(res.getRow()+1);
            j=s.length();
            s1="";
            for(int i = 1;i<=pnj-j;i++){
                s1=s1+"0";
            }
           jTextField1.setText(strAwal+s1+s);
            //res.close();
            //state.close();          
           
         }catch(Exception e){
           
             //System.out.println("Pesan Error : "+e);
            //JOptionPane.showMessageDialog(null,"Maaf, Query tidak bisa dijalankan...!!!!");
         }
        //To change body of generated methods, choose Tools | Templates.
    }

    private void form_enable() {
        
           jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jComboBox1.setEnabled(true);
       
         //To change body of generated methods, choose Tools | Templates.
    }

    
}


