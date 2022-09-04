package com.mile1.main;

import com.mile1.bean.*;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student[] data = new Student[4];
	
	public StudentMain() {
		for (int i =0;i<data.length ;i++) {
			data[i] = new Student();
		}
		data[0] = new Student("Sekar",new int[] {85,75,95});
		data[1] =  new Student(null,new int[] {11,22,33});
		data[2] = new Student(null,new int[] {11,22,33});
		data[3]= new Student("Manoj",null);
		
	}

	public static void main(String[] args){
		try {
		StudentReport sr= new StudentReport();
		for(Student s : data){
			if(sr.validate(s)=="Valid") 
				System.out.println(sr.findGrades(s));
			}
		}catch(NullMarksArrayException|NullNameException|NullStudentObjectException e) {
			e.printStackTrace();
		}
		finally {
			StudentService ss = new StudentService();
			System.out.println(ss.findNumberOfNullMarkArray(data));
			System.out.println(ss.findNumberOfNullName(data));
			System.out.println(ss.findNumberOfNullObjects(data));
		}

	}

}
