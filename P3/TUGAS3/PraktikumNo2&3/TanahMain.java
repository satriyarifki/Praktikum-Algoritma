/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo2;

import java.util.Scanner;

/**
 *AXASASA
 * @author User
 */
public class TanahMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terluas = 0;
        System.out.println("Jumlah Tanah yang akan dihitung : ");
        int jml = input.nextInt();
        Tanah[] tn = new Tanah[jml];
        for(int i = 0;i<tn.length;i++){
           System.out.println("Tanah " + (i + 1) );
           System.out.println("Panjang tanah adalah : ");
           int p = input.nextInt();
           System.out.println("Lebar tanah adalah   :");
           int l = input.nextInt();
           tn[i] = new Tanah (p,l);
        }
        for(int i = 0;i<tn.length;i++){
            System.out.println("Luas Tanah " + (i + 1) + ": " + tn[i].hitungLuas());
            if (i!=0){
                if (tn[i].hitungLuas()>tn[i-1].hitungLuas()) {
                    terluas = tn[i].hitungLuas();
                }
            }    
        }
        for(int i = 0;i<tn.length;i++){
            if (terluas==tn[i].hitungLuas()){
                System.out.println("Tanah Terluas adalah : Tanah " + (i + 1));
            }
        }
    }
}
