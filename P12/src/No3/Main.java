/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import No2.*;
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
                    System.out.println("Masukkan nama: ");
                    String nim = sc.next();
                    sl.addLast(nim);
                    break;
                case 2:
                    sl.removeFirst();
                    break;
                case 3:
                    System.out.println("---------------");
                    sl.print();
                    System.out.println("---------------");
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (pilih < 5 && pilih >0);
    }
    public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan : ");
        System.out.println("    1.Tambah data penerima vaksin ");
        System.out.println("    2.Hapus daftar penerima vaksin");
        System.out.println("    3.Daftar penerima vaksin");
        System.out.println("    4.Keluar");
        System.out.println("--------------------------------------");
    }
}
