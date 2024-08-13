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
    public int ageAfter;
    public String name;
    public int start;
    public int startAfter;
    public int finish;
    public int finishAfter;

//    idの設定//
    public int getid() {
    	return id;
    }
    void setId(int id){
        this.id = id;
    }
    
//    年齢の設定(前)//
    public int getAge() {
    	return age;
    }
    void setAge(int age) {
    	if(age <= 0 || age > 60) {
    		System.out.println("もう一度入力してください");
    	}
    	this.age =age;
    }
//  年齢の設定（後)//    
    public int getArter() {
    	return ageAfter;
    }
    void setAgeAfter(int ageAfter) {    
    	if(ageAfter < age) {
    		System.out.println("もう一度入力してください");
    	}
    	this.ageAfter =ageAfter;
    }
//  名前の設定//
    public String getname() {
    	return name;
    }
    void setName(String name){
////		名前の部分一致				
//		 if (name.contains(name)) {
//			  System.out.println();
//		 }
     this.name = name;
    }
//  日時の設定(前)//
    public int getstart() {
    	return start;
    }
    void setStart(int start){    	
        this.start = start;
    }
//  日時の設定(前の後)//
    public int getstartAfter() {
    	return startAfter;
    }
    void setStartAfter(int startAfter){  
    	if(startAfter < start) {
    		System.out.println("もう一度入力してください");
    	}
        this.startAfter = startAfter;
    }
//  日時の設定(後)//
    public int getfinish() {
    	return finish;
    }
    void setFinish(int finish) {
    	if(finish < startAfter) {
    		System.out.println("もう一度入力してください");
    	}
    	this.finish =finish;
    }
//  日時の設定(後の後)//
    public int getfinishAfter() {
    	return finishAfter;
    }
    void setFinishAfter(int finishAfter) {   
    	if(finishAfter < finish) {
    		System.out.println("もう一度入力してください");
    	}
    	this.finishAfter =finishAfter;
    }

}
