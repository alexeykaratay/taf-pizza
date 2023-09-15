package by.terrapizza.aut.po;

import by.terrapizza.aut.singleton.Singleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private JavascriptExecutor js;
    @FindBy(xpath = "//li[@class='menu-navigation__item']/./a[@href='/catalog/bar']")
    private WebElement barButton;

    @FindBy(xpath = "//li[@class='menu-navigation__item']/./a[@href='/catalog/picca']")
    private WebElement pizzaButton;

    public HomePage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public void openHomePage(){
        driver.get("https://terrapizza.by/");
    }

    public void pizzaButtonClick() {
        js.executeScript("arguments[0].click();", pizzaButton);
    }

    public void barButtonClick() {
        js.executeScript("arguments[0].click();", barButton);
    }
}
