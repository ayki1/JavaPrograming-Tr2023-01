package d02_MerhabaDunya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest_OrnekSunum {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

    //AMAZON WEB SİTESİNDE ÜRÜN FİYATI AL
        String aranacakUrunAdi="iphone 13 512 gb";

    //AMAZON WEB SİTESİNİ AÇ
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(3000);

    //ÇEREZLERİ KABUL ET
        driver.findElement(By.id("sp-cc-accept")).click();
        Thread.sleep(2000);

    //ÜRÜNÜ ADINI YAZ VE ARAMA YAP
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(aranacakUrunAdi);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);

    //ARAMA SONUCU İLK ÜRÜNÜ TIKLA

        WebElement ilkUrun=driver.findElement(By.className("a-price-whole"));
        ilkUrun.click();

   //ÜRÜNÜN ADINI VE FİYATINI YAZDIR
        WebElement urunAdi=driver.findElement(By.id("productTitle"));
        WebElement urunFiyati=driver.findElement(By.className("a-price-whole"));
        WebElement kurusFiyati= driver.findElement(By.className("a-price-fraction"));

        System.out.println("ÜRÜN ADI = " + urunAdi.getText());
        System.out.println("ÜRÜN FİYATI = " + urunFiyati.getText()+","+kurusFiyati.getText()+" TL");
        Thread.sleep(3000);


   //SAYFAYI KAPAT
        driver.quit();

    }
}
