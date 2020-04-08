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
public class SMADemo {
    public static boolean isAlamatSama(SMA s1, SMA s2){
        if(s1.getAlamat().toLowerCase()==s2.getAlamat().toLowerCase()){
            return true;
        }
        return false;
    }
    
    public static double min2(double a, double b){
        return (a<b)? a : b;
    }
    
    public static void main(String[] args) {
        SMA s[] = new SMA[3];
        s[0] = new SMA("Dilan", "Bandung", 1, 12);

        s[1] = new SMA("Milea", "Jakarta", 2, 11);

        s[2] = new SMA();

        s[2].reset("Cinta", "Bandung", 3, 10);
        
        s[0].cetak(); System.out.println("");

        s[1].cetak(); System.out.println("");

        s[2].cetak(); System.out.println("");
        
        System.out.print("Alamat Dilan dan Cinta ");
        
        if(isAlamatSama(s[0], s[2])){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
        System.out.println("");
        
        
        if(min2(s[0].getKelas(), min2(s[1].getKelas(), s[2].getKelas()))==s[0].getKelas() ){
            System.out.println("Siswa yang paling muda adalah "+s[0].getNama());
        }else if(min2(s[0].getKelas(), min2(s[1].getKelas(), s[2].getKelas()))==s[1].getKelas() ){
            System.out.println("Siswa yang paling muda adalah "+s[1].getNama());
        }else{
            System.out.println("Siswa yang paling muda adalah "+s[2].getNama());
        }
        
        /*
        if(min2(s[0].getKelas(), min2(s[2].getKelas(), s[3].getKelas()))==s[0].getKelas() ){
            System.out.println("Siswa yang paling muda adalah "+s[0].getNama());
        }else if(min2(s[0].getKelas(), min2(s[2].getKelas(), s[3].getKelas()))==s[1].getKelas()){
            System.out.println("Siswa yang paling muda adalah "+s[1].getNama());
        }else{
            System.out.println("Siswa yang paling muda adalah "+s[2].getNama());
        }
        */
    }
}
