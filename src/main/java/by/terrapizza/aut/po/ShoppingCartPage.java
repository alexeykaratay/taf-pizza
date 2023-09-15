package by.terrapizza.aut.po;

import by.terrapizza.aut.singleton.Singleton;
import by.terrapizza.aut.util.Waiters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage {
    private WebDriver driver;
    JavascriptExecutor js;
    private final int PIZZA_ITEM = 0;
    private final int JUICE_ITEM = 1;
    private final int PIZZA_ITEM_LENGTH = 15;
    private final int JUICE_ITEM_LENGTH = 17;

    @FindBy(xpath = "//li[contains(@id,'basket-el-')]")
    List<WebElement> basketElements;
    @FindBy(xpath = "//div[contains(@class,'basket__btn-top basket__top basket__btn-top--sm')]")
    WebElement shoppingCartButton;

    public ShoppingCartPage() {
        this.driver = Singleton.getDriver();
        js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    public String getBasketElementText(int index, int beginSubstring, int endSubstring) {
        Waiters.waitFor(1);
        return basketElements.get(index).getText().substring(beginSubstring, endSubstring);
    }

    public void shoppingCartClick() {
        js.executeScript("arguments[0].click();", shoppingCartButton);
    }

    public List<String> getExtendResult() {
        List<String> extendResults = new ArrayList<>();
        extendResults.add("Пицца Маргарита");
        extendResults.add("Сок \"Rich\" ананас");
        return extendResults;
    }

    public List<String> getActualResult() {

        List<String> actualResult = new ArrayList<>();
        actualResult.add(getPizzaItemText());
        actualResult.add(getJuiceItemText());
        return actualResult;
    }

    private String getPizzaItemText() {
        return (getBasketElementText(PIZZA_ITEM, 0, PIZZA_ITEM_LENGTH));
    }

    private String getJuiceItemText() {
        return getBasketElementText(JUICE_ITEM, 0, JUICE_ITEM_LENGTH);
    }
}
