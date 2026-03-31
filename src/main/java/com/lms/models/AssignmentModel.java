package com.lms.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AssignmentModel {
	
	public int ID;
	public String title;
	public LocalDateTime dueDate;
	public List<CourseModel>descriptions=new ArrayList<>();
	public List<SubmissionModel>submissions=new ArrayList<>();
	
}
