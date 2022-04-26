package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/*Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully
        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign
        In!’
        2. userShouldLoginSuccessfullyWithValidCredentials
        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display
        3. verifyTheErrorMessage
        * click on the ‘Login’ link
        * Enter invalid username
        * Enter invalid password
        * Click on Login button
        * Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/
public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //find the login link click on login link
        clickOnElement(By.linkText("Log in"));
        //Verify the text ‘Welcome, Please Sign In!’
        verifyText("Welcome, Please Sign In!","Welcome, Please Sign In!","Not navigate to login page");
        getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));
        // Enter Email address
        sendTextToElement(By.id("Email"),"prime777@gmail.com");
        // Enter Password
        sendTextToElement(By.name("Password"),"patel1234");
        // Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //  Verify the ‘Log out’ text is display
        verifyText("Log out","Log out","Can not verify Message");
        getTextFromElement(By.className("ico-logout"));
    }
    @Test
    public void verifyTheErrorMessage(){
        //click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));
        // Enter Email address
        sendTextToElement(By.id("Email"),"prime133@gmail.com");
        // Enter Password
        sendTextToElement(By.name("Password"),"patel123");
        //Click on Login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
       //Verify the error message ‘Login was unsuccessful.
      // Please correct the errors and try again. No customer account found’
        String expectedErrorMessage  = "Login was unsuccessful. Please correct the errors and try again.\n"
                +"No customer account found";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']\n"));
        Assert.assertEquals("Error message not display", expectedErrorMessage,actualErrorMessage);
//        verifyText("Login was unsuccessful. Please correct the errors and try again.\\n\"\n" +
//                "                +\"No customer account found","Login was unsuccessful. Please correct the errors and try again.\\n\"\n" +
//                "                +\"No customer account found","Error message not display");
//        getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']\n"));
    }
    @After
    public void tearDown(){

        closeBrowser();
    }

}
