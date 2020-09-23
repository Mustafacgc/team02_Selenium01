package team02.smokeTests;

import org.testng.annotations.Test;
import team02.pages.EbayPage;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;

public class EbaySmokeTest {

    @Test
    public void test01 (){
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));
        EbayPage ebayPage = new EbayPage();
        ebayPage.ebayAramaKutusu.sendKeys(ConfigurationReader.getProperty("ebayText"));


    }
}
