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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kalimat : ");
        String k = input.next();
        int total = k.length();
        Postfix post = new Postfix(total);
        post.konversi(k);
        System.out.print("hasil : "  );
        post.cetak();
    }    
}
