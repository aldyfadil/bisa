/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

import java.util.Scanner;

/**
 *
 * @author aldi
 */
public class Menu extends Kembalian{
    Scanner input = new Scanner(System.in);
    private double Total;
    private int Kekurangan;
    public Menu(){
        System.out.println(Harga.selamat);
        do{
            System.out.printf("%-10s %-10\n","| === Nama === |","|=== Harga ===|");
            System.out.printf("%-10s %-10\n","|1.Air Mineral", "| Rp.3.000     |");
            System.out.printf("%-10s %-10\n","|2.Mie Goreng ", "| Rp.7.000     |");
            System.out.printf("%-10s %-10\n","|3.Mie Rebus  ", "| Rp.7.000     |");
            System.out.printf("%-10s %-10\n","|4.Gula       ", "| Rp.8.000     |");
            System.out.printf("%-10s %-10\n","|5.Telur      ", "| Rp.22.000    |");
            System.out.printf("%-10s %-10\n","|6.kopi       ", "| Rp.5.000     |");
            System.out.printf("%-10s %-10\n","|===============","===============");
            System.out.printf("%-10s %-10\n","|9.selesai dan hitung pembayaran  ");
            System.out.printf("%-10s %-10\n","|0.keluar dari program            ");
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
    }else{
          break;
         }
  }
}
    public static void main(String[] args){
        new Menu();
    }
}