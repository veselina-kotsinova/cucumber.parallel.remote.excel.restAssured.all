package pages;

import glue.steps.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Contacts {
    Browser browser = new Browser();
Assertion verify = new Assertion();

    public void clickContact (){
        WebElement contactBtn = browser.driver().findElement(By.cssSelector("#menu-item-2868 > a"));
        contactBtn.click();
    }

    public void verifyTitle (){
        WebElement title = browser.driver().findElement(By.id("page-title"));
        verify.assertTrue(title.isDisplayed());
        System.out.println(title.getText());
    }
}
