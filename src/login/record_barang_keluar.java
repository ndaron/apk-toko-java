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

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import koneksi.conek;
/**
 *
 * @author imam
 */
public class record_barang_keluar extends javax.swing.JFrame {

    /**
     * Creates new form record_barang_keluar
     */
    public record_barang_keluar() {
        initComponents();
        loadtahun();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jctahunan = new javax.swing.JCheckBox();
        jctahun = new javax.swing.JComboBox<>();
        jcbulanan = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jccariharian = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jctgl = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_record = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 163, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "LAPORAN BARANG KELUAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jPanel2.setBackground(new java.awt.Color(132, 196, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Form Masukan"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jctahunan.setText("Record Tahunan");

        jctahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbulanan.setText("Record Bulanan");

        jLabel3.setText("Tahun");

        jccariharian.setText("Record Perhari");
        jccariharian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jccariharianMouseClicked(evt);
            }
        });

        jLabel1.setText("Tanggal");

        jctgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jLabel2.setText("Bulan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jctgl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jctahun, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jccariharian)
                        .addGap(18, 18, 18)
                        .addComponent(jcbulanan)
                        .addGap(18, 18, 18)
                        .addComponent(jctahunan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jctgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jctahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jccariharian)
                    .addComponent(jcbulanan)
                    .addComponent(jctahunan))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(132, 196, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Navigasi"));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add_1.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OK.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntambah)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(btntambah))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(132, 196, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Tabel Barang Keluar"));

        tabel_record.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabel_record);

        jScrollPane4.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jccariharianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jccariharianMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jccariharianMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jccariharian.isSelected()==true){

            //form_cari_harian();
            cariharian();
        } else if (jcbulanan.isSelected()==true){
            caribulanan();
        } else if(jctahunan.isSelected()==true){
            caritahunan();
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
            java.util.logging.Logger.getLogger(record_barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(record_barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(record_barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(record_barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new record_barang_keluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jcbulanan;
    private javax.swing.JCheckBox jccariharian;
    private javax.swing.JComboBox<String> jctahun;
    private javax.swing.JCheckBox jctahunan;
    private javax.swing.JComboBox<String> jctgl;
    private javax.swing.JTable tabel_record;
    // End of variables declaration//GEN-END:variables

    private void loadtahun() {
         //To change body of generated methods, choose Tools | Templates.
           try {        
        jctahun.removeAllItems();
        
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
                    
        
            Statement s= con.createStatement();
           
            
            String sql="Select YEAR(tgl_keluar) as tahun from brgkeluar group by YEAR(tgl_keluar)";
            ResultSet r=s.executeQuery(sql);
            
            while (r.next()) {
                jctahun.addItem(r.getString("tahun"));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan");
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void cariharian() {
         //To change body of generated methods, choose Tools | Templates.
         DefaultTableModel tabelpegawai = new DefaultTableModel();
         tabelpegawai.addColumn("ID BARANG ");
        tabelpegawai.addColumn("NAMA BARANG ");
        tabelpegawai.addColumn("JENIS PAKAIAN");
        tabelpegawai.addColumn("UKURAN ");
        tabelpegawai.addColumn("BRAND ");
        tabelpegawai.addColumn("KATEGORI ");
        tabelpegawai.addColumn("WARNA ");
        tabelpegawai.addColumn("JUMLAH ");
        tabelpegawai.addColumn("TGL MASUK ");
        tabelpegawai.addColumn("TOKO TUJUAN ");
        
         try {
            
           conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
  
 String sql="select * from brgkeluar where DAY(tgl_keluar)='"+jctgl.getSelectedItem()+"'AND MONTH(tgl_keluar)='"+jComboBox1.getSelectedItem()+"'AND YEAR(tgl_keluar)='"+jctahun.getSelectedItem()+"'";
 
 Statement stat = con.createStatement();
        ResultSet res=stat.executeQuery(sql);
            
           
            
            
            while (res.next()) {
                tabelpegawai.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)
                ,res.getString(9),res.getString(10)});
            }
           tabel_record.setModel(tabelpegawai);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
                    
          
        }
         
    }

    private void caribulanan() {
         //To change body of generated methods, choose Tools | Templates.
          DefaultTableModel tabelpegawai = new DefaultTableModel();
         tabelpegawai.addColumn("ID BARANG ");
        tabelpegawai.addColumn("NAMA BARANG ");
        tabelpegawai.addColumn("JENIS PAKAIAN");
        tabelpegawai.addColumn("UKURAN ");
        tabelpegawai.addColumn("BRAND ");
        tabelpegawai.addColumn("KATEGORI ");
        tabelpegawai.addColumn("WARNA ");
        tabelpegawai.addColumn("JUMLAH ");
        tabelpegawai.addColumn("TGL MASUK ");
        tabelpegawai.addColumn("TOKO TUJUAN ");
        
         try {
            
           conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
  
 String sql="select * from brgkeluar where  MONTH(tgl_keluar)='"+jComboBox1.getSelectedItem()+"'AND YEAR(tgl_keluar)='"+jctahun.getSelectedItem()+"'";
 
 Statement stat = con.createStatement();
        ResultSet res=stat.executeQuery(sql);
            
           
            
            
            while (res.next()) {
                tabelpegawai.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)
                ,res.getString(9),res.getString(10)});
            }
           tabel_record.setModel(tabelpegawai);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
                    
          
        }
    }

    private void caritahunan() {
         //To change body of generated methods, choose Tools | Templates.
          DefaultTableModel tabelpegawai = new DefaultTableModel();
         tabelpegawai.addColumn("ID BARANG ");
        tabelpegawai.addColumn("NAMA BARANG ");
        tabelpegawai.addColumn("JENIS PAKAIAN");
        tabelpegawai.addColumn("UKURAN ");
        tabelpegawai.addColumn("BRAND ");
        tabelpegawai.addColumn("KATEGORI ");
        tabelpegawai.addColumn("WARNA ");
        tabelpegawai.addColumn("JUMLAH ");
        tabelpegawai.addColumn("TGL MASUK ");
        tabelpegawai.addColumn("TOKO TUJUAN ");
        
         try {
            
           conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
  
 String sql="select * from brgkeluar where   YEAR(tgl_keluar)='"+jctahun.getSelectedItem()+"'";
 
 Statement stat = con.createStatement();
        ResultSet res=stat.executeQuery(sql);
            
           
            
            
            while (res.next()) {
             //   jTextField1.setText(res.getString(1));
               tabelpegawai.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)
              ,res.getString(9),res.getString(10)});
            }
           tabel_record.setModel(tabelpegawai);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
                    
          
        }
    }
}
