/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author P51
 */
public class Number implements Comparable<Number>{
    private int value, fre;
    private static int id = 0;

    public Number(int value) {
        this.value = value;
        this.fre = 1;
        this.id++;
    }

    public void setFre() {
        this.fre++;
    }

    public int getFre() {
        return fre;
    }
    

    public int getValue() {
        return value;
    }
    @Override
    public int compareTo(Number other) {
        if (this.fre == other.fre) {
            return Integer.compare(this.id, other.id);
        }
        return Integer.compare(other.fre, this.fre);
    }
    @Override
    public String toString(){
        return "" + value;
    }
    
}
