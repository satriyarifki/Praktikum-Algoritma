/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo2;

/**
 *
 * @author User
 */
public class Tanah {
    public int pan;
    public int leb;
    public Tanah(int p, int l){
        pan = p;
        leb = l;
    }
    public int hitungLuas() {
        return pan * leb;
    }
}
