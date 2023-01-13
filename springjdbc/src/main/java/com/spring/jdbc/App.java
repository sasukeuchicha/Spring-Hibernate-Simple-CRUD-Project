package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//Below code commented because it is not best practice instead just check if working
		
//        System.out.println( "JDBC Program " );
//        // spring jdbc => jdbc Template
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/JDBCConfig.xml");
//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
////        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//        
//        //insert query
//        String query = "insert into Student(id, name, city) values(?, ?, ?)";
//        
//        //execute query
//        int result = template.update(query, 3, "Sammy Kataria", "Punjab");
//        
//        System.out.println("Number of record inserted : "+result);
		System.out.println("JDBC Program ");
		// spring jdbc => jdbc Template
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/JDBCConfig.xml");
		StudentDao studentDaoVariable = context.getBean("studentDao", StudentDao.class);
		
		Student student = new Student(10, "hi", "df");
		student.setId(3);
		student.setName("Baba Ramdev");
		student.setAddress("Sakleshpura");
		
//		insert row
//		int res = studentDaoVariable.insert(student);
		
//		update row
//		int res = studentDaoVariable.changeRow(student);
//		System.out.println(res);
		
//		delete row
//		int res = studentDaoVariable.deleteRow(student);
//		System.out.println(res);
		
//		get student
//		Student stu = studentDaoVariable.getStudent(student.getId());
//		System.out.println(stu);
		
//		get all students
		List<Student> studentList = studentDaoVariable.getAllStudents();
		for(Student s:studentList) {
			System.out.println(s);
		}
		
	}
}
