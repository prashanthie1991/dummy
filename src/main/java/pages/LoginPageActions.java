package pages;

import org.testng.Assert;
import pageObjects.LoginpageOR;
import utils.FetchElements;

public class LoginPageActions {
    FetchElements fe=new FetchElements();
    public void verifyLoginPage(){
        Assert.assertTrue(fe.getListWebElements("XPATH", LoginpageOR.sign_in_display_text).size()>0,"Login Page not Opened.");
    }
    public void enterEmailID(){
        fe.getWebElement("ID", LoginpageOR.email_textbox).sendKeys("xxx@xxxx.xxx");
    }
}
