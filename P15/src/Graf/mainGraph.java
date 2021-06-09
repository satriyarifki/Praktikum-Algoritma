/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graf;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class mainGraph {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Graph gr = new Graph(6);
        
        for (int i = 0; ;i++){
            System.out.println("Masukkan Vertex awal lintasan : ");
            int c = sc.nextInt();
            System.out.println("Masukkan Vertex akhir lintasan : ");
            int k = sc.nextInt();
            gr.addEdge(c, k);
            System.out.println("Apakah ingin menambah lintasan: (Y/N) ");
            char y = sc.next().charAt(0);
            if(y == 'N'|| y== 'n'){
                break;
            }
        }
        if (gr.graphType(3, 2)==true){
            System.out.println("Tipe graph adalah Undirected");
        } else if (gr.graphType(3, 2)==false){
            System.out.println("Tipe graph adalah Directed");
        } else{
            System.out.println("Tipe graph adalah bingung");
        }
//        gr.addEdge(0, 1);
//        gr.addEdge(0, 4);
//        gr.addEdge(1, 2);
//        gr.addEdge(1, 3);
//        gr.addEdge(1, 4);
//        gr.addEdge(2, 3);
//        gr.addEdge(3, 4);
//        gr.addEdge(3, 0);
        gr.printGraph();
        gr.degree(2);
    }
}

