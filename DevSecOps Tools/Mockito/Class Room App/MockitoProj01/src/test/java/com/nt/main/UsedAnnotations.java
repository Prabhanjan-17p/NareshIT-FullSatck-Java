package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nt.dao.ILoginDAO;
import com.nt.service.LoginImpltService;

public class UsedAnnotations {

    @Mock
    private ILoginDAO loginDAO;

    @InjectMocks
    private LoginImpltService loginService;  // concrete class, not interface

    @Mock
    private ArrayList<String> listMock;

    @Spy
    private ArrayList<String> listSpy;

    private AutoCloseable closeable; // to close mocks after test

    @BeforeEach
    public void setUpMockito() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        closeable.close();
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
        assertThrows(IllegalArgumentException.class, () -> loginService.login("", ""));
    }

    @Test
    public void spy_mock_stub() {
        // mock won’t store
        listMock.add("mockValue");
        // spy will store
        listSpy.add("spyValue");

        System.out.println("Mock Size :: " + listMock.size() + "  -------  " + "Spy Size :: " + listSpy.size());

        Mockito.verify(listMock).add("mockValue");
        Mockito.verify(listSpy).add("spyValue");
    }

    @Test
    public void testAddUserSpy() {
        ILoginDAO iLoginDAO = Mockito.mock(ILoginDAO.class); // better than spying interface
        LoginImpltService impltService = new LoginImpltService(iLoginDAO);

        impltService.addUser("raja", "rani");
        impltService.addUser("kanha", "hyd");
        impltService.addUser("raj", "");
        impltService.addUser("", "");

        Mockito.verify(iLoginDAO, Mockito.times(1)).addNewUser("raja", "rani");
        Mockito.verify(iLoginDAO, Mockito.times(1)).addNewUser("kanha", "hyd");
        Mockito.verify(iLoginDAO, Mockito.never()).addNewUser("raj", "");
        Mockito.verify(iLoginDAO, Mockito.never()).addNewUser("", "");
    }
}
