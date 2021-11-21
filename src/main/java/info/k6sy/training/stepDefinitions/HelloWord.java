package info.k6sy.training.stepDefinitions;

import info.k6sy.training.common.BrowserControl;
import info.k6sy.training.pom.HelloWord.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloWord {

    BrowserControl browser = new BrowserControl();

    @Given("Open the Chrome and launch the application")
    public void open_the_chrome_and_launch_the_application() {
        browser.launchURL("https://google.com");
        browser.waitSomeTime(5000);
    }
    @When("Check the homePage")
    public void check_the_home_page() {
        HomePage home = new HomePage(this.browser);
        home.clickOnLogo();
        home.makeSearch();
        browser.waitSomeTime(5000);
    }
    @Then("Seen the logo")
    public void seen_the_logo() {
        // Write code here that turns the phrase above into concrete actions
        browser.closeBrowser();
    }
}
