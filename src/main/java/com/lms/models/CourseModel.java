package com.lms.models;

import java.util.ArrayList;
import java.util.List;

public class CourseModel {
	public int ID;
	public String name;
	public String title;
	public String subTitle;
	public List<InstructorModel>instructors=new ArrayList<>();
	public List<CourseModel>sections=new ArrayList<>();
	public List<StudentModel>enrolledStudents=new ArrayList<>();
	public List<AssignmentModel>assignments=new ArrayList<>();

	
	public CourseModel(int ID,String name, String title,String subTitle) {
		this.ID=ID;
		this.name=name;
		this.title=title;
		this.subTitle=subTitle;
	}
}
