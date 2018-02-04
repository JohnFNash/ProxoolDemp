package com.johnfnash.study.model;

public class Student {
	private long id;
	private String name;
	private String sex;

	public Student() {
	}

	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public Student(long id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
