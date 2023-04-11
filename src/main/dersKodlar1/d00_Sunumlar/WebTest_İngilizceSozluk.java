package d00_Sunumlar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest_İngilizceSozluk {
    public static void main(String[] args) throws InterruptedException {

        //*** GOOGLE CEVİRİ DE KELİME ÇEVİR ****
        String ingilizceKelime="contain";   //CEVİRİLECEK KELİMEYİ YAZINIZ
        String ingilizceKelime2="pool";

        //CHROME TARAYICI AYARLAMA
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //GOOGLE CEVİRİ SİTESİNİ AÇ
        driver.get("https://www.google.com/search?q=%C3%A7eviri&rlz=1C1OKWM_enTR1043TR1043&oq=%C3%A7evir&aqs=chrome.0.69i59j69i57j0i10i433i512l2j0i10i131i433i512j0i10i433i512l2j0i10i131i433i512l3.2481j0j7&sourceid=chrome&ie=UTF-8&pccc=1");
        Thread.sleep(1000);

        //KELİMEYİ İNGİLİZCE KUTUCUĞA YAZ
        WebElement ingilizceKutucuk= driver.findElement(By.xpath("//textarea[@id='tw-source-text-ta']"));
        ingilizceKutucuk.sendKeys(ingilizceKelime);
        Thread.sleep(2000);

        //1. KELİMENİN İNG-TÜRKÇE KARŞIĞINI YAZDIR
        WebElement kelimeninTRKarsiligi=driver.findElement(By.xpath("//pre[@id='tw-target-text']"));
        System.out.println("IngilizceKelime= " + ingilizceKelime);
        System.out.println("TRKarsiligi= " + kelimeninTRKarsiligi.getText());

        // 2.KELİME ARA VE SONUCU YAZDIR
        ingilizceKutucuk.clear();   //İNG. KUTUCUK TEMİZLENİR
        Thread.sleep(1000);
        ingilizceKutucuk.sendKeys(ingilizceKelime2);
        Thread.sleep(2000);
        System.out.println("ingilizceKelime2 = " + ingilizceKelime2);
        System.out.println("2.kelime Karsiligi = " + kelimeninTRKarsiligi.getText());

        //SAYFAYI KAPAT
        //driver.quit();

    }
}
