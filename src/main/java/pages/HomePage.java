package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverManager;

import java.sql.Driver;

public class HomePage {

    private static String userName = "div[dir=ltr]";

    public static String getUserName(){
        WebElement nameArea = WebDriverManager.driver.findElement(By.cssSelector(userName));
        String name = nameArea.getText();
        return name;
    }
}
