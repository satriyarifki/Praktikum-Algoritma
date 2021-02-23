/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author User
 */
public class LingkaranMain {
    public static void main(String[] args) { 
        Lingkaran lkr = new Lingkaran();
        lkr.r = 7;
        lkr.phi = 3.14;
        double luas = lkr.hitungLuas(lkr.r, lkr.phi);
        double keliling = lkr.hitungKeililing(lkr.r, lkr.phi);
        System.out.println(" Jari-jari lingkaran adalah : " + lkr.r);
        System.out.println(" phi lingkaran adalah       : " + lkr.phi);
        System.out.println(" Luas lingkaran adalah      : " + luas);
        System.out.println(" Keliling lingkaran adalah  : " + keliling);
        
    }
}
