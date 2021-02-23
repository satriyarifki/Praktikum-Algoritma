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
public class PacManMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PacMan one = new PacMan();
        System.out.println("Masukkan tinggi tempat  : ");
        one.height = input.nextInt();
        System.out.println("Masukkan Lebar tempat   : ");
        one.width = input.nextInt();
        System.out.println("Masukkan Koordinat x    : ");
        one.x = input.nextInt();
        System.out.println("Masukkan Koordinat y    : ");
        one.y = input.nextInt();
        one.printPosition();
        System.out.println("");
        System.out.println("Ingin memindahkan PacMan ke    : ");
        for (boolean c = true; c = true;) {
            System.out.println("* (Atas : W) (Bawah : S) (kanan : D) (kiri : A) ");
            char m = input.next().charAt(0);
            if (m =='w' || m == 'W' ) {
                one.moveUp();
            } else if (m=='s' || m == 'S' ) {
                one.moveDown();
            } else if (m=='d' || m == 'D' ) {
                one.moveRight();
            } else if (m=='a' || m == 'A' ) {
                one.moveLeft();
            } else {
                System.out.println("Input yang anda masukkan tidak valid");
            }
            System.out.println("Ingin memindahkan lagi (Y/T): ");
            char a = input.next().charAt(0);
            if (a == 't' || a == 'T' ) {
                one.printPosition();
                break;
            } else {
                
            }
        }
            
    }
//    static void move(int m){
//        Scanner input = new Scanner(System.in);
//        PacMan one = new PacMan();
//        if (m =='w' || m == 'W' ) {
//            one.moveUp();
//        } else if (m=='s' || m == 'S' ) {
//            one.moveDown();
//        } else if (m=='d' || m == 'D' ) {
//            one.moveRight();
//        } else if (m=='a' || m == 'A' ) {
//            one.moveLeft();
//        } else {
//            System.out.println("Input yang anda masukkan tidak valid");
//        }
//        System.out.println("Ingin memindahkan lagi (Y/T): ");
//        char a = input.next().charAt(0);
//        if (a == 'y' || a == 'Y' ) {
//            System.out.println("* (Atas : W) (Bawah : S) (kanan : D) (kiri : A) ");
//            char w = input.next().charAt(0);
//            move(w);
//        } else {
//            System.out.println("-----------------------");
//            one.printPosition();
//            System.out.println("-----------------------");
//        }
//        
//    }
}
