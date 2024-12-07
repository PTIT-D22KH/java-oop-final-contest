/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai46;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Timer implements Comparable<Timer>{
    private int hour, minutes, seconds;

    public Timer(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    @Override
    public int compareTo(Timer other) {
        if (this.hour == other.hour) {
            if (this.minutes == other.minutes) {
                return Integer.compare(this.seconds, other.seconds);
            }
            return Integer.compare(this.minutes, other.minutes);
        }
        return Integer.compare(this.hour, other.hour);
    }
    @Override
    public String toString(){
        return hour + " " + minutes + " " + seconds;
    }
}
