package d02_MerhabaDunya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTest_OrnekSunum {
    public static void main(String[] args) throws InterruptedException {

    //*** AMAZON WEB SİTESİNDE ÜRÜN FİYATINI AL ****
        String aranacakUrunAdi="iphone 13 512 gb";

    //CHROME TARAYICI AYARLAMA
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

    //AMAZON WEB SİTESİNİ AÇ
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(3000);

    //ÇEREZLERİ KABUL ET BUTONU TIKLA-VARSA

        WebElement cerezKabuletButon= driver.findElement(By.id("sp-cc-accept"));
        if (cerezKabuletButon.isDisplayed()) {
            cerezKabuletButon.click();
        }else{
            System.out.println(" Cerez Buton Çıkmadı.. ");
        }
        Thread.sleep(2000);

    //ÜRÜNÜ ADINI YAZ VE ARAMA YAP
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(aranacakUrunAdi);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);

    //ÜRÜNLERİN FİYATLARINI YAZDIR
        WebElement fiyatListesi=driver.findElement(By.className("a-price-whole"));
        for (int i = 0; i < 50; i++) {
            i++;
            //System.out.println("fiyatListesi = " + fiyatListesi.getSize());
            //System.out.println("fiyatListesi = " + fiyatListesi.getText());
        }

        WebElement[] fiyatListesi2=new WebElement[100];
          driver.findElements(By.xpath("a-price-whole"));
        for (int i = 0; i < fiyatListesi2.length; i++) {
            i++;
            System.out.println("allDates = " + fiyatListesi2[i]);
        }

    /*//ARAMA SONUCU İLK ÜRÜNÜ TIKLA

        WebElement ilkUrun=driver.findElement(By.className("a-price-whole"));
        ilkUrun.click();

   //ÜRÜNÜN ADINI VE FİYATINI YAZDIR
        WebElement urunAdi=driver.findElement(By.id("productTitle"));
        WebElement urunFiyati=driver.findElement(By.className("a-price-whole"));
        WebElement kurusFiyati= driver.findElement(By.className("a-price-fraction"));

        System.out.println("ÜRÜN ADI = " + urunAdi.getText());
        System.out.println("ÜRÜN FİYATI = " + urunFiyati.getText()+","+kurusFiyati.getText()+" TL");
        Thread.sleep(3000);

*/
   //SAYFAYI KAPAT
        driver.quit();

    }
}
