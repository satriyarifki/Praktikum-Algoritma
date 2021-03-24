/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketPesawat;

/**
 *
 * @author User
 */
public class MainTiket {
    public static void main(String[] args) {
        TiketService oi = new TiketService();
        Tiket m1 = new Tiket("Garuda    ", 3500000, "Jakarta", "Lombok");
        Tiket m2 = new Tiket("Citilink  ", 2500000, "Jakarta", "Lombok");
        Tiket m3 = new Tiket("Lion Air  ", 3000000, "Jakarta", "Lombok");
        Tiket m4 = new Tiket("Air Asia  ", 2200000, "Jakarta", "Lombok");
        Tiket m5 = new Tiket("Batik Air ", 2000000, "Jakarta", "Lombok");
        Tiket m6 = new Tiket("Wings Air ", 1900000, "Jakarta", "Lombok");
        Tiket m7 = new Tiket("Sriwijaya Air", 2350000, "Jakarta", "Lombok");
        Tiket m8 = new Tiket("Merpati   ", 1800000, "Jakarta", "Lombok");
        Tiket m9 = new Tiket("Batavia Air ", 1950000, "Jakarta", "Lombok");
        Tiket m10 = new Tiket("Susi Air ", 1800000, "Jakarta", "Lombok");
        
        oi.tambah(m1);
        oi.tambah(m2);
        oi.tambah(m3);
        oi.tambah(m4);
        oi.tambah(m5);
        oi.tambah(m6);
        oi.tambah(m7);
        oi.tambah(m8);
        oi.tambah(m9);
        oi.tambah(m10);
        
        System.out.println("Daftar Maskapai sebelum di sortir dari harganya");
        oi.tampilAll();
        System.out.println("");
        System.out.println("");
        System.out.println("Daftar Maskapai Setelah di sortir dari harga Termurah");
        oi.bubbleSort();
        oi.tampilAll();
        System.out.println("");
        System.out.println("");
        System.out.println("Daftar Maskapai Setelah di sortir dari harga Termahal");
        oi.selectionSort();
        oi.tampilAll();
        
    }
}
