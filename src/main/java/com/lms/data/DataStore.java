package com.lms.data;

import java.util.ArrayList;
import java.util.List;

import com.lms.models.AdminModel;
import com.lms.models.AssignmentModel;
import com.lms.models.CourseModel;
import com.lms.models.InstructorModel;
import com.lms.models.StudentModel;
import com.lms.models.SubmissionModel;

public class DataStore {
	
	public static List<StudentModel>students=new ArrayList<>();
	public static List<InstructorModel>instructors=new ArrayList<>();
	public static List<AdminModel>admins=new ArrayList<>();
	public static List<CourseModel>courses=new ArrayList<>();
	public static List<AssignmentModel>assignments=new ArrayList<>();
	public static List<SubmissionModel>submissions=new ArrayList<>();
}
