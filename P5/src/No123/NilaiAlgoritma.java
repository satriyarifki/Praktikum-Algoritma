/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No123;

/**
 *
 * @author User
 */
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public NilaiAlgoritma(String n, int t, int k, int u, int ua){
        namaMhs = n;
        nilaiTugas = t;
        nilaiKuis = k;
        nilaiUTS = u;
        nilaiUAS = ua;
    }
    public double hitungTotalNilai(){
        return (nilaiTugas * 3/10) + (nilaiKuis * 1/5) + (nilaiUTS * 1/5) + (nilaiUAS * 3/10);
    }
}
