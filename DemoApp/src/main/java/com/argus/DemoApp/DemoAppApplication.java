package com.argus.DemoApp;

import com.argus.DemoApp.dao.StudentDAO;
import com.argus.DemoApp.dao.StudentDAoImpl;
import com.argus.DemoApp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
			createStudent(studentDAO);
			readStudent(studentDAO);
			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println(studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student tempStudent = studentDAO.findById(studentId);
		tempStudent.setEmail("poorvi21@gmail.com");
		studentDAO.update(tempStudent);
		System.out.println(tempStudent);

	}

	public void readStudent(StudentDAO studentDAO){
		Student tempStudent = new Student("Rachit", "Patel", "rachit@gmail.com");
		studentDAO.save(tempStudent);
		int theId = tempStudent.getId();
		System.out.println(theId);
		Student myStudent = studentDAO.findById(theId);
		System.out.println(myStudent);

	}

	private void createStudent(StudentDAO studentDAO) {
		//create student object
		Student tempstd = new Student("Poorvi" , "Patel", "poorvi@gmail.com");

		//save student object
		studentDAO.save(tempstd);

		//display id of saved student
		System.out.println("the id of saved student is: " + tempstd.getId());

	}

}
