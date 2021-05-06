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
    public void addFirst(String item, String na, String jur, String prod, double ipk){
        if (isEmpty()){
            head = new Node(null, item, na,jur,prod, ipk , null);
        } else {
            Node newNode = new Node(null, item, na,jur,prod, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        noan++;
        size++;
    }
    public void addLast(String item, String na,String jur, String prod, double ipk){
        if (isEmpty()){
            addFirst(item, na,jur,prod, ipk);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, na,jur,prod, ipk, null);
            current.next = newNode;
            noan++;
            size++;
        }
        
    }
    public void add(String item, String na,String jur, String prod, double ipk , int index) throws Exception{
        if (isEmpty()){
            addFirst(item, na,jur,prod, ipk);
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
                Node newNode = new Node(null, item, na,jur,prod, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, na,jur,prod, ipk, current);
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
                System.out.println("    Jurusan : "+tmp.jurusan);
                System.out.println("    Prodi   : "+tmp.prodi);
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
    public int FindSeqSearch(String cari){
        int pos = -1;
        Node current = head;
        for(int i = 0; i < size; i++){
            if (current.data.equals(cari)){
                pos = i;
                break;
            }
            current = current.next;
        }
        return pos;
    }
    public void getData(String cari){
        Node current = head;
        Node tmp;
        int i = 0;
        while( i< size ){
            if (current.data.equals(cari)){
                System.out.println("NIM:    "+current.data);
                System.out.println("Nama:   "+current.nama);
                System.out.println("Jurusan:"+current.prodi);
                System.out.println("Prodi:  "+current.jurusan);
                System.out.println("ipk:    "+current.ipk);
            }
            current = current.next;
            i++;
        }
    }
    public void bubbleSort(){  //Descending
        String tmp;
        double tmp1;
        Node current = head;
        for (int i = 0; i < size-1; i++){
            for(int j = 1; j < size-1; j++){
                if(current.next.ipk>current.ipk){
                    tmp = current.data;
                    current.data = current.next.data;
                    current.next.data = tmp;
                    tmp = current.nama;
                    current.nama = current.next.nama;
                    current.next.nama = tmp;
                    tmp = current.jurusan;
                    current.jurusan = current.next.jurusan;
                    current.next.jurusan = tmp;
                    tmp = current.prodi;
                    current.prodi = current.next.prodi;
                    current.next.prodi = tmp;
                    tmp1 = current.ipk;
                    current.ipk = current.next.ipk;
                    current.next.ipk = tmp1;
                }
                current = current.next;
            }
        }
    }
    public void getFirst(){
        System.out.println("NIM:    "+head.data);
        System.out.println("Nama:   "+head.nama);
        System.out.println("Jurusan:"+head.prodi);
        System.out.println("Prodi:  "+head.jurusan);
        System.out.println("ipk:    "+head.ipk);
    }
}
