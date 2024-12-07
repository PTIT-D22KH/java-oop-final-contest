/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai59;

/**
 *
 * @author P51
 */
public class Assignment {
    private String name, topic;
    private Report report;
    public Assignment(String name, String topic, Report report) {
        this.name = name;
        this.topic = topic;
        this.report = report;
    }

    public Report getReport() {
        return report;
    }
    
    @Override
    public String toString(){
        return report.getId() + " " + name + " " + topic + " " + report;
    }
    
}
