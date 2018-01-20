package testcase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import page.ReadProperties;
import task.Logincsdn_task;

public class test01Test {

	public static String username = ReadProperties.readProperties(
			"setting/login.properties", "username");
	public static String password = ReadProperties.readProperties(
			"setting/login.properties", "password");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Logincsdn_task.login(username, password);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}
	
	

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {

	}

}
