import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePageActions;
import pages.LoginPageActions;

public class SampleTest extends BaseClass {

    @Test
    public void  enterEmailTest(){
        HomePageActions home_page = new HomePageActions();
        LoginPageActions login_page = new LoginPageActions();
        home_page.clickOnSignInButton();
        login_page.verifyLoginPage();
        login_page.enterEmailID();
    }

}
