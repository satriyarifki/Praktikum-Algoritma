/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;

import No3.*;
import No2.*;
import LinkedList.*;

/**
 *
 * @author User
 */
public class Node {
    String nama, alamat, rekening;
    Node next;
    public Node(String n, String a, String r, Node berikutnya){
        this.nama=n;
        this.alamat=a;
        this.rekening=r;
        this.next=berikutnya;
    }
}    
