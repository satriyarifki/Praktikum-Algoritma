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
public class Postfix {
    int n;
    int top;
    char stack[];
    public Postfix(int total){
        n = total;
        top = -1;
        stack = new char[n];
    }
    public void push(char c){
        top++;
        stack[top]= c;
    }
    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }
    public void konversi(String q){
        String P = "";
        char c;
        for (int i = 0 ; i < n; i++){
            c = q.charAt(i);
            push(c);
        }
    }
    public void cetak(){
        for (int i = top ; i >= 0; i--){
            System.out.print(stack[i]);
        }
    }
}
