/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainLLQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        SingleLinkedList sl = new SingleLinkedList();
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan Nama: ");
                    String nim = sc.next();
                    System.out.println("Masukkan Alamat: ");
                    String na = sc.next();
                    System.out.println("Masukkan Rekening: ");
                    String ab = scn.next();
                    sl.addFirst(nim, na, ab);
                    break;
                case 2:
                    System.out.println("Masukkan Nama: ");
                    String nm = sc.next();
                    System.out.println("Masukkan Alamat: ");
                    String nam = sc.next();
                    System.out.println("Masukkan Rekening: ");
                    String al = scn.next();
                    sl.addLast(nm, nam, al);
                    break;
                case 3:
                    System.out.println("Masukkan Rekening Nasabah Yang dicari: ");
                    String nk = scn.next();
                    System.out.println("Masukkan Nama: ");
                    String n1 = sc.next();
                    System.out.println("Masukkan Alamat: ");
                    String n2 = sc.next();
                    System.out.println("Masukkan Rekening: ");
                    String n3 = scn.next();
                    sl.insertAfter(nk, n1, n2, n3);
                    break;
                case 4:
                    System.out.println("Masukkan Index Tujuan : ");
                    int ni = scn.nextInt();
                    System.out.println("Masukkan Nama: ");
                    String n4 = sc.next();
                    System.out.println("Masukkan Alamat: ");
                    String n5 = sc.next();
                    System.out.println("Masukkan Rekening: ");
                    String n6 = scn.next();
                    sl.insertAt(ni, n4, n5, n6);
                    break;
                case 5:
                    sl.print();
                    break;
                case 6:
                    sl.removeFirst();
                    break;
                case 7:
                    sl.removeLast();
                case 8:
                    System.out.println("Masukkan Rekening yang ingin dihapus : ");
                    String an = sc.next();
                    sl.remove(an);
                case 9:
                    System.out.println("Masukkan Index Rekening : ");
                    int idx = scn.nextInt();
                    sl.getData(idx);
            }
        } while (pilih < 9 && pilih >0);
    }
    public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan : ");
        System.out.println("    1.Add First");
        System.out.println("    2.Add Last");
        System.out.println("    3.Insert After");
        System.out.println("    4.Insert At");
        System.out.println("    5.Print");
        System.out.println("    6.Remove Head");
        System.out.println("    7.Remove Tail");
        System.out.println("    8.Remove From Rekening");
        System.out.println("    9.Get Data");
        System.out.println("--------------------------------------");
    }
}
