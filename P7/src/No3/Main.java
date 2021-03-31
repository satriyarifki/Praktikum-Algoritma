/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Search oi = new Search();
        Angka io = new Angka();
        
        int ang;
        for (int i = 0; i < oi.list.length; i++){
            for (int j = 0; j< oi.list[0].length;j++ ){
                System.out.println("Masukkan nilai baris " + (i+1)+ ", kolom " + (j+1) + " :" );
                ang = input.nextInt();
                Angka mo = new Angka(ang);
                oi.list[i][j] = mo ;
            }
        }
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan nilai yang ingin dicari : ");
        int cari = input.nextInt();
        oi.FindSeqSearch(cari);
        System.out.println("-----------------------------------");
    }    
}
