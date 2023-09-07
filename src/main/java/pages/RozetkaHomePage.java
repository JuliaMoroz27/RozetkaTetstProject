package pages;

import com.sun.source.tree.Tree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RozetkaHomePage extends BasePage {

    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchString = By.xpath("//input[@name='search']");

    private final By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']");

    public RozetkaHomePage enterText() {
        driver.findElement(searchString).sendKeys("Ноутбук hp");

        return this;
    }

    public RozetkaHomePage clickToSearchButton() {
        driver.findElement(searchButton).click();

        return this;
    }

    List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

    public List<String> getPrices() {
        List<String> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText();
            prices.add(priceText);
            System.out.println(priceElement);
            return prices;
        }
        return prices;
    }

    public TreeSet<String> sortPrices() {
        TreeSet<String> sortedPrices = new TreeSet<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText();
            sortedPrices.add(priceText);
        }
        System.out.println("Sorted prices: ");
        for (String price : sortedPrices) {
            System.out.println(price);
        }
        return sortedPrices;
    }







//    public List<String> getAllItems() {
//     List<WebElement> priceLists = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));
//        for (int i = 0; i <= priceLists.size(); i++) {
//            priceLists.get(i);
//        }
//
//        for (WebElement list : priceLists) {
//            String priceText = list.getText();
//            System.out.println("Ціна: " + priceText);
//        }
//        return null;
//    }

}
