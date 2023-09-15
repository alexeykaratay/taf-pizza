package by.terrapizza.aut.ui;

import by.terrapizza.aut.po.HomePage;
import by.terrapizza.aut.singleton.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void driverSetup(){
        HomePage homePage = new HomePage();
        homePage.openHomePage();
    }

    @AfterEach
    public void driverClose(){
        Singleton.quitDriver();
    }
}
