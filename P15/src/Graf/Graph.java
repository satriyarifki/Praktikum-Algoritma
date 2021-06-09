/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graf;
import java.util.LinkedList;
/**
 *
 * @author User
 */
public class Graph {
    int vertex;
    DoubleLinkedList list[];
    
    public Graph(int vertex){
        this.vertex = vertex;
        list = new DoubleLinkedList [vertex];
        for (int i = 0; i < vertex;i++ ){
            list[i] = new DoubleLinkedList();
        }
    }
    
    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
    public void degree(int source)throws Exception{
        System.out.println("degree dari vertex " + source + " sejumlah " +list[source].size());
        int k , totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size(); j++){
                if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
        }
        for (k = 0; k < list[source].size(); k++){
            list[source].get(k);
        }
        totalOut = k;
        System.out.println("");
    }
    public void removeEdge(int source, int destination)throws Exception{
        for(int i = 0; i < vertex; i++){
            if(i==destination){
                list[source].remove(destination);
                list[destination].remove(source);
            }
        }
    }
    public boolean graphType(int source, int destination){
        if (list[source].FindSeqSearch(destination) == destination || list[destination].FindSeqSearch(source)== source){
            return true;
        }
        return false;
    }
    public void removeAllEdge(){
        for(int i = 0; i < vertex ; i++){
            list[i].clear();
        }
        System.out.println("Graph Berhasil dikosongkan");
    }
    public void printGraph()throws Exception{
        for(int i = 0; i<vertex; i++){
            if(list[i].size()>0){
                System.out.print("Vertex " + i + " terhubung dengan : ");
                for(int j = 0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
