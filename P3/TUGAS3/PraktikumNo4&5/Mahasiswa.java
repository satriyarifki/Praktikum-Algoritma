/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo4;

/**
 *
 * @author User
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    public char kel;
    public double ipk;
    public Mahasiswa(String n , String p, char k, double i){
        nama = n;
        nim = p;
        kel = k;
        ipk = i;
    }
    public void tampil(){
        System.out.println("Nama            : " + nama);
        System.out.println("Nim             : " + nim);
        System.out.println("Jenis Kelamin   : " + kel);
        System.out.println("IPK             : " + ipk);
    }
    public double rerata(double a, int jml){
        return a / jml;
    }
}
