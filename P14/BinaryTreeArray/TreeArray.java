/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeArray;

/**
 *
 * @author User
 */
public class TreeArray {
    int[] data;
    int idLast;
    public TreeArray(){
        data = new int[20];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idLast = idxLast;
    }
    void add(int current, int data){
        if (this.data[0] == 0){
            this.data[0] = data;
        }
        else {
            if (data<this.data[current]){
                if (this.data[2*current+1]!=0){
                    add(this.data[2*current+1],data);
                }else {
                    this.data[2*current+1] = data; 
                }
                
            } else {
                if (this.data[2*current+2]!=0){
                    add(this.data[2*current+2],data);
                }else {
                    this.data[2*current+2] = data; 
                }
            }
        }
    }
    void check(){
        for (int i = 0; i<this.data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    void traverseInOrder(int idStart){
        if (idStart<=idLast){
            traverseInOrder(2*idStart+1);
            System.out.print(data[idStart]+" ");
            traverseInOrder(2*idStart+2);
        }
    }
    void traversePreOrder(int idStart){
        if (idStart<=idLast){
            System.out.print(data[idStart]+" ");
            traverseInOrder(2*idStart+1);
            traverseInOrder(2*idStart+2);
        }
    }
    void traversePostOrder(int idStart){
        if (idStart<=idLast){
            traverseInOrder(2*idStart+1);
            traverseInOrder(2*idStart+2);
            System.out.print(data[idStart]+" ");
        }
    }
}
