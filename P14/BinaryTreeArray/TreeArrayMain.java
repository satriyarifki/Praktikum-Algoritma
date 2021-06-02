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
public class TreeArrayMain {
    public static void main(String[] args){
        TreeArray bta = new TreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int idLast = 6;
        bta.populateData(data, idLast);
        bta.add(0, 2);
        bta.add(0, 10);
        bta.check();
        System.out.println("");
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePreOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
        System.out.println("");
    }
}
