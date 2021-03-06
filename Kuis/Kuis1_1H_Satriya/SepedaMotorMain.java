/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H_Satriya;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SepedaMotorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SepedaMotor[] sm = new SepedaMotor[4];
        sm[0] = new SepedaMotor("Ducati") ;
        sm[1] = new SepedaMotor("Yamaha") ;
        sm[2] = new SepedaMotor("Honda") ;
        sm[3] = new SepedaMotor("Suzuki") ;
        for(int i = 0; i<sm.length; i++){
            sm[i].kontakMotor = false;
        }
        on();
    }
    static void on(){
        Scanner input = new Scanner(System.in);
        System.out.println("List Sepeda Motor");
        System.out.println("    1. Ducati");
        System.out.println("    2. Yamaha");
        System.out.println("    3. Honda");
        System.out.println("    4. Suzuki");
        System.out.println("Sepeda Motor mana yang ingin digunakan?");
        int sepeda = input.nextInt();
        if (sepeda == 1){
            Mesin(0);
        } else if (sepeda == 2){
            Mesin(1);
        } else if (sepeda == 3){
            Mesin(2);
        } else if (sepeda == 4){
            Mesin(3);
        } else  {
            System.out.println("Input yang anda Masukkan salah");
        }
        
    }
    static void Mesin(int angka){
        Scanner input = new Scanner(System.in);
        SepedaMotor[] sm = new SepedaMotor[4];
        System.out.println(sm[0].merk);
        System.out.println("");
        System.out.println("Apakah anda ingin menyalakan mesin? Y/N ");
        String yn = input.next();
        if (yn == "y" || yn == "Y"){
            sm[angka].nyalakanMotor(true);
        } else if (yn == "y" || yn == "Y"){
            sm[angka].matikanMotor(false);
        }
        System.out.println("Ingin Tambah atau Kurangi Kecepatan? T/K");
        String tk = input.next();
        if (yn == "y" || yn == "Y"){
            sm[angka].nyalakanMotor(true);
        } else if (yn == "y" || yn == "Y"){
            sm[angka].matikanMotor(false);
        }
    }
}
