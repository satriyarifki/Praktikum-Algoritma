/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabung[] tArray = new Tabung [3];
        Kerucut[] kArray = new Kerucut[3];
        Bulat[] bArray = new Bulat[3];
        for(int i = 0;i<tArray.length;i++){
           System.out.println("Jari-jari Tabung ke " + i + " adalah     :");
           double j = input.nextDouble();
           System.out.println("Tinggi Tabung ke " + i + " adalah        :");
           double t = input.nextDouble();
           tArray[i] = new Tabung(j, t);
        }
        for(int i = 0;i<kArray.length;i++){
           System.out.println("Jari-jari Kerucut ke " + i + " adalah    :");
           double j = input.nextDouble();
           System.out.println("Tinggi Kerucut ke " + i + " adalah       :");
           double t = input.nextDouble();
           kArray[i] = new Kerucut(j, t);
        }
        for(int i = 0;i<bArray.length;i++){
           System.out.println("Jari-jari Bulat ke " + i + " adalah      :");
           double j = input.nextDouble();
           bArray[i] = new Bulat(j);
        }
        for(int i = 0;i<tArray.length;i++){
           System.out.println("Luas Permukaan Tabung adalah     :" + tArray[i].hitungLuas());
           System.out.println("Volume Tabung adalah             :" + tArray[i].hitungVolume());
        }
        for(int i = 0;i<tArray.length;i++){
           System.out.println("Luas Permukaan Kerucut adalah    :" + kArray[i].hitungLuas());
           System.out.println("Volume Kerucut adalah            :" + kArray[i].hitungVolume());
        }
        for(int i = 0;i<tArray.length;i++){
           System.out.println("Luas Permukaan Bulat adalah      :" + bArray[i].HitungLuas());
           System.out.println("Volume Bulat adalah              :" + bArray[i].HitungVolume());
        }
    }
}
