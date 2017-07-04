/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.AnggotaDao;
import domain.Anggota;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author imam
 */
public class AnggotaService {
    Connection connection;
    AnggotaDao anggotaDao;
    
    public AnggotaService(MysqlDataSource dataSource) throws SQLException {
        this.connection=dataSource.getConnection();
        anggotaDao=new AnggotaDao();
        anggotaDao.setConnection(connection);
    }
    
    public void save(Anggota anggota) {
        try{
            connection.setAutoCommit(false);
            anggotaDao.save(anggota);
            connection.commit();
            connection.setAutoCommit(true);
        }   catch (SQLException exception) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                           
        }
        
    }
    
    public List<Anggota> findAll(){
        try {
            return anggotaDao.findAll();
           } catch (SQLException ex) {
                ex.printStackTrace();
    }
    
    return null;
}
}
