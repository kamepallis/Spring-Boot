package com.sudhir.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "marks")
    private float grade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
