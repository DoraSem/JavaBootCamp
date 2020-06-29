package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	Employee e1;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
		
		e1 = new Employee();
		e1.setId("1");
		e1.setFirstName("Sarah");
		e1.setLastName("Conor");
		e1.setSalary(3000);
		
		emp.insertEmployee(e1);
		
		
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}
	
	public void testInsertEmployee(){
		Employee e2 = new Employee();
		e2.setId("2");
		e2.setFirstName("Joe");
		e2.setLastName("Smith");
		e2.setSalary(3500);
		
		emp.insertEmployee(e2);
		Employee result = emp.findEmployeeById("2");
		
		assertEquals(result.getId(), "2");
		assertEquals(result.getFirstName(), "Joe");
		assertEquals(result.getLastName(), "Smith");
		assertEquals(result.getSalary(), 3500);
		
	}

	public void testFindEmployeeById_MatchFound() {
		Employee e1 = emp.findEmployeeById("1");
		assertEquals(e1.getFirstName(), "Sarah");
		assertEquals(e1.getLastName(), "Conor");
		assertEquals(e1.getSalary(), 3000);
	}

	public void testFindEmployeeById_NoMatchFound() {
		e1 = emp.findEmployeeById("4");
		assertNull(e1);
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Sarah");
		assertEquals(list.get(0).getFirstName(), "Sarah");
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Joe");
		assertEquals(0, list.size());
	}

	public void testFindEmployeeBySalary_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(3000);
		assertEquals(list.get(0).getSalary(),3000);
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(4000);
		assertEquals(0, list.size());
	}
	
	protected void tearDown() throws Exception {
        Connection con = emp.createConnection();
        PreparedStatement pStmt = con.prepareStatement("delete from employee where id = ?");
        pStmt.setInt(1, 1);
        pStmt.executeUpdate();
        PreparedStatement pStmt2 = con.prepareStatement("delete from employee where id = ?");
        pStmt2.setInt(1, 2);
        pStmt2.executeUpdate();
        con.close();
    }
	
}
