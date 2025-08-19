package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nt.dao.ILoginDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginImpltService;

public class AppTest {
	private static ILoginDAO loginDAO;
	private static ILoginMgmtService loginService;

	@BeforeAll
	public static void setUpMockito() {
		loginDAO = Mockito.mock(ILoginDAO.class);
		System.out.println("Mock Object Class Name :: "+loginDAO.getClass());
		loginService = new LoginImpltService(loginDAO);
	}
	
	
	@Test
	public void testWithValidCredentials() {
		Mockito.when(loginDAO.authenticate("raja", "rani")).thenReturn(1);
		assertTrue(loginService.login("raja", "rani"));
	}
	
	@Test
	public void testWithInvalidCredentials() {
		Mockito.when(loginDAO.authenticate("raja", "kanha")).thenReturn(0);
		assertFalse(loginService.login("raja", "kanha"));
	}
	
	@Test
	public void testWithNullCredentials() {
		assertThrows(IllegalArgumentException.class, ()-> loginService.login("", ""));
	}
	
	@Test
	public void spy_mock_stub() {
	    // Creating a mock object
	    ArrayList<String> listMock = Mockito.mock(ArrayList.class);

	    // Creating a spy object (must spy on a real instance, not class)
	    ArrayList<String> listSpy = Mockito.spy(new ArrayList<>());

	    // Stubbing on mock
	    //Mockito.when(listMock.size()).thenReturn(10);  //Stub object (mock)

	    // Stubbing on spy (use doReturn to avoid real method call)
	    //Mockito.doReturn(10).when(listSpy).size();  //Stub object (spy)

	    // If we add to mock, it won't really store anything
	    listMock.add("mockValue");

	    // If we add to spy, it will really store (but size is overridden by stub)
	    listSpy.add("spyValue");

	    // Print results
	    System.out.println("Mock Size :: " + listMock.size() + "  -------  " + "Spy Size :: " + listSpy.size());

	    /*
	     * Note----
	     * Mock Size :: 0  -------  Spy Size :: 1
	        	- if Mockito.when(...) statements are not commented

	     * Mock Size :: 10  -------  Spy Size :: 10   	
				- if Mockito.when(...) statements are commented
	     */
	    
	    // Verifications
	    Mockito.verify(listMock).add("mockValue"); // called but no effect
	    Mockito.verify(listSpy).add("spyValue");   // real add executed
	}

	
	@Test
	public void testAddUserSpy() {
		ILoginDAO iLoginDAO = Mockito.spy(ILoginDAO.class);
		LoginImpltService impltService = new LoginImpltService(iLoginDAO);
		impltService.addUser("raja", "rani");
		impltService.addUser("kanha", "hyd");
		impltService.addUser("raj", "");
		impltService.addUser("", "");
		
		Mockito.verify(iLoginDAO, Mockito.times(1)).addNewUser("raja", "rani"); // it showing that that how many time's it call (method)
		Mockito.verify(iLoginDAO, Mockito.times(1)).addNewUser("kanha", "hyd");
		Mockito.verify(iLoginDAO, Mockito.times(0)).addNewUser("raj", "");
		Mockito.verify(iLoginDAO, Mockito.never()).addNewUser("", "");
	}
	
	@AfterAll
	public static void endMockito() {
		loginDAO = null;
		loginService = null;
	}
}
