/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terluas = 0;
        System.out.println("Banyak Data Mahasiswa : ");
        int jml = input.nextInt();
        Mahasiswa[] data = new Mahasiswa[jml];
        for(int i = 0; i<jml; i++){
            System.out.println("Masukkan Data Mahasiswa ke " + (i + 1));
            System.out.println("Masukkan Nama           :");
            String o = input.next();
            System.out.println("Masukkan NIM            :");
            String p = input.next();
            System.out.println("Masukkan Jenis Kelamin  :");
            char k = input.next().charAt(0);
            System.out.println("Masukkan IPK            :");
            double ip = input.nextDouble();
            data[i] = new Mahasiswa(o, p, k, ip);
        }
        System.out.println("");
        for(int i = 0; i<jml; i++){
            System.out.println("-----------------------------------------------------------");
            System.out.println("Data Mahasiswa ke " + (i + 1));
            data[i].tampil();
        }
        double total= 0;
        for (int i = 0; i<jml; i++){
            total =+ data[i].ipk;
        }
        System.out.println("IPK Rata-Rata Seluruh Mahasiswa :  " + data[0].rerata(total, jml));
        System.out.println("---------------------------------------------------------------");
    }
}
