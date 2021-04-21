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
public class MainQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();
        Queue eq = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    eq.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = eq.Dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : "+ dataKeluar);
                        break;
                    }
                case 3:
                    eq.print();
                    break;
                case 4:
                    eq.peek();
                    break;
                case 5:
                    eq.clear();
                    break;
            }
        } while (pilih < 6 || pilih >0);
    }
    public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan : ");
        System.out.println("    1.Enqueue");
        System.out.println("    2.Dequeue");
        System.out.println("    3.Print");
        System.out.println("    4.Peek");
        System.out.println("    5.Clear");
        System.out.println("--------------------------------------");
    }
    
}
