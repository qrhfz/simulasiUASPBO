/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasiuas;

/**
 * Nama : Qori El-Hafizh
 * NIM : A11.2018.11452
 */
public class SMA extends Murid{
    private int kelas;

    public SMA() {
    }

    public SMA(String nama, String alamat, int noInduk, int kelas) {
        super(noInduk, nama, alamat);
        this.kelas = kelas;
    }

    public void setKelas(int kelas) {
        
        if(kelas>=10&&kelas<=12){
            this.kelas = kelas;
        }
        
    }

    public int getKelas() {
        return kelas;
    }
    
    public void reset(String nama, String alamat, int noInduk, int kelas){
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
        setKelas(kelas);
    }
    
    public int kelasSMA(int kelas){
        return kelas - 9;
    }

    @Override
    public void cetak() {
        super.cetak(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kelas : "+ this.kelas);
        
    }
    
    
}
