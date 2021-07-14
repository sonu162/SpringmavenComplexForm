package springmvcsearch.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	
	
	@Id
	private Long studentId;
	
	private String name;
	
	private Date dob;
	@OneToMany(mappedBy = "Student", cascade = CascadeType.ALL)
	private List<Courses> courses;
	
	private String gender;
	
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return studentId;
	}
	public void setId(Long id) {
		this.studentId = id;
	}
	public Date getDate() {
		return dob;
	}
	public void setDate(Date date) {
		this.dob = date;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Student(String name, Long id, Date dob, List<Courses> courses, String gender, String type) {
		super();
		this.name = name;
		this.studentId = id;
		this.dob = dob;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
	}
	public Student(){ 
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + studentId + ", date=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + "]";
	}
	
	
	

}
