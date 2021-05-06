/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;


/**
 *
 * @author User
 */
public class Node {
    String data,nama,jurusan, prodi;
    double ipk;
    Node prev;
    Node next;
    Node(Node p, String da,String na, String jur, String prod, double ip, Node n){
        data = da;
        prev = p;
        next = n;
        nama = na;
        ipk = ip;
        jurusan =jur;
        prodi = prod;
    }
}
