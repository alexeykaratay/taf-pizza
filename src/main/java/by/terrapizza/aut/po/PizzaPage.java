package by.terrapizza.aut.po;

import by.terrapizza.aut.singleton.Singleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzaPage {
    private WebDriver driver;
    JavascriptExecutor js;
    @FindBy(xpath = "//button[@data-id='364']")
    private WebElement pizzaInShoppingCartButton;


    public PizzaPage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public void pizzaInShoppingCartClick() {
        js.executeScript("arguments[0].click();", pizzaInShoppingCartButton);
    }
}
