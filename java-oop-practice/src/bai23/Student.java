/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String name;
    private Date inTime, outTime;
    private Long onlineTime;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Student(String name, String inString, String outString) throws ParseException{
        this.name= name;
        this.inTime = sd.parse(inString);
        this.outTime = sd.parse(outString);
        this.onlineTime = (outTime.getTime() - inTime.getTime()) / (60 * 1000);
    }
    @Override
    public int compareTo(Student other) {
        int cmpTime = Long.compare(other.onlineTime, this.onlineTime);
        if (cmpTime == 0) {
            return this.name.compareTo(other.name);
        }
        return cmpTime;
    }
    @Override
    public String toString(){
        return name + " " + onlineTime;
    }
}
