package tugas.p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class No2 {
    public static void main(String[] args) {
        int SaldoAwal = 1000000;
        System.out.println("Saldo Awal = Rp" + SaldoAwal);
        System.out.println("Bunga Perbulan 2%");
        int bulan = Bunga(SaldoAwal,0);
        System.out.println("Banyak bulan agar mencapai saldo Rp1500000 = " + bulan + " Bulan");                
    }
    static int Bunga(int j, int i) {
        if (j>=1500000) {
            return i;
        } else {
            ++i;
            j = (j + (j/50));
            return Bunga(j,i);
        }
    }
}
