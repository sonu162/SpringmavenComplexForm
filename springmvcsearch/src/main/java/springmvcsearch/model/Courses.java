package springmvcsearch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Courses {

	@Id
	private String coursesId;
	private String java;
	private String c;
	private String python;
	private String django;
	private String springFramework;
	@ManyToOne
	@JoinColumn(name = "studentId")
	private Student student;
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getPython() {
		return python;
	}
	public void setPython(String python) {
		this.python = python;
	}
	public String getDjango() {
		return django;
	}
	public void setDjango(String django) {
		this.django = django;
	}
	public String getSpringFramework() {
		return springFramework;
	}
	public void setSpringFramework(String springFramework) {
		this.springFramework = springFramework;
	}
	@Override
	public String toString() {
		return "Courses [java=" + java + ", c=" + c + ", python=" + python + ", django=" + django + ", springFramework="
				+ springFramework + "]";
	}
	public Courses(String java, String c, String python, String django, String springFramework) {
		super();
		this.java = java;
		this.c = c;
		this.python = python;
		this.django = django;
		this.springFramework = springFramework;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
