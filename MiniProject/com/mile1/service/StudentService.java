package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarkArray(Student[] s) throws NullPointerException {
		int count =0;
		if(s!=null) {
			for (Student x: s) {
				if(x!=null) {
					if(x.getMarks()==null) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public int findNumberOfNullName(Student[] s) throws NullPointerException{
		int count =0;
		if(s!=null) {
			for (Student x: s) {
				if(x!=null) {
					if(x.getName()==null) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public int findNumberOfNullObjects(Student[] s) throws NullPointerException{
		int count =0;
		if(s !=null) {
			for(Student x : s) {
				if(x==null) {
					count++;
				}
			}
		}
		return count;
	}
}
