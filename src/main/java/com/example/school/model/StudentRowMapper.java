package com.example.school.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.school.model.Student;

public class StudentRowMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Student(
                rs.getInt("studentId"),
                rs.getString("studentName"),
                rs.getString("Gender"),
                rs.getInt("Standard")
                );
    }
}