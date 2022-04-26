package testsuite;
/*Write down the following test into ‘TopMenuTest’ class
1. userShouldNavigateToComputerPageSuccessfully
        * click on the ‘Computers’ Tab
        * Verify the text ‘Computers’
        2. userShouldNavigateToElectronicsPageSuccessfully
        * click on the ‘Electronics’ Tab
        * Verify the text ‘Electronics’
        3. userShouldNavigateToApparelPageSuccessfully
        * click on the ‘Apparel’ Tab
        * Verify the text ‘Apparel’
        4.
        userShouldNavigateToDigitalDownloadsPageSuccessfully
        * click on the ‘Digital downloads’ Tab
        * Verify the text ‘Digital downloads’
        5. userShouldNavigateToBooksPageSuccessfully
        * click on the ‘Books’ Tab
        * Verify the text ‘Books’
        6. userShouldNavigateToJewelryPageSuccessfully
        * click on the ‘Jewelry’ Tab
        * Verify the text ‘Jewelry’
        7. userShouldNavigateToGiftCardsPageSuccessfully
        * click on the ‘Gift Cards’ Tab
        * Verify the text ‘Gift Cards’*/

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    //userShouldNavigateToComputerPageSuccessfully
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computer tab
        clickOnElement(By.linkText("Computers"));
        //verify  the text ‘Computers'
        verifyText("Computers","Computers","Can not verify Message : ");
        getTextFromElement(By.linkText("Computers"));
    }
    @Test
    // userShouldNavigateToElectronicsPageSuccessfully
    public void  userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        clickOnElement(By.linkText("Electronics"));
        //verify  the text ‘Electronics'
        verifyText("Electronics","Electronics","Can not verify Message : \"");
        getTextFromElement(By.linkText("Electronics"));
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));
        //verify  the text ‘Apparel'
        verifyText("Apparel","Apparel","Can not verify Message : ");
        getTextFromElement(By.linkText("Apparel"));
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully (){
        //click on the ‘Digital downloads’ Tab
        clickOnElement(By.linkText("Digital downloads"));
        //verify  the text ‘Digital downloads'
        verifyText("Digital downloads","Digital downloads","Can not verify Message :");
        getTextFromElement(By.linkText("Digital downloads"));
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the 'Books' Tab
        clickOnElement(By.linkText("Books"));
        //verify  the text ‘Books'
        verifyText("Books","Books","Can not Verify Message : ");
        getTextFromElement(By.linkText("Books"));
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the ‘Jewelry’ Tab
        clickOnElement(By.linkText("Jewelry"));
        //verify  the text ‘Jewelry'
        verifyText("Jewelry","Jewelry","Can not verify Message :");
        getTextFromElement(By.linkText("Jewelry"));
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // Find Gift Cards tab and click on Gift Cards tab
        clickOnElement(By.linkText("Gift Cards"));
        //verify  the text ‘ Gift Cards'
        verifyText("Gift Cards","Gift Cards","Can not Verify Message : ");
        getTextFromElement(By.linkText("Gift Cards"));
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
