/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

import No1.*;
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
                    System.out.println("Masukkan IPK: ");
                    double ip1 = sc.nextDouble();
                    sl.addFirst(nim1,na1,ip1);
                    break;
                case 2:
                    System.out.println("Masukkan nim: ");
                    String nim2 = sc.next();
                    System.out.println("Masukkan nama: ");
                    String na2 = scn.next();
                    System.out.println("Masukkan IPK: ");
                    double ip2 = sc.nextDouble();
                    sl.addLast(nim2, na2, ip2);
                    break;
                case 3:
                    System.out.println("Masukkan Index Tujuan : ");
                    int ni = scn.nextInt();
                    System.out.println("Masukkan nim: ");
                    String nim3 = sc.next();
                    System.out.println("Masukkan nama: ");
                    String na3 = scn.next();
                    System.out.println("Masukkan IPK: ");
                    double ip3 = sc.nextDouble();
                    sl.add(nim3, na3, ip3, ni);
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
                    System.out.println("Masukkan NIM yang dicari : ");
                    String cr = scn.next();
                    System.out.println("NIM yang dicari diindeks : "+ sl.FindSeqSearch(cr));
                    break;
                case 9:
                    sl.bubbleSort();
                    break;
                case 10:
                    break;
            }
        } while (pilih < 10 && pilih >0);
    }
    public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan : ");
        System.out.println("    1.Add First");
        System.out.println("    2.Add Last");
        System.out.println("    3.Add");
        System.out.println("    4.Remove First");
        System.out.println("    5.Remove Last");
        System.out.println("    6.Remove Data tertentu");
        System.out.println("    7.Print");
        System.out.println("    8.Find NIM");
        System.out.println("    9.Sort IPK Desc");
        System.out.println("    10.Exit");
        System.out.println("--------------------------------------");
    }
}
