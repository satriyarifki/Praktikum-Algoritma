/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author User
 */
public class MainNilai {
    public static void main(String[] args) {
        NilaiSearch oi = new NilaiSearch();
        Nilai n1 = new Nilai(12);
        Nilai n2 = new Nilai(17);
        Nilai n3 = new Nilai(2);
        Nilai n4 = new Nilai(1);
        Nilai n5 = new Nilai(70);
        Nilai n6 = new Nilai(50);
        Nilai n7 = new Nilai(90);
        Nilai n8 = new Nilai(17);
        Nilai n9 = new Nilai(2);
        Nilai n10 = new Nilai(90);
        
        oi.tambah(n1);
        oi.tambah(n2);
        oi.tambah(n3);
        oi.tambah(n4);
        oi.tambah(n5);
        oi.tambah(n6);
        oi.tambah(n7);
        oi.tambah(n8);
        oi.tambah(n9);
        oi.tambah(n10);
        
        System.out.println("Sebelum Sorting :");
        oi.tampilAll();
        System.out.println("");
        oi.selectionSort();
        System.out.println("Sesudah Sorting :");
        oi.tampilAll();
        oi.FindBinarySearch(oi.SearchBiggest(), 0, oi.list.length-1);
        
        
    }
}
