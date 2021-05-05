/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

import praktikum12.*;

/**
 *
 * @author User
 */
public class Node {
    int data;
    Node prev;
    Node next;
    Node(Node p, int da, Node n){
        data = da;
        prev = p;
        next = n;
    }
}
