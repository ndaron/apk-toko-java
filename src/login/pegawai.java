/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import login.barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author imam
 */
public class pegawai extends AbstractTableModel{
    
    List<barang> barangs=new ArrayList<barang>();
    
    public List<barang> getMahasiswas(){
        return barangs;
    }
    
     private final String HEADER[]={"ID Barang","Nama Barang","Pakaian","Ukuran","Brand","Kategori","Warna","Harga","Jumlah"};
     
    public void save(barang Barang){
        barangs.add(Barang);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
 
    public int getRowCount() {
        return barangs.size();
    }
 
    public int getColumnCount() {
        return 4;
    }
    
    
    public String getColumnName(int i){
        return HEADER[i];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        barang Barang=barangs.get(rowIndex);
        
        switch(columnIndex){
            case 0: return Barang.getIDbar();
            case 1: return Barang.getNamabar();
            case 2: return Barang.getPakaian();
            case 3: return Barang.getUkuran();
            case 4: return Barang.getBrand();
            case 5: return Barang.getKate();
            case 6: return Barang.getWarna();
            case 7: return Barang.getHarga();
            case 8: return Barang.getJumlah();
            default: return null;
        }
    }   
    
}
