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
public class Kerucut {
    public double jari;
    public double tinggi;
    public double s;
    public Kerucut (double j, double t) {
        jari = j;
        tinggi = t;
    }
    public void TemukanS(){
        s = (tinggi*tinggi) - (jari*jari);
    }
    
    public double hitungLuas() {
        return (jari*2) * 3.14 + (3.14  * jari * Math.sqrt(s));
    }
    public double hitungVolume() {
        return ((jari*jari) * 3.14) * tinggi / 3;
    }
}
