/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        DoubleLinkedList sl = new DoubleLinkedList();
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan nim: ");
                    String nim1 = sc.next();
                    System.out.println("Masukkan nama: ");
                    String na1 = scn.next();
                    System.out.println("Masukkan jurusan: ");
                    String ju1 = sc.next();
                    System.out.println("Masukkan prodi: ");
                    String pro1 = scn.next();
                    System.out.println("Masukkan IPK: ");
                    double ip1 = sc.nextDouble();
                    sl.addFirst(nim1,na1,ju1,pro1,ip1);
                    break;
                case 2:
                    System.out.println("Masukkan nim: ");
                    String nim2 = sc.next();
                    System.out.println("Masukkan nama: ");
                    String na2 = scn.next();
                    System.out.println("Masukkan jurusan: ");
                    String ju2 = sc.next();
                    System.out.println("Masukkan prodi: ");
                    String pro2 = scn.next();
                    System.out.println("Masukkan IPK: ");
                    double ip2 = sc.nextDouble();
                    sl.addLast(nim2, na2,ju2, pro2, ip2);
                    break;
                case 3:
                    System.out.println("Masukkan Index Tujuan : ");
                    int ni = scn.nextInt();
                    System.out.println("Masukkan nim: ");
                    String nim3 = sc.next();
                    System.out.println("Masukkan nama: ");
                    String na3 = scn.next();
                    System.out.println("Masukkan jurusan: ");
                    String ju3 = sc.next();
                    System.out.println("Masukkan prodi: ");
                    String pro3 = scn.next();
                    System.out.println("Masukkan IPK: ");
                    double ip3 = sc.nextDouble();
                    sl.add(nim3, na3,ju3,pro3, ip3, ni);
                    break;
                case 4:
                    sl.removeFirst();
                    break;
                case 5:
                    sl.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan Index Tujuan : ");
                    int na = scn.nextInt();
                    sl.remove(na);
                    break;
                case 7:
                    sl.print();
                    break;
                case 8:
                    sl.getFirst();
                    break;
                case 9:
                    System.out.println("Masukkan NIM yang dicari : ");
                    String cr = scn.next();
                    System.out.println("NIM yang dicari di indeks ke-"+ sl.FindSeqSearch(cr));
                    sl.getData(cr);
                    break;
                case 10:
                    sl.bubbleSort();
                    break;
            }
        } while (pilih < 11 && pilih >0);
    }
    public static void menu(){
        System.out.println("--------------------------------------");
        System.out.println("DoubleLinkedList Data Mahasiswa : ");
        System.out.println("    1.Tambah data dari pertama");
        System.out.println("    2.Tambah data dari Akhir");
        System.out.println("    3.Tambah Data Sesuai Indeks");
        System.out.println("    4.Hapus Data Awal");
        System.out.println("    5.Hapus Data Akhir");
        System.out.println("    6.Hapus Data sesuai Indeks");
        System.out.println("    7.Cetak Data Mahasiswa");
        System.out.println("    8.Tampilkan Data Mahasiswa Pertama");
        System.out.println("    9.Cari NIM");
        System.out.println("    10.Urut Data Mahasiswa");
        System.out.println("--------------------------------------");
    }
}
