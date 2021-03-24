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
public class PremierLeague {
    public String team;
    public int play;
    public int goal;
    public int pts;

    
    PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        pts = pt;
    }
}
