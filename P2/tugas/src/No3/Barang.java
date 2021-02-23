/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

/**
 *
 * @author User
 */
public class Barang {
    int hargaSatuan, jumlah, total, diskon, bayar;
    String nama;
    int hitungHargaTotal(){
        return hargaSatuan * jumlah;
    }
    int hitungDiskon(){
        if(hitungHargaTotal()>100000){
            System.out.println("----Selamat anda mendapat diskon sebesar 10%----");
            return hitungHargaTotal() / 10;
        } else if (hitungHargaTotal()>50000) {
            System.out.println("----Selamat anda mendapat diskon sebesar 5%----");
            return hitungHargaTotal() / 20;
        } else {
            System.out.println(" ----Maaf anda belum mendapat diskon----");
            return 0;
        }
    }
    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
