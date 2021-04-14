/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilih;
        Stack st = new Stack(7);
        Struk sr1 = new Struk("1234", "20-3-2021",5, 50000 );
        st.push(sr1);
        Struk sr2 = new Struk("1234", "21-3-2021",5, 50000 );
        st.push(sr2);
        Struk sr3 = new Struk("1345", "22-3-2021",5, 50000 );
        st.push(sr3);
        Struk sr4 = new Struk("1454", "24-3-2021",5, 50000 );
        st.push(sr4);
        Struk sr5 = new Struk("3421", "25-3-2021",5, 50000 );
        st.push(sr5);
        Struk sr6 = new Struk("1342", "27-3-2021",5, 50000 );
        st.push(sr6);
        Struk sr7 = new Struk("6431", "28-3-2021",5, 50000 );
        st.push(sr7);
        
        st.print();


    }    
}
