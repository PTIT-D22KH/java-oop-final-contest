/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai34;

/**
 *
 * @author P51
 */
public class Instructor {
    private String instructorName,topic;

    public Instructor(String instructorName, String topic) {
        this.instructorName = instructorName;
        this.topic = topic;
    }

    @Override
    public String toString(){
        return instructorName + " " + topic;
    }
    
}
