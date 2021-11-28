package info.k6sy.training.common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserControl {


    private WebDriver driver;
    private  String driverType_chrome="webdriver.chrome.driver";
    private  String driverPath_chrome="/Users/sy028637/selenium/chromedriver";

    private  String driverType_firefox="webdriver.gecko.driver";
    private  String driverPath_firefox="/Users/sy028637/selenium/chromedriver";



    public BrowserControl(String navigateur)
    {
        if (navigateur == "chrome")
        {
            System.setProperty(this.driverType_chrome, this.driverPath_chrome);
            this.driver = new ChromeDriver();
        }
        else if (navigateur == "firefox")
        {
            System.setProperty(this.driverType_firefox, this.driverPath_firefox);
            this.driver = new FirefoxDriver();
        }
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

    /**
     * Cette méthode permet de retourner un élémet identifié par son ID
     * @param id_name
     * @return
     */
    public WebElement getElementByID(String id_name)
    {
       WebElement element = null;
        try {
            element=this.driver.findElement(By.id(id_name));
        }
        catch(NoSuchElementException e)
        {
            System.out.println("L'attribut id '"+id_name+"' n'a pas pu être retouvé.");
            System.out.println("Message obtenu: "+e.getMessage());
        }
        return element;
    }

    /**
     * Cette méthode permet de retourner un élémet identifié par son classname
     * @param classe_name
     * @return
     */
    public WebElement getElementByClassName(String classe_name)
    {
        WebElement element = null;
        try {
            element=this.driver.findElement(By.className(classe_name));
        }
        catch(NoSuchElementException e)
        {
            System.out.println("L'attribut class '"+classe_name+"' n'a pas pu être retouvé.");
            System.out.println("Message obtenu: "+e.getMessage());
        }
        return element;
    }

    /**
     * Cette méthode permet de retourner un élémet identifié par son xpath
     * @param xpath
     * @return
     */
    public WebElement getElementByXpath(String xpath)
    {
        WebElement element = null;
        try {
            element=this.driver.findElement(By.xpath(xpath));
        }
        catch(NoSuchElementException e)
        {
            System.out.println("L'élément au xpath '"+xpath+"' n'a pas pu être retouvé.");
            System.out.println("Message obtenu: "+e.getMessage());
        }
        return element;
    }






    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }



}
