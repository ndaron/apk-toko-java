/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import service.AnggotaService;
import login.tambahmember;

/**
 *
 * @author imam
 */
public class memberdb {
    private static AnggotaService anggotaService;
    
    public static AnggotaService getAnggotaService(){
        return anggotaService;
    }

    public static void main(String[] args) throws SQLException {
         MysqlDataSource dataSource=new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("toko");
            
            anggotaService=new AnggotaService(dataSource);
        
        new tambahmember().setVisible(true);
    }
    
}
