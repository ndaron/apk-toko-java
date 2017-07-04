/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import koneksi.conek;

import service.AnggotaService;
import domain.Anggota;
import tablemodel.AnggotaTableModel;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FileUtils;
import koneksi.memberdb;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author imam
 */
public class tambahmember extends javax.swing.JFrame {

 JasperReport jasRep;
    JasperDesign jasDes;
    JasperPrint jasPri;
    Map<String, Object> idmember = new HashMap<String, Object>();
    
    private DefaultTableModel tabelpegawai;

  AnggotaService anggotaService;
  AnggotaTableModel anggotaTableModel;
  File file;
  JFileChooser jfc;
   
   private String sql;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
  public Connection con;  
  
  
  
  
  Connection _Cnn;
    conek getCnn = new conek();
    String _user;
    private Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    
    /**
     * Creates new form tambahmember
     */
    public tambahmember() {
        initComponents();
        initTable();
        tampilkandata();
        loadcombodata();
        form_awal();
    }
    
    
    private void initTable(){
       
    /*
        jTableMember.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    int row=jTableMember.getSelectedRow();
                    Anggota anggota=anggotaTableModel.findOne(row);
                    
                    Toolkit toolkit=Toolkit.getDefaultToolkit();
                    
                    String path=new File(".").getCanonicalPath();
                    Image image=toolkit.getImage(path+"/image/"+anggota.getFoto());
    //                Image image=toolkit.getImage(getClass().getResource("/image/"+book.getImage()));
                    Image imagedResized=image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
                    ImageIcon icon=new ImageIcon(imagedResized);
                    jlabelgambar.setIcon(icon);
                } catch (IOException ex) {
                    Logger.getLogger(tambahmember.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
            anggotaService=conek.getAnggotaService();
            anggotaTableModel=new AnggotaTableModel(anggotaService.findAll());
            jTableMember.setModel(anggotaTableModel);
       */
    
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnsmpn = new javax.swing.JButton();
        btngmbr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnmembercard = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlabelgambar = new javax.swing.JLabel();
        jfoto = new javax.swing.JTextField();
        jlabelfoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtextid = new javax.swing.JTextField();
        jnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jalamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jhp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMember = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(49, 163, 246));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "FORM TAMBAH MEMBER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jPanel3.setBackground(new java.awt.Color(132, 196, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Navigasi"));

        btnsmpn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        btnsmpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsmpnActionPerformed(evt);
            }
        });

        btngmbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/link-icon-video.png"))); // NOI18N
        btngmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngmbrActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add_1.png"))); // NOI18N
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modify.png"))); // NOI18N
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnmembercard.setText("Kartu Member");
        btnmembercard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmembercardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnmembercard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btngmbr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsmpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntambah)
                            .addComponent(btnedit))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngmbr)
                    .addComponent(btntambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsmpn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnmembercard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(132, 196, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Foto"));

        jlabelgambar.setBorder(new javax.swing.border.MatteBorder(null));

        jlabelfoto.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelfoto)
                .addGap(18, 18, 18)
                .addComponent(jlabelgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(132, 196, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Form Input"));

        jLabel2.setText("ID Member");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("No. HP");

        jLabel6.setText("Pin. BB");

        jLabel7.setText("Email");

        jLabel8.setText("Tingkatan");

        jLabel9.setText("Nama Toko");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jhp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextid, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnama, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(60, 60, 60)
                        .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(51, 51, 51)
                        .addComponent(jbb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtextid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jemail)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("0000-00-00");

        jPanel4.setBackground(new java.awt.Color(132, 196, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Tabel Member"));

        jTableMember.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMemberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMember);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btngmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngmbrActionPerformed
        // TODO add your handling code here:
         jfc=new JFileChooser();
        if(jfc.showOpenDialog(jlabelgambar)==JFileChooser.APPROVE_OPTION){
            
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized=image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
            
            jlabelgambar.setIcon(imageIcon);
            jlabelfoto.setText(jfc.getSelectedFile().getName());
            
            file=new File(jfc.getSelectedFile().getPath());
            
        }
        
        
    }//GEN-LAST:event_btngmbrActionPerformed

    private void btnsmpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsmpnActionPerformed
        // TODO add your handling code here:
         
        
       try {
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        String sql="insert into member values('"+jtextid.getText()
                +"','"+jnama.getText()
                +"','"+jalamat.getText()
                +"','"+jhp.getText()
                +"','"+jbb.getText()
                +"','"+jemail.getText()
                +"','"+jComboBox1.getSelectedItem()
                +"','"+jlabelfoto.getText()
                +"','"+jLabel10.getText()
                +"','"+jt.getText()+"')";
        st=con.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data sukses tersimpan");
        
      
        
        } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Data GAGAl");
            }
        
        
        /*
        Anggota anggota=new Anggota();
        anggota.setIdmember(jtextid.getText());
        anggota.setNama(jnama.getText());
        anggota.setAlamat(jalamat.getText());
        anggota.setHp(jhp.getText());
        anggota.setBb(jbb.getText());
        anggota.setEmail(jemail.getText());
        anggota.setFoto(jlabelfoto.getText());
        */
      //  anggotaService.save(anggota);
       // anggotaTableModel.save(anggota);
        try {
            String path=new File(".").getCanonicalPath();
            FileUtils.copyFileToDirectory(file, new File(path+"/image"));
        } catch (IOException ex) {
            Logger.getLogger(tambahmember.class.getName()).log(Level.SEVERE, null, ex);
        }
        tampilkandata();
    }//GEN-LAST:event_btnsmpnActionPerformed

    private void jTableMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMemberMouseClicked
        // TODO add your handling code here:
         int i=jTableMember.getSelectedRow();
        if(i==-1)
        {
            return;
        }
        String id=(String) jTableMember.getValueAt(i, 0);
        jtextid.setText(id);
        String nama=(String) jTableMember.getValueAt(i, 1);
        jnama.setText(nama);
        String alamat=(String) jTableMember.getValueAt(i, 2);
        jalamat.setText(alamat);
        String hp=(String) jTableMember.getValueAt(i, 3);
        jhp.setText(hp);
        String bb=(String) jTableMember.getValueAt(i, 4);
        jbb.setText(bb);
        String email=(String) jTableMember.getValueAt(i, 5);
        jemail.setText(email);
      
        String foto=(String) jTableMember.getValueAt(i, 7);
        jfoto.setText(foto);
        String toko=(String) jTableMember.getValueAt(i, 8);
        jt.setText(toko);
         Toolkit toolkit=Toolkit.getDefaultToolkit();
          Image image=toolkit.getImage(System.getProperty("user.dir")+"/image/"+foto);
            Image imagedResized=image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
       jlabelgambar.setIcon(imageIcon);
    }//GEN-LAST:event_jTableMemberMouseClicked

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        form_tambah();
        jtextid.requestFocus(true);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
         try
            {           //"UPDATE penjualan Set jumlah=jumlah + ?,totalharga= totalharga + ? where no_transaksi='" + kode + "' AND kd_barang='" + KodeBar + "'";
                String sql="update member set idmember=?,nama=?,alamat=?,hp=? ,bb=? ,email=? ,tingkatan=? , toko=? where idmember='"+jtextid.getText()+"'";
                //String sql="update barang set id_barang=?,nama_barang=?,ukuran=? ,jenis=? ,kategori=? ,warna=? ,harga=? ,jumlah=? where id_barang=? and warna='"+jbarang.getText()+"'"+jwarna.getText()+"'";
                PreparedStatement st=con.prepareStatement(sql);
                if(ok==0)
                {
                try
                    {
                        st.setString(1,jtextid.getText());
                        st.setString(2,jnama.getText());
                        st.setString(3,jalamat.getText());
                        st.setString(4,jhp.getText());
                        st.setString(5,jbb.getText());
                        st.setString(6,jemail.getText());
                        st.setString(7, (String) jComboBox1.getSelectedItem());
                        st.setString(8, jt.getText());
                        
                        
                        
                                            
                        
                        st.executeUpdate();
                        
                   //     kosong();
        tampilkandata();

                        JOptionPane.showMessageDialog(null,"Update Data Sukses");
                    }catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
           }catch (Exception e){}
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btnmembercardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmembercardActionPerformed
        // TODO add your handling code here:
        print();
    }//GEN-LAST:event_btnmembercardActionPerformed

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
            java.util.logging.Logger.getLogger(tambahmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambahmember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btngmbr;
    private javax.swing.JButton btnmembercard;
    private javax.swing.JButton btnsmpn;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMember;
    private javax.swing.JTextField jalamat;
    private javax.swing.JTextField jbb;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jfoto;
    private javax.swing.JTextField jhp;
    private javax.swing.JLabel jlabelfoto;
    private javax.swing.JLabel jlabelgambar;
    private javax.swing.JTextField jnama;
    private javax.swing.JTextField jt;
    private javax.swing.JTextField jtextid;
    // End of variables declaration//GEN-END:variables

    private void tampilkandata() {
        
DefaultTableModel tabelpegawai = new DefaultTableModel();
        tabelpegawai.addColumn("ID");
        tabelpegawai.addColumn("NAMA");
        tabelpegawai.addColumn("ALAMAT");
        tabelpegawai.addColumn("HP");
        tabelpegawai.addColumn("BB");
        tabelpegawai.addColumn("EMAIL");
        tabelpegawai.addColumn("TINGKATAN");
        tabelpegawai.addColumn("FOTO");
        tabelpegawai.addColumn("NAMA TOKO");
        
        try {
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
        String sql = "select idmember, nama, alamat, hp, bb, email, tingkatan, foto, toko  from member ";
        Statement stat = con.createStatement();
        ResultSet res=stat.executeQuery(sql);
        while (res.next()){
            tabelpegawai.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)
            ,res.getString(6),res.getString(7),res.getString(8),res.getString(9)});
        }
        jTableMember.setModel(tabelpegawai);
        } catch(Exception e){}

//To change body of generated methods, choose Tools | Templates.
    }

    private void loadcombodata() {
    
          try {        
        jComboBox1.removeAllItems();
        
        conek getCnn = new conek();
        con= null;
        con= (com.mysql.jdbc.Connection) getCnn.getConnection();
                    
        
            Statement s= con.createStatement();
            String sql="Select * from tingkatan";
            ResultSet r=s.executeQuery(sql);
            
            while (r.next()) {
                jComboBox1.addItem(r.getString("tingkatan"));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan");
        } 
    
    }

    private void form_tambah() {
         //To change body of generated methods, choose Tools | Templates.
         btnedit.setEnabled(true);
         jtextid.setEnabled(true);
        jnama.setEnabled(true);
        jalamat.setEnabled(true);
        jhp.setEnabled(true);
        jbb.setEnabled(true);
        jemail.setEnabled(true);
        jComboBox1.setEnabled(true);
        jt.setEnabled(true);
        jfoto.setEnabled(true);
        
        btngmbr.setEnabled(true);
        btnsmpn.setEnabled(true);
        jButton1.setEnabled(true);
         
    }

    private void form_awal() {
         //To change body of generated methods, choose Tools | Templates.
         btnedit.setEnabled(false);
          jtextid.setEnabled(false);
        jnama.setEnabled(false);
        jalamat.setEnabled(false);
        jhp.setEnabled(false);
        jbb.setEnabled(false);
        jemail.setEnabled(false);
        jComboBox1.setEnabled(false);
        jt.setEnabled(false);
        jfoto.setEnabled(false);
        
        btngmbr.setEnabled(false);
        btnsmpn.setEnabled(false);
        jButton1.setEnabled(false);
         
    }

    private void print() {
         //To change body of generated methods, choose Tools | Templates.
         
        try{
         Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://localhost/memberbarcode/"+jtextid.getText()));
        }catch(Exception e) {
        
        }
    
}
}
