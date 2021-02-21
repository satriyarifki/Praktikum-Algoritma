/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.p1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class No4 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Menu();
    }
    static void Menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Bangun yang akan dihitung luasnya");
        System.out.println("    1. Luas Segitiga");
        System.out.println("    2. Luas Persegi Panjang");
        System.out.println("    3. Luas Lingkaran");
        System.out.println("Pilihan (1/2/3) : ");
        int n = input.nextInt();
        if (n==1) {
            Segitiga();
        } else if (n==2) {
            Persegi();
        } else if (n==3) {
            Lingkaran();
        }
        Ulang();
    }
    static void Persegi() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Masukan Panjang : ");
        int p = input.nextInt();
        System.out.println("Masukan Lebar   : ");
        int l = input.nextInt();
        int L = p * l;
        System.out.println("Luas persegi panjang adalah : " + L);
        System.out.println("-----------------------------------");
    }
    static void Segitiga() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Masukan Panjang Alas : ");
        double a = input.nextInt();
        System.out.println("Masukan Tinggi       : ");
        double t = input.nextInt();
        double L = a * t / 2;
        System.out.println("Luas Segitiga adalah : " + L);
        System.out.println("-----------------------------------");
    }
    static void Lingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Masukan Jari-jari : ");
        double j = input.nextInt();
        double L = j * j * 3.14;
        System.out.println("Luas Lingkaran adalah : " + L);
        System.out.println("-----------------------------------");
    }
    static void Ulang() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Apakah anda ingin menghitung luas bangun lagi ? (y/t) ");
        char m = input.next().charAt(0);
        if (m=='y' || m=='Y') {
            System.out.println("");
            Menu();
        } else {
            System.out.println("    -------Terima Kasih Semoga program ini membantu-------     ");
        }
        
    }
}
