package info.k6sy.training.pom.Linkedin;

import info.k6sy.training.common.BrowserControl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private BrowserControl browser;

    //Déclaration des éléments avec lesquels on souhaiterait interagir sur la page. Attention l'élement doit être visible au chargement de la page
    @FindBy(xpath = "/html/body/nav/a/icon")
    private WebElement logo;

    @FindBy(xpath = "/html/body/nav/div/a[2]")
    private WebElement identification_button;

    /**
     * Constructeur du Homepage
     * @param browser
     */
    public HomePage(BrowserControl browser)
    {
        this.browser= browser;
        //La ligne suivate permet de récuperer automatiquemet tous les éléments avec l'annotation @FindBy
        PageFactory.initElements(browser.getDriver(), this);
    }

    /**
     * Cette fonction permet de vérifier l'alarme de la page
     * @return
     */
    public boolean isPageLoaded()
    {
        return logo.isDisplayed();
    }

    public void goToLoginPage()
    {
        identification_button.click();
    }

}
