/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

import java.util.Scanner;
public class Z extends Kembalian{
    Scanner input = new Scanner(System.in);
    private double Total;
    private int Kekurangan;
    public Z(){
        System.out.println(Harga.selamat);
        do{
            System.out.println("| === Nama === | === Harga ===    |");                                                     
            System.out.println("|1.Air Mineral | Rp.3.000         |");
            System.out.println("|2.Mie Goreng  | Rp.7.000         |");
            System.out.println("|3.Mie Rebus   | Rp.7.000         |");
            System.out.println("|4.Gula        | Rp.8.000         |");
            System.out.println("|5.Telur       | Rp.22.000        |");
            System.out.println("|6.kopi        | Rp.5.000         |");
            System.out.println("|=================================|");
            System.out.println("|9.selesai dan hitung pembayaran  |");
            System.out.println("|0.keluar dari program            |");
            System.out.println("Masukkan pilihan :");
            pilihan = input.nextInt();
            if(pilihan >= 1 && pilihan <=6){
                System.out.print("Masukkan jumlah beli :");
                jumlah = input.nextInt();
            }
            hitungTotal(jumlah);
        }while(pilihan != 9);
        viewTotal();
        System.out.print("Bayar : Rp.");
        Kembalian(input.nextDouble());
        viewKembalian();
        while(Total != Bayar && Bayar < Total){
            if(Kekurangan != 0){
                System.out.print("bayar : Rp.");
                Pelunasan(input.nextDouble());
            }
            else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Z();
    }
}
