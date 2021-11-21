package info.k6sy.training.pom.HelloWord;

import info.k6sy.training.common.BrowserControl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private BrowserControl browser;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/img")
    private WebElement logo;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchForm;


    public HomePage(BrowserControl browser)
    {
        this.browser= browser;
        PageFactory.initElements(browser.getDriver(), this);
    }

    public void clickOnLogo()
    {
        logo.click();
    }

    public void makeSearch()
    {
        searchForm.clear();
        searchForm.sendKeys("MMA factory");
        searchForm.sendKeys(Keys.ENTER);
    }


}
