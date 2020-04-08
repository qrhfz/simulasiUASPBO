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
public class Murid extends Orang{
    private int noInduk;

    public Murid(int noInduk, String nama, String alamat) {
        super(nama, alamat);
        this.noInduk = noInduk;
    }

    public Murid() {
    }
    
    
    public int getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    @Override
    public void cetak() {
        super.cetak(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("No. Induk : "+ this.noInduk);
    }
    
    
    
    
}
