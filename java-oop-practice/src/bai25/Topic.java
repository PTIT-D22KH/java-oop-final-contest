/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai25;

/**
 *
 * @author P51
 */
public class Topic {
    private String id, lecturer, topic;

    public Topic(String id, String lecturer, String topic) {
        this.id = id;
        this.lecturer = lecturer;
        this.topic = topic;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return topic + " " + lecturer;
    }
}
