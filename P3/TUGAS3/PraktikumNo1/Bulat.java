/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo1;

/**
 *
 * @author User
 */
public class Bulat {
    public double jari;
    public Bulat(double j) {
        jari = j;
    }
    public double HitungLuas(){
        return 4 * 3.14 * (jari*jari);
    }
    public double HitungVolume(){
        return 4/3 * 3.14 * (jari*jari*jari);
    }
}
