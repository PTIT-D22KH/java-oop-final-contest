/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Film implements Comparable<Film>{
    private String filmId, filmName;
    private int numEpisodes;
    private Date premierDate;
    private Category category;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    public Film(String filmId, String premierDateString, String filmName, int numEpisodes, Category category) throws ParseException{
//        System.out.println(filmId + " " + filmName + " " + premierDateString);
        this.filmId = filmId;
        this.filmName = filmName;
        this.numEpisodes = numEpisodes;
//        System.out.println(premierDateString);
        this.premierDate = sd.parse(premierDateString);
        this.category = category;
    }
    @Override
    public int compareTo(Film o) {
        int cmpDate = this.premierDate.compareTo(o.premierDate);
        if (cmpDate == 0) {
            int cmpName = this.filmName.compareTo(o.filmName);
            if (cmpName == 0) {
                return Integer.compare(o.numEpisodes, this.numEpisodes);
            }
            return cmpName;
        }
        return cmpDate;
    }
    @Override
    public String toString(){
        return filmId + " " + category + " " + sd.format(premierDate) + " " + filmName + " " + numEpisodes;
    }
    
    
    
}
