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
public class DoubleLinkedList {
    Node head;
    int size;
    int noan = 100;
    DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String item){
        if (isEmpty()){
            head = new Node(null, item, noan, null);
        } else {
            Node newNode = new Node(null, item, noan, head);
            head.prev = newNode;
            head = newNode;
        }
        noan++;
        size++;
    }
    public void addLast(String item){
        if (isEmpty()){
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, noan, null);
            current.next = newNode;
            noan++;
            size++;
        }
        
    }
    public void add(String item, int index) throws Exception{
        if (isEmpty()){
            addFirst(item);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, item,noan, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item,noan, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        noan++;
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head  = null;
        size = 0;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println(tmp.no +". "+ tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List Masih kosong");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List Masih kosong");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List Masih kosong");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public String getLast(){
        Node current = head;
        for (int i=0; i<size; i++){
            if(i==size-1){
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    
}
