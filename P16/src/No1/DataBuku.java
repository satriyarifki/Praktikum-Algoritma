/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum16collection;

/**
 *
 * @author User
 */
public class DataBuku {
    String isbn, judul, terbit, penerbit;
    
    public DataBuku(){
        
    }
    public DataBuku(String isbn, String judul, String terbit, String penerbit){
        this.isbn = isbn;
        this.judul = judul;
        this.terbit = terbit;
        this.penerbit = penerbit;  
    }
    public String toString(){
        return "Data Buku{ " + "ISBN = " + this.isbn + ", Judul = " + judul +", Terbit = " + terbit +", Penerbit = " + penerbit+ '}';
    }
}
