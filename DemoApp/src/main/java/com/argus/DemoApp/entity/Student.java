package com.argus.DemoApp.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {


    //@Column to define column name in database table, it is option. if we remove it then column name will be automatically set to Id,firstName,lastName and email.
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id is generated and managed by database
    //.IDENTITY means it will be generated based on Id that is identity.
    @Column(name = "id")
    private int Id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    //constructor with arguments
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //No argument constructor
    //Entity class must have a no args constructor, if no constructor is defined it is automatically called but since we have defined a constructor with arguments that's why we need to manually create a no argument constructor.
    public Student() {
    }

    // setter and getter
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString method

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
