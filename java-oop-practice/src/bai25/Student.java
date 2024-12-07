/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai25;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String id, name, phoneNumber, email, commitee;
    private Topic topic;
    
    public Student(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setCommitee(String commitee) {
        this.commitee = commitee;
    }

    public String getCommitee() {
        return commitee;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id);
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + topic;
    }
}
