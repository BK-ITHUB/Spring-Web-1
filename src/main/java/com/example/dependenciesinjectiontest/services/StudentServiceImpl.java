package com.example.dependenciesinjectiontest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dependenciesinjectiontest.model.Student;

@Service

public class StudentServiceImpl implements StudentService {

	private List<Student> studentList = new ArrayList<>();

	@Override

	public void add(Student student) {

// TODO Auto-generated method stub

		studentList.add(student);

	}

	@Override

	public void delete(Student student) {

// TODO Auto-generated method stub

		studentList.remove(student);

	}

	@Override

	public List<Student> all() {

// TODO Auto-generated method stub

		return studentList;

	}

	@Override

	public Student findById(String id) {

		for (Student student : studentList) {

			if (student.getIdStudent().equals(id)) {

				return student;

			}

		}

		return null;

	}

	@Override
	public void remove(Student student) {
		// TODO Auto-generated method stub
		
	}

	 
}
