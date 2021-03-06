/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H_Satriya;

/**
 *
 * @author User
 */
public class SepedaMotor {
    public String merk;
    public boolean kontakMotor;
    public int kecepatanMotor;
    public SepedaMotor(){
        
    }
    public SepedaMotor(String m){
        merk = m;
    }
    public void nyalakanMotor(boolean tr){
        kontakMotor = tr;
        kecepatanMotor = 0;
    }
    public void matikanMotor (boolean tf){
        kontakMotor = tf;
        kecepatanMotor = 0;
    }
    public int tambahKecepatanMotor(int kec){
        if (kec == 100){
            System.out.println("Mencapai Kecepatan Maksimum");
        } else if( kec == 0){
            System.out.println("Mencapai Kecepatan Minimum");
        } else {
            kec = kec + 5;
        }
        return kec;
    }
    public int kurangiKecepatanMotor(int kec){
        if (kec == 100){
            System.out.println("Mencapai Kecepatan Maksimum");
        } else if( kec == 0){
            System.out.println("Mencapai Kecepatan Minimum");
        } else {
            kec = kec - 5;
        }
        return kec;
    }
    public void info(){
        
    }
}
