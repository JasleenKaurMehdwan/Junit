/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A class to test the methods in our passwordValidator
 * @author dancye, 2018
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a good input of MyPassword123, which should
     * easily be long enough to be a good length.
     */
    @Test
    public void testCheckLength() {
        String pass = "MyPassword123";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
       
    }
    
}
