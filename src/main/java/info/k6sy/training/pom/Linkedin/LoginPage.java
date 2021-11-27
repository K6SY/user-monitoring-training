package info.k6sy.training.pom.Linkedin;

import info.k6sy.training.common.BrowserControl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private BrowserControl browser;

    @FindBy(id = "session_key")
    private WebElement user_field;

    @FindBy(id= "session_password")
    private WebElement password_field;

    @FindBy(xpath = "//*[@id=\"organic-div\"]/form/div[3]/button")
    private WebElement submit_button;


    public LoginPage(BrowserControl browser)
    {
        this.browser= browser;
        //La ligne suivate permet de récuperer automatiquemet tous les éléments avec l'annotation @FindBy
        PageFactory.initElements(browser.getDriver(), this);
    }

    /**
     * Cette méthode permet de s'uthentifier sur la plateforme Linkedin
     * @param username
     * @param password
     */
    public void  authentification(String username, String password){
        user_field.clear();
        user_field.sendKeys(username);
        this.browser.waitSomeTime(2000);
        password_field.clear();
        password_field.sendKeys(password);
        this.browser.waitSomeTime(2000);
        submit_button.click();

    }


}
