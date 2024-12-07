/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai33;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String id, name, className, email, phoneNumber, gender, size;

    public Student(String id, String name, String className, String email, String phoneNumber, String gender) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email + " " + phoneNumber;
    }
    
}
