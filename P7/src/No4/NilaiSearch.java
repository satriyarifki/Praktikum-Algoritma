/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author User
 */
public class NilaiSearch {
    Nilai[] list = new Nilai[10];
    int idx;
    int posisi1;
    int posisi2;
    
    void tambah(Nilai m){
        if(idx<list.length){
            list[idx] = m;
            idx++;
        }
    }
    
    void selectionSort(){ //Descending
        for (int i = 0; i <list.length-1;i++){
            int min = i;
            for(int j = i+1;j<list.length-1; j++){
                if(list[j].angka<list[min].angka){
                    min = j;
                }
                Nilai tmp = list[min];
                list[min] = list[i];
                list[i] = tmp;
            }    
        }
    }
    int SearchBiggest(){
        for (int i = 1; i < list.length; i++){
            if (list[i-1].angka < list[i].angka){
                idx = list[i].angka;
            }
        }
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Nilai terbesar adalah " +idx);
        System.out.println("--------------------------------");
        return idx;
    }
    void FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right)/2;
            if (cari == list[mid].angka){
                if (mid == right){
                    System.out.println("");
                    System.out.println("Ditemukan "  );
                    System.out.println("di index : " + mid);
                } else {
                    System.out.println("");
                    System.out.println("Ditemukan "  );
                    System.out.println("di index : " + mid);
                    FindBinarySearch(cari, mid + 1, right);
                }
            } else if (list[mid].angka > cari){
                FindBinarySearch(cari, left, mid-1);
            } else {
                FindBinarySearch(cari, mid + 1, right);
            }
        }
    }
    void tampilAll(){
        for(Nilai t: list ){
            System.out.print(t.angka + ", ");
        }
    }
}
