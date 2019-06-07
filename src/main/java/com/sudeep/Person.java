package com.sudeep;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private int age;

    private String name;

    @OneToMany
    private List<Job> job=new ArrayList<Job>();

    public Long getId() {
        return id;
    }



    public List<Job> getJob() {
		return job;
	}



	public void setJob(List<Job> job) {
		this.job = job;
	}



	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}