/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah Suara yang akan di Input : ");
        int jum = input.nextInt();
        Pemilihan[] p = new Pemilihan[jum];
        for (int i =0 ; i < jum; i++){
            System.out.println("Masukkan suara ke-" + (i+1) + " : ");
            String su = in.nextLine();
            p[i] = new Pemilihan(su) ;
        }
        int m = 0;
        int k = 1;
        int l = 1;
        int n = 1;
        if(0 == jum){
             
        } else if (0<jum){
            for (int i = 0; i<jum-2; i++){
                if (p[i] == p[i+1]){
                    k++;
                } else if (p[i] == p[i+2]){
                    k++;
                } else if (p[i+1] == p[i+2]){
                    m++;
                } else {
                    l++;
                }
            }
            if (k > l){
                if (k > n){
                    System.out.println("");
                    System.out.println("Suara terbanyak adalah :"+ p[0].suara);
                } else {
                    System.out.println("");
                    System.out.println("Suara terbanyak adalah :"+ p[0].suara);
                }
            } else if (l > n){
                System.out.println("");
                System.out.println("Suara terbanyak adalah :"+ p[1].suara);
            } else {
                m = n;
            }
        }    
    }
}
