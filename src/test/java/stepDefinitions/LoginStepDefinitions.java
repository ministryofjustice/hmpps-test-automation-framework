package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import pages.commonPage;

/**
 * Created by Anusha Nagula on 15/05/23.
 */
public class LoginStepDefinitions extends LoginPage {
    pages.commonPage commonPage = new commonPage();

    @Given("I navigate to DPS service")
    public void i_navigate_to_dps_service() {

        commonPage.loginVSIPService();
    }

    @Given("I enter {string}")
    public void i_enter(String uName) {

        enterUserName(uName);
    }

    @Given("I enter the {string}")
    public void i_enter_the(String password) {

        enterPassword(password);
    }
}