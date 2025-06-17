package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.Student;

public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    // Setter for Spring to inject JdbcTemplate
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Method to insert student
    public int insert(Student student) {
        String query = "INSERT INTO Student(id, name, city) VALUES (?, ?, ?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }
}
