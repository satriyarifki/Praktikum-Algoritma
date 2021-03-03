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
public class Tabung {
    public double jari;
    public double tinggi;
    public Tabung (double j, double t) {
        jari = j;
        tinggi = t;
    }
    public double hitungLuas() {
        return (jari*jari) * 3.14 * tinggi;
    }
    public double hitungVolume() {
        return ((jari*jari) * 3.14) * tinggi;
    }
}
