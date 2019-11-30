package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeVO> getAllEmployees() 
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId((long) 1);
		vo1.setFirstName("RINKU");
		vo1.setLastName("GUPTA");
		vo1.setSalary(50000);
		vo1.setCity("DEHRADUN");
		employees.add(vo1);
		
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId((long) 2);
		vo2.setFirstName("HANS");
		vo2.setLastName("KISHORE");
		vo2.setCity("ALLAHABAD");
		vo2.setSalary(35000);
		employees.add(vo2);
		
		EmployeeVO vo3 = new EmployeeVO();
		vo3.setId((long) 3);
		vo3.setFirstName("SACHIN");
		vo3.setLastName("SHARMA");
		vo3.setCity("KANPUR");
		vo3.setSalary(41000);
		employees.add(vo3);
		
		EmployeeVO vo4 = new EmployeeVO();
		vo4.setId((long) 4);
		vo4.setFirstName("DEEPAK");
		vo4.setLastName("KUMAR");
		vo4.setCity("DELHI");
		vo4.setSalary(45000);
		employees.add(vo4);
		
		
		EmployeeVO vo5 = new EmployeeVO();
		vo5.setId((long) 5);
		vo5.setFirstName("SOURABH");
		vo5.setLastName("KAMBOJ");
		vo5.setCity("GHAZIAYABAD");
		vo5.setSalary(31000);
		employees.add(vo5);
		return employees;
	}
	public List<EmployeeVO> getAllEmployeesTechnology() 
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO voo1 = new EmployeeVO();
		voo1.setId((long) 1);
		voo1.setFirstName("RINKU");
		voo1.setUsername("Rinku");
		voo1.setPassword("Chetu@123");
		voo1.setLastName("GUPTA");
		voo1.setTech("Java");
		employees.add(voo1);
		
		EmployeeVO voo2 = new EmployeeVO();
		voo2.setId((long) 2);
		voo2.setFirstName("HANS");
		voo2.setLastName("KISHORE");
		voo2.setTech(".NET");
		employees.add(voo2);
		
		EmployeeVO voo3 = new EmployeeVO();
		voo3.setId((long) 3);
		voo3.setFirstName("SACHIN");
		voo3.setLastName("SHARMA");
		voo3.setTech("SALES FORCE");
		employees.add(voo3);
		
		EmployeeVO voo4 = new EmployeeVO();
		voo4.setId((long) 4);
		voo4.setFirstName("DEEPAK");
		voo4.setLastName("KUMAR");
		voo4.setTech("PHP");
		employees.add(voo4);
		
		EmployeeVO voo5 = new EmployeeVO();
		voo5.setId((long) 5);
		voo5.setFirstName("SOURABH");
		voo5.setLastName("KAMBOJ");
		voo5.setTech("Block-Chain");
		employees.add(voo5);
		return employees;
	}
	public List<EmployeeVO> loginPage() 
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vooo1 = new EmployeeVO();
		vooo1.setUsername("Sachin");
		vooo1.setPassword("insert@123");
		employees.add(vooo1);
		
		EmployeeVO vooo2 = new EmployeeVO();
		vooo2.setUsername("hans");
		vooo2.setPassword("chetu@123");
		employees.add(vooo2);
		return employees;
		}
}