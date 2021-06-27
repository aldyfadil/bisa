/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

/**
 *
 * @author aldi
 */
public class Harga {
    public double Bayar, kembalian, kekurangan, total;
    protected int jumlah, pilihan;
    static final String selamat = "     =>      [WARDA]     <=      ";
    
    
    double hitungTotal(int jml){
        int harga;
        switch(pilihan){
            case 0 :
                System.exit(0);
                break;
            case 1 :
                harga = 3000;
                total = total + (harga * jumlah);
                break;
            case 2 :
                harga = 7000;
                total = total + (harga * jumlah);
                break;
            case 3 :
                harga = 7000;
                total = total + (harga * jumlah);
                break;
            case 4 :
                harga = 8000;
                total = total + (harga * jumlah);
                break;
            case 5 :
                harga = 22000;
                total = total + (harga * jumlah);
                break;
            case 6 :
                harga = 5000;
                total = total + (harga * jumlah);
                break;
            case 9 :
                break;

            default :
                System.out.println("ERROR : input yang di masukkan salah !");
                
        }
        return total;
    }
}
