/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BarangMain {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Barang one = new Barang();
        System.out.println("Masukkan Nama Barang    : " );
        one.nama = input.nextLine();
        System.out.println("Masukkan Harga Barang   : " );
        one.hargaSatuan = input.nextInt();
        System.out.println("Masukkan Jumlah Barang  : " );
        one.jumlah = input.nextInt();
        System.out.println("Harga Total             : " + one.hitungHargaTotal());
        System.out.println("Harga Bayar             : " + one.hitungHargaBayar());
    }    
}
