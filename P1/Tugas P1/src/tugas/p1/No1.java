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
public class No1 {
    public static void main(String[] args) {
        int Ani = 4, Budi = 15, Bina = 6, Cita = 11;
        System.out.println ("Data Smile Laundry 10 Februari 2021");
        System.out.println ("");
        System.out.println ("1. Ani = " + Ani + "kg" );
        diskon(Ani);
        Ani = Total(Ani);
        Cetak(Ani);
        System.out.println ("2. Budi = " + Budi + "kg" );
        diskon(Budi);
        Budi = Total(Budi);
        Cetak(Budi);
        System.out.println ("3. Bani = " + Bina + "kg" );
        diskon(Bina);
        Bina = Total(Bina);
        Cetak(Bina);
        System.out.println ("4. Cita = " + Cita + "kg" );
        diskon(Cita);
        Cita = Total(Cita);
        Cetak(Cita);
        int total = Ani + Budi + Bina + Cita;
        System.out.println ("Pendapatan Smile Laundry pada hari ini adalah : " + total );
        
    }
    static int Total(int j) {
        int u = 4500;
        int c = j * u;
        if (j>10){
            c = c - (c/20);
        }
        return c;
    }
    static void Cetak(int j){
        System.out.print("   Biaya" );
        System.out.println ("   Rp " + j);
        System.out.println ("");
    }
    static void diskon(int j){
        if (j>10) { 
            System.out.println ("   akan mendapat diskon 5%");
        } else{
            System.out.println ("   Tidak Mendapatkan diskon karena berat kurang dari 10kg");
        }
    }
}
