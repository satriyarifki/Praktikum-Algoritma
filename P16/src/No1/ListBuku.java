/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum16collection;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class ListBuku {
    Stack <DataBuku> stacks = new Stack<>();
    public void push(DataBuku data){
        stacks.push(data);
    }
    public void pop(){
        stacks.pop();
    }
    public void peek(){
        System.out.println(stacks.peek());
    }
    public void tampil(){
        stacks.stream().forEach(data -> {
            System.out.println("" + data.toString());
        });
    }
    public static void main(String[] args){
        ListBuku lb = new ListBuku();
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan ISBN: ");
                    String is = sc.next();
                    System.out.println("Masukkan Judul: ");
                    String ju = scn.next();
                    System.out.println("Masukkan Terbit: ");
                    String te = sc.next();
                    System.out.println("Masukkan Penerbit: ");
                    String pe = scn.next();
                    DataBuku db = new DataBuku(is, ju, te, pe);
                    lb.push(db);
                    break;
                case 2:
                    lb.pop();
                    break;
                case 3:
                    lb.peek();
                    break;
                case 4:
                    lb.tampil();
                    break;
                case 5:
                    break;
            }
        } while (pilih < 5 && pilih >0);
    }
    public static void menu(){
        System.out.println("--------------------------------------");
        System.out.println("Data Buku Perpus  ");
        System.out.println("---------------------");
        System.out.println("    1.Entry Judul Buku");
        System.out.println("    2.Ambil Buku teratas");
        System.out.println("    3.Cek Judul buku teratas");
        System.out.println("    4.info semua judul buku");
        System.out.println("    5.Exit");
        System.out.println("--------------------------------------");
    }
}
