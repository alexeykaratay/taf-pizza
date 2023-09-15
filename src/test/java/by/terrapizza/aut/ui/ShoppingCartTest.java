package by.terrapizza.aut.ui;

import by.terrapizza.aut.po.ShoppingCartPage;
import by.terrapizza.aut.steps.CaseStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest extends BaseTest{
    @DisplayName("Pizza Margherita and juice 'Rich' Pineapple is on order.")
    @Test
    public void testPizzaInShoppingCart(){
        CaseStep caseStep = new CaseStep();
        caseStep.selectPizzaAndSelectDrinkAndViewCart();
        ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
        Assertions.assertEquals(shoppingCartPage.getExtendResult(),shoppingCartPage.getActualResult());
    }
}
