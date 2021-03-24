/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PremierLeague;

/**
 *
 * @author User
 */
public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService daf = new PremierLeagueService();
        PremierLeague t1 = new PremierLeague("Liverpool         ", 29, 45, 82);
        PremierLeague t2 = new PremierLeague("Manchester City   ", 27, 39, 57);
        PremierLeague t3 = new PremierLeague("Leicester         ", 28, 26, 50);
        PremierLeague t4 = new PremierLeague("Chelsea           ", 29, 9, 48);
        PremierLeague t5 = new PremierLeague("Everton           ", 29, -6, 37);
        PremierLeague t6 = new PremierLeague("Arsenal           ", 28, 4, 40);
        PremierLeague t7 = new PremierLeague("Burnley           ", 29, -6, 39);
        PremierLeague t8 = new PremierLeague("Watford           ", 29, -17, 27);
        PremierLeague t9 = new PremierLeague("Manchester United ", 28, 12, 42);
        PremierLeague t10 = new PremierLeague("Tottenham Hotspur ", 29, 7, 41);
        PremierLeague t11 = new PremierLeague("Crystal Palace    ", 29, -6, 39);
        PremierLeague t12 = new PremierLeague("WestHam           ", 29, -15, 27);
        PremierLeague t13 = new PremierLeague("Aston Villa       ", 27, -18, 25);
        PremierLeague t14 = new PremierLeague("Norwich City      ", 29, -27, 21);
        PremierLeague t15 = new PremierLeague("Brighton          ", 29, -8, 29);
        PremierLeague t16 = new PremierLeague("Wolverhampton     ", 29, 7, 43);
        PremierLeague t17 = new PremierLeague("Sheffield United  ", 28, 5, 43);
        PremierLeague t18 = new PremierLeague("Bournemouth       ", 29, -18, 27);
        PremierLeague t19 = new PremierLeague("Southampton       ", 29, 17, 34);
        PremierLeague t20 = new PremierLeague("Newcastle United  ", 29, -16, 35);
        
        daf.tambah(t1);
        daf.tambah(t2);
        daf.tambah(t3);
        daf.tambah(t4);
        daf.tambah(t5);
        daf.tambah(t6);
        daf.tambah(t7);
        daf.tambah(t8);
        daf.tambah(t9);
        daf.tambah(t10);
        daf.tambah(t11);
        daf.tambah(t12);
        daf.tambah(t13);
        daf.tambah(t14);
        daf.tambah(t15);
        daf.tambah(t16);
        daf.tambah(t17);
        daf.tambah(t18);
        daf.tambah(t19);
        daf.tambah(t20);
        
        System.out.println("Klasemen sebelum sorting : ");
        daf.tampilAll();
        System.out.println("");
        System.out.println("Klasemen Setelah Sorting Asc berdasar Points");
        daf.insertionSort(true);
        daf.tampilAll();
        System.out.println("");
        System.out.println("Klasemen Setelah Sorting Desc berdasar Points");
        daf.insertionSort(false);
        daf.tampilAll();
    }
}
