/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Testing;

import ProgPOE10047466.Login;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ST10047466
 */
public class LoginTest
{
    
    public LoginTest()
    {
    }

    @Test
    public void testcheckPassword()
    {
        Login instance = new Login();
        boolean result, expResult;
        String str;
        //-------------------------------------------------
        System.out.println("checkPassword - Ch&&sec@ke99!");
        str = "Ch&&sec@ke99!";
        expResult = true;
        result = instance.checkPassword(str);
        assertEquals(expResult, result);
        //-------------------------------------------------
        System.out.println("checkPassword - password");
        str = "password";
        expResult = false;
        result = instance.checkPassword(str);
        assertEquals(expResult, result);
    }

    @Test
    public void testcheckusrName()
    {
        Login instance = new Login();
        boolean result, expResult;
        String str;
        //-------------------------------------------------
        System.out.println("checkusrName - kyl_1");
        str = "kyl_1";
        expResult = true;
        result = instance.checkusrName(str);
        assertEquals(expResult, result);
        //-------------------------------------------------
        System.out.println("checkusrName - kyle!!!!!!!");
        str = "kyle!!!!!!!";
        expResult = false;
        result = instance.checkusrName(str);
        assertEquals(expResult, result);
    }
    
}
