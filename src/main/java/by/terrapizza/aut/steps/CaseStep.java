package by.terrapizza.aut.steps;

import by.terrapizza.aut.po.BarPage;
import by.terrapizza.aut.po.HomePage;
import by.terrapizza.aut.po.PizzaPage;
import by.terrapizza.aut.po.ShoppingCartPage;
import by.terrapizza.aut.singleton.Singleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class CaseStep {
    private WebDriver driver;
    JavascriptExecutor js;

    public CaseStep() {
        this.driver = Singleton.getDriver();
        js = (JavascriptExecutor) driver;
    }

    public void selectPizzaAndSelectDrinkAndViewCart() {
        HomePage homePage = new HomePage();
        homePage.pizzaButtonClick();
        PizzaPage pizzaPage = new PizzaPage();
        pizzaPage.pizzaInShoppingCartClick();
        homePage.barButtonClick();
        BarPage barPage = new BarPage();
        barPage.juicePineappleInShoppingCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.shoppingCartClick();
    }
}
