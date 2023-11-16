package com.example.SpJPARunner.Model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="STUDENT1")
public class Student1 {
	@Id
	@SequenceGenerator(name="Student1_Sequence",sequenceName="Student1_Sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Student1_Sequence")
	Long id;
	@NotNull
	String name;
	String college;
	int percentage;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", percentage=" + percentage + "]";
	}
	

}
