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
public class Stack {
    int size;
    int top;
    Struk data[];
    public Stack(){
        
    }
    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Struk dt){
        if (!IsFull()){
            top++;
            data[top] = dt;
        } else{
            System.out.print("");
        }
    }
    public void pop(){
        if (!IsEmpty()){
            Struk x = data[top];
            top--;
            System.out.print("Data yang keluar : ");
        } else {
            System.out.print("");
        }
    }
    public void print(){
        System.out.print("Struk ");
        for (int i = top; i>=0; i--){
            System.out.println("nomor : "+ data[i].noTrans);
            System.out.println("Tanggal beli: "+data[i].tglBeli);
            System.out.println("Jumlah : "+data[i].jumlah);
            System.out.println("total harga : " +data[i].harga);
        }
        System.out.print("");
    }
}
