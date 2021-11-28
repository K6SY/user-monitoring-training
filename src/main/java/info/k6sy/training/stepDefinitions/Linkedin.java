package info.k6sy.training.stepDefinitions;

import info.k6sy.training.common.BrowserControl;
import info.k6sy.training.pom.Linkedin.HomePage;
import info.k6sy.training.pom.Linkedin.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linkedin {

    BrowserControl browser = new BrowserControl("chrome");

    HomePage home;
    LoginPage login;

    @Given(": user is on homePage")
    public void user_is_on_home_page() {
        browser.launchURL("https://www.linkedin.com/");
        browser.waitSomeTime(5000);
    }
    @When(": user is on loginPage")
    public void user_is_on_login_page() {
        home = new HomePage(this.browser);
        if (home.isPageLoaded())
            home.goToLoginPage();
        System.out.println("Erreur");
    }
    @When(": user enters credentiels")
    public void user_enters_credentiels() {
        String username = "sacalaphine@gmail.com";
        String password = "XXXXX";
        login = new LoginPage(this.browser);
        login.authentification(username,password);
    }
    @Then(": user is logged in")
    public void user_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
