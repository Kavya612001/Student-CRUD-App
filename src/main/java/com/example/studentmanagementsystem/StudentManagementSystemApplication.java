package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student st1= new Student("Kavya","Sampath","kavya612001@gmail.com");
//		studentRepository.save(st1);
//
//		Student st2= new Student("Nandha","Kumar","nandhu04@gmail.com");
//		studentRepository.save(st2);
//
//		Student st3= new Student("Nancy","Tharcius","nancy@gmail.com");
//		studentRepository.save(st3);
	}
}
