/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class VideoGameMain {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        VideoGame one = new VideoGame();
        System.out.println("Masukkan ID        : " );
        one.id = input.nextLine();
        System.out.println("Masukkan Nama      : " );
        one.nama = input.nextLine();
        System.out.println("Masukkan Nama Game : " );
        one.game = input.nextLine();
        System.out.println("Masukkan Lama sewa :.... Hari " );
        one.lama = input.nextInt();
        one.tampil();
    }    
        
}
