/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testes;

import Classe.LoginScrenn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pichau
 */
public class LoginSreenTest {
    @Test
        public void testSuccesfullLogin(){
        LoginScrenn loginScreen = new LoginScrenn();
        assertTrue(loginScreen.login("john", "password123"));
        }
        
        @Test
        public void testFailedLogin(){
        LoginScrenn loginScreen = new LoginScrenn();
        assertFalse(loginScreen.login("john", "wrongpassword"));
        }
        
        @Test
        public void testAddLogin(){
        LoginScrenn loginScreen = new LoginScrenn();
        loginScreen.addUser("testuser","testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
        }
    
}