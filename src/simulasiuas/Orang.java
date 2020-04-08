/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasiuas;

/**
 *
 * @author mbohd
 */
public class Orang {
    private String nama;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Orang() {
    }

    public Orang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void cetak(){
        System.out.println("Nama : "+ this.nama);
        System.out.println("Alamat : "+ this.alamat);
    }
}
