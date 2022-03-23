package pages;

import pageObjects.HomePageOR;
import utils.FetchElements;

public class HomePageActions {
    public void clickOnSignInButton(){
        FetchElements fe=new FetchElements();
        fe.getWebElement("XPATH", HomePageOR.signin_button_xpath).click();

    }
}
