/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author User
 */
public class VideoGame {
    int lama, harga=20000;
    String id, nama, game;
    int totalBiaya(int l, int h) {
        return l * h;
    }
    void tampil() {
        System.out.println("");
        System.out.println("****************************************");
        System.out.println(" ID             : " + id);
        System.out.println(" Nama Member    : " + nama);
        System.out.println(" Nama Game      : " + game);
        System.out.println(" Lama Sewa      : " + lama + " Hari");
        System.out.println(" Harga per hari : Rp" + harga);
        System.out.println(" Harga total    : Rp" + totalBiaya(lama, harga));
        System.out.println("****************************************");
    }
}
