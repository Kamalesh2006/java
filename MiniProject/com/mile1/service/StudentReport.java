package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrades(Student studentObject) {
		int[] marks= studentObject.getMarks();
		int sum =0;
		for(int x : marks) {
			if (x<35) {
				studentObject.setGrade("F");
				sum=0;
				break;
			}else {
				sum = sum+x;		}
		}
		if(sum!=0) {
			if(sum <150) {
				studentObject.setGrade("C");
			}
			else if (sum <200)
				studentObject.setGrade("B");
		}else if (sum <250)
			studentObject.setGrade("A");
		else {
			studentObject.setGrade("A+");
		}
	return studentObject.getGrade();
	}
	
	public String validate(Student s) throws NullMarksArrayException,NullStudentObjectException,NullNameException {
		if (s==null) {
			throw new NullStudentObjectException();
		}else {
			if(s.getName()==null) {
				throw new NullNameException();
			}
			else if (s.getMarks()==null) {
				throw new NullMarksArrayException();
			}
			else {
				return "Valid";
			}
		}
	}
}
