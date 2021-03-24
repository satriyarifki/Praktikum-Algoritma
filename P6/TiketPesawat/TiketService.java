/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketPesawat;

/**
 *
 * @author User
 */
public class TiketService {
    Tiket[] tikets = new Tiket[10];
    int index;
    void tambah(Tiket m1){
        if(index<tikets.length){
            tikets[index] = m1;
            index++;
        }
    }
    void tampilAll(){
        for(Tiket t: tikets ){
            System.out.println("Maskapai    : " + t.maskapai );
            System.out.println("Asal        : " + t.asal );
            System.out.println("Tujuan      : " + t.tujuan );
            System.out.println("Harga       : Rp" + t.harga );
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    void bubbleSort(){  //Ascending
        for (int i = 0; i <tikets.length-1;i++){
            for(int j = 1; j < tikets.length-i; j++){
                if(tikets[j].harga<tikets[j-1].harga){
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){ //Descending
        for (int i = 0; i <tikets.length-1;i++){
            int min = i;
            for(int j = i+1;j<tikets.length; j++){
                if(tikets[j].harga>tikets[min].harga){
                    min = j;
                }
                Tiket tmp = tikets[min];
                tikets[min] = tikets[i];
                tikets[i] = tmp;
            }    
        }
    }
}
