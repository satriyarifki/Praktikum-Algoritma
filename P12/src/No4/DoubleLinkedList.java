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
    public void addFirst(String item, String na, double ipk){
        if (isEmpty()){
            head = new Node(null, item, na, ipk , null);
        } else {
            Node newNode = new Node(null, item, na, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        noan++;
        size++;
    }
    public void addLast(String item, String na, double ipk){
        if (isEmpty()){
            addFirst(item, na, ipk);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, na, ipk, null);
            current.next = newNode;
            noan++;
            size++;
        }
        
    }
    public void add(String item, String na, double ipk , int index) throws Exception{
        if (isEmpty()){
            addFirst(item, na, ipk);
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
                Node newNode = new Node(null, item, na, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, na, ipk, current);
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
                System.out.println("NIM         : "+tmp.data);
                System.out.println("    Nama    : "+tmp.nama);
                System.out.println("    IPK     : "+tmp.ipk);
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
    int FindSeqSearch(String cari){
        int i = 0;
        Node current = head;
        while (i < size){
            if (current.data == cari) {
                break;
            }
            current = current.next;
            i++;
        }
        return i-1;
    }
    void bubbleSort(){  //Ascending
        Node tmp = null;
        Node tmp1 = null;
        Node tmp2 = null;
        Node current = head;
        for (int i = 0; i < size-1; i++){
            for(int j = 1; i < size-1; i++){
                if(current.next.ipk>current.ipk){
                    if (current.prev == null){
                        current.next = tmp;
                        current = tmp1;
                        current.next.prev = null;
                        current.next = current.next.next;
                        current.next.next = tmp1;
                        current.prev = tmp;
                    } else {
                        current.next = tmp;
                        current = tmp1;
                        current.next.prev = current.prev;
                        current.next = current.next.next;
                        current.next.next = tmp1;
                        current.prev = tmp;
                    }
                    
                    
                }
            }
        }
    }
    
}
