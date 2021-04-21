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
public class Queue {
    int max, size, front, rear;
    int Q[];
    public Queue(int n){
        max = n;
        Create();
    }
    public void Create(){
        Q = new int[max];
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
            System.out.println("elemen terdepan: " + Q[front]);
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
                System.out.print(Q[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(Q[i] + " ");
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
    public void Enqueue(int data){
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
            Q[rear] = data;
            size++;
        }
        
    }
    public int Dequeue(){
        int data = 0;
        if (IsEmpty()){ 
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
                front = 0;
            } else {
                front++;
            }
        }
        return data;
    }
    public void peekPosition(int data){
        for (int i = 0; i<=max; i++){
            if (Q[i]==data){
                System.out.println(data + "Ditemukan pada index ke-"+ i);
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
    public void peekAt(int position){
        System.out.println("Pada index ke-"+position+" terdapat data :" + Q[position]);
    }
    
}
