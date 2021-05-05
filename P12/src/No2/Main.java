/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

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
                    System.out.println("Masukkan judul: ");
                    String nim = sc.next();
                    sl.addLast(nim);
                    break;
                case 2:
                    sl.removeLast();
                    break;
                case 3:
                    System.out.println(sl.getLast());
                    break;
                case 4:
                    sl.print();
                    break;
                case 5:
                    break;
            }
        } while (pilih < 5 && pilih >0);
    }
    public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan : ");
        System.out.println("    1.Entry Judul Buku");
        System.out.println("    2.Ambil Buku teratas");
        System.out.println("    3.cek Judul buku teratas");
        System.out.println("    4.info semua judul buku");
        System.out.println("    5.Exit");
        System.out.println("--------------------------------------");
    }
}
