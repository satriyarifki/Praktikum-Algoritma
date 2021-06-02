/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author User
 */
public class Node {
    int data;
    Node left;
    Node right;
    public Node(){
        
    }
    public Node(int data){
        left = null;
        this.data = data;
        right = null;
    }

}
