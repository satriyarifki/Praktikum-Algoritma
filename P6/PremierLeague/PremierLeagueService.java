/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PremierLeague;

/**
 *
 * @author User
 */
public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[20];
    int index;
    void tambah(PremierLeague t){
        if(index<leagues.length){
            leagues[index] = t;
            index++;
        }
    }
    public void tampilAll(){
        for(PremierLeague t : leagues){
            System.out.println("|" + t.team + "| play : " + t.play + "| points : " + t.pts + "| goal : " + t.goal   );
        }
    }
    public void insertionSort(boolean asc){
        for (int i = 1;i < leagues.length; i++){
            PremierLeague temp = leagues[i];
            int j = i;
            if (asc == true){
                while (j > 0 && leagues[j-1].pts > temp.pts){
                    leagues[j] = leagues [j-1];
                    j--;
                }
            } else {
                while (j>0 && leagues[j-1].pts < temp.pts){
                    leagues[j] = leagues [j-1];
                    j--;
                }
            }
            leagues[j] = temp;
        }
        
    }
    
}
