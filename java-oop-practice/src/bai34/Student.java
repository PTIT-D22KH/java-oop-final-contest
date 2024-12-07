/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai34;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String id, studentName, className, email, phoneNumber;
    private Instructor instructor;
    public Student(String id, String studentName, String className, String email, String phoneNumber) {
        this.id = id;
        this.studentName = studentName;
        this.className = className;
        this.email = email;
        this.phoneNumber = "0" + phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    @Override
    public String toString(){
        return id + " " + studentName + " " + instructor + " " + phoneNumber;
    }
    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id);
    }
}
