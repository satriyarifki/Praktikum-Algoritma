/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1No2;

/**
 *
 * @author User
 */
public class PencarianMhs {
    Mahasiswa list[] = new Mahasiswa [5];
    int idx;
    void tambah (Mahasiswa m){
        if (idx < list.length) {
            list[idx] = m;
            idx ++;
        } else {
            System.out.print("Data sudah penuh!!");
        }
    }
    void tampil(){
        for(Mahasiswa o : list){
            o.tampil();
        }
    }
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right)/2;
            if (cari == list[mid].Nim){
                return(mid);
            } else if (list[mid].Nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    void selectionSort(){ //Descending
        for (int i = 0; i <list.length-1;i++){
            int min = i;
            for(int j = i+1;j<list.length; j++){
                if(list[j].ipk>list[min].ipk){
                    min = j;
                }
                Mahasiswa tmp = list[min];
                list[min] = list[i];
                list[i] = tmp;
            }    
        }
    }
    int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j = 0; j<list.length; j++){
            if (list[j].nama==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
}
