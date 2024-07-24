package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="member")
public class Member {
    @Id
    public int id;
    public String name;
    public String password;

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setPassword(String password){
        this.password = password;
    }
}
