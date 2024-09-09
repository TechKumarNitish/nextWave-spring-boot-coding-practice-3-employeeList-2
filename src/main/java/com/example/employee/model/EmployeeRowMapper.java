package com.example.employee.model;

/**
 * EmployeeRowMapper
 */

import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.example.employee.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
                rs.getInt("employeeid"),
                rs.getString("employeename"),
                rs.getString("email"),
                rs.getString("department"));
    }
}