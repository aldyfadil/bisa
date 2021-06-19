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
public class Kembalian extends Harga{
    void viewTotal(){
        System.out.println("|=====[PEMBAYARAN}=====|");
        System.out.println("Total  : Rp." + total);
    }
    public double Kembalian(double bayar){
        Bayar = bayar;
        if(Bayar > total){
            kembalian = bayar - total;
            return kembalian;
        }
        else{
            kekurangan = (bayar - total)*(-1);
            return kekurangan;
        }
    }
    void viewKembalian(){
        if(Bayar >= total){
            System.out.println("Kembalian : Rp." + kembalian);
            System.out.println("|=====[TERIMAKASIH}=====");
        }
        else{
            System.out.println("Silahkan membayar kembali uang anda masih kurang RP." + kekurangan);
        }             
    }
    void Pelunasan(double bayar){
        Bayar = bayar;
        System.out.println("Pembayaran ulang : Rp." + Bayar);
        if(kekurangan > Bayar){
            kekurangan = kekurangan - bayar;
            System.out.println("Silahkan membayar kembali uang anda masih kurang : Rp." + kembalian);
        }
        else if(kekurangan < Bayar){
            kembalian = bayar - kembalian;
            kekurangan = 0.0;
            System.out.println("Kembalian : Rp." + kembalian);
            System.out.println("|=====[TERIMAKASIH]=====|");
        }
        else if(kekurangan == bayar){
            kekurangan = kekurangan - bayar;
            System.out.println("|=====[TERIMAKASIH=====|");
        }
        
    }
    
}
