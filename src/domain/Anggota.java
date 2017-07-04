/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author imam
 */
public class Anggota {
    private String idmember;
    private String nama;
    private String alamat;
    private String hp;
    private String bb;
    private String email;
    private String tingkatan;
    private String foto;
    
    
    //idmember
    public String getIdmember() {
        return idmember;
}
    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }
    
    
    //nama
      public String getNama() {
        return nama;
}
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    //alamat
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    //HP
    public String getHp() {
        return hp;
    }
    public void setHp(String hp) {
        this.hp = hp;
    }
    
    
    //BB
    public String getBb() {
        return bb;
    }
    public void setBb(String bb) {
        this.bb = bb;
    }
    
    
    //Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    //Tingkatan
    public String getTingkatan() {
        return tingkatan;
    }
    public void setTingkatan(String tingkatan) {
        this.tingkatan = tingkatan;
    }
    
    
    //Foto
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
