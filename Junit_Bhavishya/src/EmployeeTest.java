import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.com.dao.MySqlImpl;
import src.com.models.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreate() throws SQLException, IOException {
		Employee e=new Clerk();
		MySqlImpl a=new MySqlImpl();
		a.initDB();
		int res=a.create(e);
		assertTrue(res>0);
		a.closeDB();
	}

	@Test
	void testUpdate() throws SQLException, IOException {
		Employee e=new Manager();
		MySqlImpl a=new MySqlImpl();
		a.initDB();
		int res=a.update(e);
		assertFalse(res>0);
		a.closeDB();
	}
	@Test
	void testdeleteByEmail() throws SQLException, IOException {
		//Employee e=new Clerk();
		MySqlImpl a=new MySqlImpl();
		a.initDB();
		int res=a.deleteByEmail("rr@gmail.com");
		assertFalse(res>0);
		a.closeDB();
	}
	@Test
	void test() throws SQLException, IOException {
		Employee e=new Programmer();
		//assertSame()
		assertNotNull(e);
	      
	
	}
	@Test
	void test2() throws SQLException, IOException {
		Employee e=new Clerk();
		//assertSame()
		assertNotNull(e);
	}
	@Test
	void test3() throws SQLException, IOException {
		Employee e=new Manager();
		//assertSame()
		assertNotNull(e);
	}
	@Test
	void testshowAllEmployees() throws SQLException, IOException {
		MySqlImpl a=new MySqlImpl();
		a.initDB();
		List<Employee> res=a.getAllEmployees();
		assertNotNull(res);
		a.closeDB();
	}
	@Test
	void testGetByEmail() throws SQLException, IOException
	{
		MySqlImpl a=new MySqlImpl();
		a.initDB();
		Employee res=a.getEmployeeByEmail("hema@gmail.com");
		assertNotNull(res);
		a.closeDB();
	}
    @Test
    void test4() 
    {
    	MySqlImpl a=new MySqlImpl();
    	HashMap<String, Employee> res=a.getEmployeeTable();
    	assertNotNull(res);
    }
	
   
}
