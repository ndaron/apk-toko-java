/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import koneksi.conek;

import domain.Anggota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author imam
 */
public class AnggotaDao {
    Connection connection;
    PreparedStatement preparedStatement;
    
    public void setConnection(Connection connection){
        this.connection=connection;
    }
    
    public void save(Anggota anggota) throws SQLException {
        preparedStatement=connection.prepareStatement
        ("insert into member(idmember,nama,alamat,hp,bb,email,tingkatan,foto) values(?,?)");
        preparedStatement.setString(1,anggota.getIdmember());
        preparedStatement.setString(2,anggota.getNama());
        preparedStatement.setString(3,anggota.getAlamat());
        preparedStatement.setString(4,anggota.getHp());
        preparedStatement.setString(5,anggota.getBb());
        preparedStatement.setString(6,anggota.getEmail());
        preparedStatement.setString(7,anggota.getTingkatan());
        preparedStatement.setString(8,anggota.getFoto());
        preparedStatement.executeUpdate();
        
    }     
    
          
    public Anggota findOne(String idmember) throws SQLException{
        Anggota anggota=new Anggota();
        
        preparedStatement=connection.prepareStatement("SELECT * from member where idmember=?");
        preparedStatement.setString(1, idmember);
        ResultSet rs=preparedStatement.executeQuery();
                    
        while(rs.next()){
            anggota.setIdmember(rs.getString("idmember"));
            anggota.setNama(rs.getString("nama"));
            anggota.setAlamat(rs.getString("alamat"));
            anggota.setHp(rs.getString("hp"));
            anggota.setBb(rs.getString("bb"));
            anggota.setEmail(rs.getString("email"));
            anggota.setTingkatan(rs.getString("tingkatan"));
            anggota.setFoto(rs.getString("foto"));
        }
        return anggota;
    }
    
    
       public List<Anggota> findAll() throws SQLException{
        List<Anggota> listOfAnggota=new ArrayList<Anggota>();
                     
        preparedStatement=connection.prepareStatement("select * from member");
        ResultSet rs=preparedStatement.executeQuery();
            
        while(rs.next()){
            Anggota anggota=new Anggota();
            anggota.setIdmember(rs.getString("idmember"));
            anggota.setNama(rs.getString("nama"));
            anggota.setAlamat(rs.getString("alamat"));
            anggota.setHp(rs.getString("hp"));
            anggota.setBb(rs.getString("bb"));
            anggota.setEmail(rs.getString("email"));
            anggota.setTingkatan(rs.getString("tingkatan"));
            anggota.setFoto(rs.getString("foto"));
            listOfAnggota.add(anggota);
        }
        return listOfAnggota;
    }
    
    }
    

