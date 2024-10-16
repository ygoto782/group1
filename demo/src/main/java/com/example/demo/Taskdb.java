package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="taskdb")
public class Taskdb{
	@Id
	private String syain;
	private String age;
	private String pass;
	private int id;
	
	void setSyain(String syain) {
		this.syain=syain;
	}
	String getSyain() {
		return this.syain;
	}
	
	
	void setAge(String age) {
		this.age=age;
	}
	String getAge() {
		return this.age;
	}
	
	
	void setPass(String pass) {
		this.pass=pass;
	}
	String getPass() {
		return this.pass;
	}

	void setId(int num) {
		this.id=num;
	}
	int getId() {
		return this.id;
	}
	
}