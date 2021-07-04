package src.pack.dao;

import java.util.List;
import java.util.Set;

import src.pack.models.Employee;

import java.io.IOException;
import java.sql.SQLException;

public interface DAO
{
 
	public void initDB() throws SQLException, IOException;
	
	public int create(Employee e) throws SQLException;
	public int update(Employee e) throws SQLException;
	public int deleteByEmail(String emailId) throws SQLException;
	
	public Employee getEmployeeByEmail(String emailId) throws SQLException;
	
	public List<Employee> getAllEmployees() throws SQLException;
	
	
	public Set<Employee> getAllEmployeesSortByEmailId() throws SQLException;
	
	public void closeDB() throws SQLException;
}