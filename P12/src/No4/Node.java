/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;


/**
 *
 * @author User
 */
public class Node {
    String data,nama;
    double ipk;
    int no;
    Node prev;
    Node next;
    Node(Node p, String da,String na, double ip, Node n){
        data = da;
        prev = p;
        next = n;
        nama = na;
        ipk = ip;
    }
}
