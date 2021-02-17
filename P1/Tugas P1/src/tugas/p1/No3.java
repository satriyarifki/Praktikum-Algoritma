/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.p1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class No3 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai n :  ");
        int n = input.nextInt();
        System.out.println("");
        int p = 0;
        for (int j = 1;j<999;j++ ) {
            if (j%2==0 && j%4!=0) {
                System.out.print(j+", ");
                p+=1;
                if (p==n) {
                    break;
                } 
            }
        }
    }
}
