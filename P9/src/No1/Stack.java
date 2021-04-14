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
public class Stack {
    int size;
    int top;
    char data[];
    public Stack(){
        
    }
    public Stack(int size){
        this.size = size;
        data = new char[size];
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
    public void push(char dt){
        if (!IsFull()){
            top++;
            data[top] = dt;
        } else{
            System.out.print("");
        }
    }
    public void pop(){
        if (!IsEmpty()){
            int x = data[top];
            top--;
            System.out.print("Data yang keluar : "+x);
        } else {
            System.out.print("");
        }
    }
    public void print(){
        System.out.print("Isi Stack ");
        for (int i = top; i>=0; i--){
            System.out.print(data[i]);
        }
        System.out.print("");
    }
}
