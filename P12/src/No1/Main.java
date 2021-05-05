/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

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
                    System.out.println("Masukkan data: ");
                    int nim = sc.nextInt();
                    sl.addFirst(nim);
                    break;
                case 2:
                    System.out.println("Masukkan data: ");
                    int nm = sc.nextInt();
                    sl.addLast(nm);
                    break;
                case 3:
                    System.out.println("Masukkan Index Tujuan : ");
                    int ni = scn.nextInt();
                    System.out.println("Masukkan data: ");
                    int ne = sc.nextInt();
                    sl.add(ne, ni);
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
                    System.out.println("Masukkan Data yang dicari : ");
                    int cr = scn.nextInt();
                    System.out.println("Data yang dicari diindeks : "+ sl.FindSeqSearch(cr));
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
        System.out.println("    8.Find");
        System.out.println("    9.Sort");
        System.out.println("    10.Exit");
        System.out.println("--------------------------------------");
    }
}
