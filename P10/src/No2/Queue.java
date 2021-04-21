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
public class Queue {
    int max, size, front, rear;
    Mahasiswa[] antrian;
    public Queue(int n){
        max = n;
        Create();
    }
    public void Create(){
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
       if (size == 0){
            return true;
        } else {
            return false;
        } 
    }
    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }
    public void peek(){
        if (!IsEmpty()){
            System.out.println("elemen terdepan: " + antrian[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("elemen terdepan: " + antrian[rear]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.print(antrian[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah Elemen : " + size);
        }
    }
    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(Mahasiswa m){
        if (IsFull()){
            System.out.println("Queue Sudah penuh");
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max -1){
                    rear = 0;
                } else
                    rear++;
            }
            antrian[rear] = m;
            size++;
        }
        
    }
    public int Dequeue(){
        Mahasiswa data = null;
        int idx = 0;
        if (IsEmpty()){ 
            System.out.println("Queue masih kosong");
        } else {
            data = antrian[front];
            idx = front;
            size--;
            if (IsEmpty()){
                front = rear = -1;
                front = 0;
            } else {
                front++;
            }
        }
        return front ;
    }
    public void peekPosition(String data){
        for (int i = 0; i<=max; i++){
            if (antrian[i].nim == data){
                System.out.println(data + "Ditemukan pada antrian ke-"+ (i+1));
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
    public void printMahasiswa(int position){
        System.out.println("Pada index ke-"+position+" terdapat data :" + antrian[position]);
    }
}
