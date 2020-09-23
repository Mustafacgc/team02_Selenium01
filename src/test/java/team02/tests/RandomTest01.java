package team02.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import team02.utilities.TestBaseTeam02;

public class RandomTest01 extends TestBaseTeam02 {

    @Test
    public void sahibinden() throws InterruptedException{
        driver.get("http://sahibinen.com");
        driver.findElement(By.partialLinkText("Hayvanlar Alemi")).click();
        driver.findElement(By.partialLinkText("Evcil Hayvanlar")).click();
        driver.findElement(By.partialLinkText("Kedi")).click();
        WebElement kediSonuc = driver.findElement(By.xpath("//div[@class='result-text']"));
        System.out.println(kediSonuc.getText());
    }


}
