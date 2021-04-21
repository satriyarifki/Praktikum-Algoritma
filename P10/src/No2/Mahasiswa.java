/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author User
 */
public class Mahasiswa {
    String nim, nama;
    int absen;
    double ipk;
    Mahasiswa(){
        
    }
    Mahasiswa(String n, String na, int ab, double ip){
        nim = n;
        nama = na;
        absen = ab;
        ipk = ip;
    }
}
