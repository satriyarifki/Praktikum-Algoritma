/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertanyaan;

/**
 *
 * @author User
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public int HitungLuas() {
        return alas * tinggi / 2;
    }
    public int HitungKeliling() {
        return alas * 3;
    }
}
