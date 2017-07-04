/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import domain.Anggota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author imam
 */
public class AnggotaTableModel extends AbstractTableModel{
    List<Anggota> listOfAnggota=new ArrayList<Anggota>();
    
    private final String[] header={"ID","Nama","Alamat","HP","BB","Email","Tingkatan","Nama Foto"};
    
    public AnggotaTableModel(List<Anggota> listOfAnggota){
        this.listOfAnggota=listOfAnggota;
    }
    
    public void save(Anggota anggota){
        listOfAnggota.add(anggota);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    
     public Anggota findOne(int index){
        return listOfAnggota.get(index);
    }
    
     @Override
    public int getRowCount() {
        return listOfAnggota.size();
    }
    
    @Override
    public int getColumnCount() {
        return header.length;
    }
    
    @Override
    public String getColumnName(int column){
        return header[column];
    }
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anggota anggota=listOfAnggota.get(rowIndex);
        
        switch(columnIndex){
            case 0:return anggota.getIdmember();
            case 1:return anggota.getNama();
            case 2:return anggota.getAlamat();
            case 3:return anggota.getHp();
            case 4:return anggota.getBb();
            case 5:return anggota.getEmail();
            case 6:return anggota.getTingkatan();
            case 7:return anggota.getFoto();
            default:return null;
        }
    }
}
