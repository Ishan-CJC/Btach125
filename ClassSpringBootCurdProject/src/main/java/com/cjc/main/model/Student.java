package com.cjc.main.model;

public class Student {

	private int id;
	private String name;
	private String addr;
	private double mobno;
	private int age;
	private int salary;
	private String email;
	private String uname;
	private String pass;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getMobno() {
		return mobno;
	}
	public void setMobno(double mobno) {
		this.mobno = mobno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + ", mobno=" + mobno + ", age=" + age
				+ ", salary=" + salary + ", email=" + email + ", uname=" + uname + ", pass=" + pass + "]";
	}
	
}
