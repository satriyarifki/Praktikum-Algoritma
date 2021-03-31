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
public class Search {
    Angka list[][] = new Angka[3][5];
    int FindSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j< list[0].length;j++ ){
                if (list[i][j].nilai==cari){
                    System.out.println("Ditemukan pada baris ke-" + (i+1) + " kolom ke-" +(j+1));
                    break;
                }    
            }
        }
    return posisi;        
    }
}
