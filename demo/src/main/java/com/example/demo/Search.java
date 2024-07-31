package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="search")
public class Search {
    @Id
    public int id;
    public int age;
    public String name;
    public int start;
    public int finish;

    void setId(int id){
        this.id = id;
    }
    void setAge(int age) {
    	this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void setStart(int start){
        this.start = start;
    }
    void setFinish(int finish) {
    	this.finish =finish;
    }
}
