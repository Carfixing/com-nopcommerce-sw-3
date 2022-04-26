package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/* Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
        * click on the ‘Register’ link
        * Verify the text ‘Register’
        2. userSholdRegisterAccountSuccessfully
        * click on the ‘Register’ link
        * Select gender radio button
        * Enter First name
        * Enter Last name
        * Select Day Month and Year
        * Enter Email address
        * Enter Password
        * Enter Confirm password
        * Click on REGISTER button
        * Verify the text 'Your registration completed*/
    public class RegisterTest extends Utility {
       String baseUrl = "https://demo.nopcommerce.com/";
       //for open the browser
    @Before
      public void setup(){

        openBrowser(baseUrl);
    }
    @Test
         //click on the ‘Register’ link
    public void userShouldNavigateToRegisterPageSuccessfully(){
        clickOnElement(By.linkText("Register"));
        //Verify the text ‘Register’
        verifyText("Register","Register","Not navigate to login page");
        getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        //Select gender radio button
        clickOnElement(By.cssSelector("input#gender-female"));
        //Enter First name
        sendTextToElement(By.id("FirstName"),"Mira");
        // Enter Last name
        sendTextToElement(By.id("LastName"),"Patel");
        //for day
        sendTextToElement(By.name("DateOfBirthDay"),"16");
        //for Month
        sendTextToElement(By.name("DateOfBirthMonth"),"december");
        //for year
        sendTextToElement(By.name("DateOfBirthYear"),"1992");
        // Enter Email address
        sendTextToElement(By.id("Email"),"prime777@gmail.com");
        //Enter Password
        sendTextToElement(By.name("Password"),"patel1234");
        //Enter confirm Password
        sendTextToElement(By.name("ConfirmPassword"),"patel1234");
        //Click on REGISTER button
        clickOnElement(By.name("register-button"));
        //Verify the text 'Your registration completed
        verifyText("Your registration completed","Your registration completed","Can not verify Message : ");
        getTextFromElement(By.xpath("//div[@class='result']"));
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
