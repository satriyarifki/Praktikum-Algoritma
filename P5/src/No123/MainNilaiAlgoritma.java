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
public class MainNilaiAlgoritma {
    public static void main(String[] args) {
        NilaiAlgoritma[] nilai = new NilaiAlgoritma[3];
        nilai[0] = new NilaiAlgoritma("Wahyu", 80, 75, 85, 90);
        nilai[1] = new NilaiAlgoritma("Naisa", 90, 85, 85, 95);
        nilai[2] = new NilaiAlgoritma("Asep", 70, 65, 80, 75);
        System.out.println("Nilai Mahasiswa"  );
        for (int i = 0; i < nilai.length; i++){
            System.out.println("Nama        : " + nilai[i].namaMhs );
            System.out.println("Nilai Total : " + nilai[i].hitungTotalNilai());
            System.out.println(""  );
        }
        int total = 0;
        for (int i = 0; i < nilai.length; i++){
            total += nilai[i].hitungTotalNilai();
        }
        int rerata = total / nilai.length;
        System.out.println("-------------------------------------"  );
        System.out.println("Rata-Rata Nilai Mahasiswa " + rerata );
    }
}
