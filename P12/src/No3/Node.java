/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import No2.*;
import praktikum12.*;

/**
 *
 * @author User
 */
public class Node {
    String data;
    int no;
    Node prev;
    Node next;
    Node(Node p, String da,int noan, Node n){
        data = da;
        prev = p;
        next = n;
        no = noan;
    }
}
