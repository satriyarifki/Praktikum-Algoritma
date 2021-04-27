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
public class SingleLinkedList {
    Node head;
    Node tail;
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Isi Linked List:\t");
            while(tmp != null){
                System.out.print(tmp.nama + "\t");
                System.out.print(tmp.alamat + "\t");
                System.out.print(tmp.rekening + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    public void addFirst(String nama, String alamat, String rek){
        Node ndInput = new Node(nama, alamat, rek, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(String nama, String alamat, String rek){
        Node ndInput = new Node(nama,alamat, rek, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, String nama, String alamat, String rek){
        Node ndInput = new Node( nama, alamat, rek, null);
        Node temp = head;
        do {
            if (temp.rekening.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertBefore(String key, String nama, String alamat, String rek){
        Node ndInput = new Node(nama, alamat, rek, null);
        Node temp = head;
        do {
            if (temp.next.rekening.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail = ndInput;
                break;
            } 
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, String nama, String alamat, String rek){
        if (index <0){
            System.out.println("Indeks salah");
        } else if(index == 0){
            addFirst(nama, alamat, rek);
        } else{
            Node temp = head;
            for(int i = 0; i<index -1 ; i++){
                temp = temp.next;
            }
            temp.next = new Node(nama, alamat, rek, temp.next);
            if(temp.next.next==null) tail = temp;
        }
    }
    public Node getData(int index){
        Node tmp = head;
        for(int i = 0; i < index;i++){
          tmp = tmp.next;  
        }
        return tmp;
    }
    public int indexOf(String key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.rekening!=key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        } else if (head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(String key){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        } else{
            Node temp = head;
            while (temp != null){
                if ((temp.rekening==key)&&(temp==head)){
                    this.removeFirst();
                    break;
                } else if (temp.next.rekening == key){
                    temp.next = temp.next.next;
                    if(temp.next==null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index -1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next==null){
                tail = temp;
            }
        }
    }
}
