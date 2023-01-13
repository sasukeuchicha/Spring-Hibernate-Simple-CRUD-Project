package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		//insert query
        String query = "insert into Student(id, name, city) values(?, ?, ?)";
        int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getAddress());
        return res;
	}

	public int changeRow(Student student) {
		// update query
		String query = "update student set name=?, city=? where id=?";
		int res = this.jdbcTemplate.update(query, student.getName(), student.getAddress(), student.getId());
		return res;
	}

	public int deleteRow(Student student) {
		// delete row
		String query = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query, student.getId());
		return res;
	}

	public Student getStudent(int studentId) {
		// read row
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student stu = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return stu;
	}

	public List<Student> getAllStudents() {
		// read all rows
		String query = "select * from student";
		List<Student> stu = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return stu;
	}

}
