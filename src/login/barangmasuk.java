/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import koneksi.conek;

/**
 *
 * @author imam
 */
public class barangmasuk extends javax.swing.JFrame {

     Connection _Cnn;
    conek getCnn = new conek();
     SimpleDateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
      
    SimpleDateFormat dateformat2 = new SimpleDateFormat("YYYY-MM-dd");
    int count = 0,stok_awal;
    String idpenjualan, idbarang, idhapus, ubah;
    boolean belumtransaksi = false;
    double total;
    
      Statement statement ;
       ResultSet resultSet;
    
       public String id,nama,jenis,ukuran,brand,warna;

 public String getId() {
        return id;
    }
 public String getNama(){
           return nama;
    }
 public String getJenis(){
        return jenis;
    }
 public String getUkuran() {
        return ukuran;
    }
 public String getBrand() {
        return brand;
    } 
        public String getWarna() {
        return warna;
    } 
       
    /**
     * Creates new form barangmasuk
     */
    public barangmasuk() {
        initComponents();
        loadData();
        tampilkan();
        form_awal();
    }

      public Connection con;
    private String sql;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private DefaultTableModel dtm;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jnm = new javax.swing.JTextField();
        jjumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtgl = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jjenis = new javax.swing.JTextField();
        jbrand = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jukuran = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jwarna = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtoko = new javax.swing.JTextField();
        jkaryawan = new javax.swing.JTextField();
        Karyawan = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(49, 163, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "FORM BARANG MASUK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jPanel2.setBackground(new java.awt.Color(132, 196, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Navigasi"));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add_1.png"))); // NOI18N
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Trash.png"))); // NOI18N
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btntambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(132, 196, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Form Input"));

        jLabel1.setText("ID Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Tanggal Masuk");

        jLabel6.setText("Jenis Pakaian");

        jLabel7.setText("Brand");

        jLabel9.setText("Ukuran");

        jLabel10.setText("Warna");

        jLabel11.setText("Dari Toko");

        Karyawan.setText("Karayawan");

        jButton1.setText("Ambil Barang");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jjumlah)
                    .addComponent(jbrand, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jid)
                    .addComponent(jnm)
                    .addComponent(jjenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(Karyawan))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jkaryawan)
                    .addComponent(jtgl, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jukuran)
                    .addComponent(jwarna)
                    .addComponent(jtoko))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jtgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtoko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Karyawan))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(132, 196, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Tabel Barang Masuk"));

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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1414, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
       tampilkan();
        simpan();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        form_enable();
        jid.requestFocus(true);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        tampilkan();
        delete();
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          ambilbarangmasuk fDB = new ambilbarangmasuk();
        fDB.fAB = this;
        fDB.setVisible(true);
        fDB.setResizable(false);
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
            java.util.logging.Logger.getLogger(barangmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barangmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barangmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barangmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barangmasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Karyawan;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jbrand;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jjenis;
    private javax.swing.JTextField jjumlah;
    private javax.swing.JTextField jkaryawan;
    private javax.swing.JTextField jnm;
    private com.toedter.calendar.JDateChooser jtgl;
    private javax.swing.JTextField jtoko;
    private javax.swing.JTextField jukuran;
    private javax.swing.JTextField jwarna;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        
    }

    private void simpan() {
        
        
        
        String kode = this.jid.getText();
        String nama = this.jnm.getText();
        String pakaian = this.jjenis.getText();
        String ukuran = this.jukuran.getText();
        String brand = this.jbrand.getText();
        
        String warna = this.jwarna.getText();
        String jumlah = this.jjumlah.getText();
        java.util.Date tgl=(java.util.Date) this.jtgl.getDate();
        String toko = this.jtoko.getText();
        String karyawan = this.jkaryawan.getText();
      
     try {
                String sql1="select * from brgmsk where id_barang='" + kode + "' AND warna='" + warna + "'";
                
                conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
            
            com.mysql.jdbc.PreparedStatement st=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql1);
            ResultSet rs=st.executeQuery(sql1);
             if (rs.next())
             {
             String sql = "UPDATE brgmsk Set jumlah=jumlah +? where id_barang='" + kode + "' AND warna='" + warna + "'";
             com.mysql.jdbc.PreparedStatement p2=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
             
             p2.setString(1, jumlah);
             p2.executeUpdate();
             p2.close();
            this.updatebarang(jumlah, kode , warna);
             }else{
             String sql = "Insert into brgmsk values (?,?,?,?,?,?,?,?,?,?)";
             com.mysql.jdbc.PreparedStatement p=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
             p.setString (1, kode);
             p.setString(2, nama);
             p.setString(3, pakaian);
             p.setString(4, ukuran);
             p.setString(5, brand);
           
             p.setString(6, warna);
             p.setString(7, jumlah);
              p.setDate(8,  new java.sql.Date(tgl.getTime())); 
              p.setString(9, toko);
              p.setString(10, karyawan);
              
               p.executeUpdate();
            p.close();
              this.updatebarang(jumlah, kode, warna);
             }
                
                
     }catch(Exception e){
            //System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
     }
     
     finally{
            
     }
     
     
    }

    private void updatebarang(String jumlah, String kode , String warna) {
        
        //String sql1="Update barang Set jumlah=jumlah - ? where id_barang=?";
       String sql1="UPDATE barang SET jumlah=jumlah + ? where id_barang=? ";
       //String sql1="UPDATE barang SET jumlah=jumlah + ? where id_barang='" + kode + "' AND warna='" + warna + "'";
        
     try {
         
         conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        
            com.mysql.jdbc.PreparedStatement st=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql1);
            st.setString(1, jumlah);
            st.setString(2, kode);
                       
            st.executeUpdate();
            st.close();
     
     }catch(SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
     }
        
    }
    
     private void tampilkan(){
    
    DefaultTableModel tabelpegawai = new DefaultTableModel();
        tabelpegawai.addColumn("ID Barang");
        tabelpegawai.addColumn("Nama Barang");
        tabelpegawai.addColumn("Pakaian");
        tabelpegawai.addColumn("Ukuran");
        tabelpegawai.addColumn("Brand");
      
        tabelpegawai.addColumn("WAarna");
        tabelpegawai.addColumn("Jumlah");
        tabelpegawai.addColumn("Tanggal Keluar");
        tabelpegawai.addColumn("Toko Tujuan");
         tabelpegawai.addColumn("Karyawan");
       
        
        try {
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        //String sql = "select * from penjualan where no_transaksi like '%" + jpenjualan.getText() +"%'";
        String sql = "select * from brgmsk ";
        Statement stat = con.createStatement();
        ResultSet res=stat.executeQuery(sql);
        while (res.next()){
            tabelpegawai.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)
            ,res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
        }
        jTable1.setModel(tabelpegawai);
        } catch(Exception t){
        
            JOptionPane.showMessageDialog(null, t.getMessage());
        }
        
        
    }

    private void form_awal() {
        //To change body of generated methods, choose Tools | Templates.
        jid.setEnabled(false);
         jnm.setEnabled(false);
        jjenis.setEnabled(false);
        jbrand.setEnabled(false);
        jjumlah.setEnabled(false);
        
        jukuran.setEnabled(false);
        jwarna.setEnabled(false);
        jtgl.setEnabled(false);
        jtoko.setEnabled(false);
        
        btnsimpan.setEnabled(false);
        btndelete.setEnabled(false);
        
    }

    private void form_enable() {
         //To change body of generated methods, choose Tools | Templates.
         
         jid.setEnabled(true);
         jnm.setEnabled(true);
        jjenis.setEnabled(true);
        jbrand.setEnabled(true);
        jjumlah.setEnabled(true);
        
        jukuran.setEnabled(true);
        jwarna.setEnabled(true);
        jtgl.setEnabled(true);
        jtoko.setEnabled(true);
        
        btnsimpan.setEnabled(true);
        btndelete.setEnabled(true);
         
    }

    private void delete() {
         //To change body of generated methods, choose Tools | Templates.
         int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Mendelete record ini???", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
       if (ok==0)
       {
        try
         {
            String sql="delete from brgmsk where id_barang='"+jid.getText()+"'";
            PreparedStatement st=con.prepareStatement(sql);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Data Sukses");
            
           // kosong();
        tampilkan();
         }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Delete Data Gagal");
        }
       }
    }
     void itemTerpilih() {
         //To change body of generated methods, choose Tools | Templates.
         ambilbarangmasuk fDB = new ambilbarangmasuk();
        fDB.fAB = this;
        jid.setText(id);
        jnm.setText(nama);
        jjenis.setText(jenis);
        jukuran.setText(ukuran);
        jbrand.setText(brand);
         jwarna.setText(warna);
        //txtNama.setText(nama);
        
    }
    
}
