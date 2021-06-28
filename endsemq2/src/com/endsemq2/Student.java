package com.endsemq2;


import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

/**
 * 
 * @author Mayuresh
 *
 */

@Entity
@Table(name="STUDENT")
public class Student{
	
	@Id @GeneratedValue
	private int student_id;
	
	private String student_name,course;
	private float isa1,isa2,isa3,endsem,total;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getIsa1() {
		return isa1;
	}
	public void setIsa1(float isa1) {
		this.isa1 = isa1;
	}
	public float getIsa2() {
		return isa2;
	}
	public void setIsa2(float isa2) {
		this.isa2 = isa2;
	}
	public float getIsa3() {
		return isa3;
	}
	public void setIsa3(float isa3) {
		this.isa3 = isa3;
	}
	public float getEndsem() {
		return endsem;
	}
	public void setEndsem(float endsem) {
		this.endsem = endsem;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	
	
}
	

