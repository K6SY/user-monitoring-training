package info.k6sy.training.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControl {


    private WebDriver driver;
    private  String driverType="webdriver.chrome.driver";
    private  String driverPath="/Users/sy028637/selenium/chromedriver";



    public BrowserControl()
    {
        System.setProperty(this.driverType, this.driverPath);
        this.driver = new ChromeDriver();
    }


    /**
     * Cette méthode permet d'accéder à une application à partir de l'url fourni en paramètre. Elle maximise également la
     * vue du naviateur
     * @param appUrl url de l'application
     */
    public void launchURL(String appUrl)
    {
        this.driver.get(appUrl);
        this.driver.manage().window().maximize();
    }

    /**
     * Cette métode permet de fermer le navigateur de test. Elle est souvent utilisée à la fin des tests.
     */
    public void closeBrowser()
    {
        this.driver.close();
    }

    /**
     * Cette méthode permet de faire une pause de X millisecondes.
     * @param time le nombre de millisecondes d'attente
     */
    public void waitSomeTime(long time)
    {
        try {
            System.out.println("|==> En attente de "+time+" millisecondes ...");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }



}
