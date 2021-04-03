/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perbankan;


/**
 *
 * @author User
 */
public class MainTransaksi {
    public static void main(String[] args) {
        OperasiBank op = new OperasiBank();
        Rekening r1 = new Rekening("160309273084", "Aruffin bin Abdul Salam", "14582643263","ligula.Nullam@tacitisociosqu.edu" );
        Rekening r2 = new Rekening("169712042416", "Mohammad Al Hafeezy", "16834168323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening r3 = new Rekening("161007278862", "Ehsan bin Azzaudin", "6505379", "Proin.eget@velitegestaslacinia.ca");
        Rekening r4 = new Rekening("169503136823", "Shinnosuke Nohara", "5926919", "tellus.justo.sit@commodoauctor.net");
        Rekening r5 = new Rekening("160802059329", "Misae Nohara", "18917032664","vel@ullamcorpermagna.co.uk" );
        op.tambahr(r1);
        op.tambahr(r2);
        op.tambahr(r3);
        op.tambahr(r4);
        op.tambahr(r5);
        Transaksi t1 = new Transaksi(898214,494048,3587,"2021-03-09 07:54:42");
        Transaksi t2 = new Transaksi(770592,334245,444267,"2020-08-11 13:36:5");
        Transaksi t3 = new Transaksi(685302,451002,376442,"2020-05-23 07:34:53");
        Transaksi t4 = new Transaksi(66190,259150,619774,"2021-09-09 03:57:30");
        Transaksi t5 = new Transaksi(243306,869468,50283,"2021-03-12 03:40:16");
        op.tambaht(t1);
        op.tambaht(t2);
        op.tambaht(t3);
        op.tambaht(t4);
        op.tambaht(t5);
        
        
        
        
    }
}
