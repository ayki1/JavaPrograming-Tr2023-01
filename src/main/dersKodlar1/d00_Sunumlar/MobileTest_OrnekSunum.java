package d00_Sunumlar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MobileTest_OrnekSunum {
/*
  ETSY.COM ALIŞVERİŞ SİTESİ MOBİL UYGULAMASININ TESTİDİR.

  Etsy APK Test Senaryosu (Test Steps)
-------------------------
* Appium Server başlatılır
* Etsy.com uygulaması (APK) açılır
* Mevcut Google mail hesabı ile girişi yapılır
* Bir ürün ismi aratılır. (örnek=Wooden Spoon)
* Arama sonucunda ilk ürün seçilir
* Ekran yukarı kaydırma yapılır ve ürünün detayları gösterilir
* Ürün sepete eklenir
* Sepet görüntülenir
* Ekran resmi çekilir.
 */

    public AppiumDriver driver;
        public WebDriverWait wait;
        String searchProductName=" wooden spoon cutlery 5";
        @Before
        public void setUp() throws InterruptedException {
            try {
                DesiredCapabilities capabilities =new DesiredCapabilities();
                capabilities.setCapability("deviceName", "Pixel 3");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("udid","emulator-5554");
                capabilities.setCapability("platformVersion", "10");
                capabilities.setCapability("appPackage", "com.etsy.android");
                capabilities.setCapability("appActivity",
                        "com.etsy.android.ui.homescreen.HomescreenTabsActivity");
                //capabilities.setCapability("appActivity", "com.etsy.android.ui.user.auth.SignInActivity");
                capabilities.setCapability("skipUnlock","true");
                capabilities.setCapability("noReset","false");
                //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

                driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
                //wait=new WebDriverWait(driver,5);

            }
            catch (MalformedURLException urlException){
                System.out.println("HATALI URL...");
            }
            Thread.sleep(2000);
        }
        @Test
        public void etsyTest() throws InterruptedException, IOException {

            //EKRANI YUKARI KAYDIR
            TouchAction yukariKaydir2=new TouchAction<>(driver)
                    .press(PointOption.point(573,983))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(573,414))
                    .release().perform();
            Thread.sleep(2000);

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            //CONTINUE GOOGLE BOTUN TIKLA
            driver.findElement(By.id("com.etsy.android:id/btn_sign_in_google")).click();
            Thread.sleep(4000);

            //MEVCUT GOOGLE HESABINI SEÇ
            WebElement googleHesabiSec = driver.findElement(By.
                    className("android.widget.LinearLayout"));
            googleHesabiSec.click();
            //driver.getKeyboard().pressKey(passWord);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Thread.sleep(3000);

            //ÜRÜN ARAMASI YAP= "Wooden spoon"
            WebElement searchBox = driver.findElement(By.className("android.widget.EditText"));
            searchBox.click();
            Thread.sleep(2000);

            driver.getKeyboard().pressKey(searchProductName);
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Thread.sleep(7000);

            //İLK ÜRÜNÜN RESMİ TIKLA
            driver.findElement(By.id("com.etsy.android:id/listing_title")).click();
            Thread.sleep(5000);

            //ÜRÜNÜ ADINI VE FİYATINI YAZDIR
            WebElement urununAdi = driver.findElementById("com.etsy.android:id/listing_title");
            System.out.println("Product Name = " + urununAdi.getText());
            //WebElement urununFiyati = driver.findElementById("com.etsy.android:id/text_price");
            //System.out.println("Ürün Fiyati= " + urununFiyati.getText());

            //ÜRÜN SEÇİMİ İÇİN EKRANI YUKARI KAYDIR
            TouchAction yukariKaydir1=new TouchAction<>(driver)
                    .press(PointOption.point(511,1694))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(561,801))
                    .release().perform();
            Thread.sleep(2000);

            TouchAction yukariKaydir3=new TouchAction<>(driver)
                    .press(PointOption.point(511,1694))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(561,801))
                    .release().perform();
            Thread.sleep(2000);

            //ÜRÜN SEPETE EKLE
            WebElement sepeteEkle = driver.findElementByXPath
                    ("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.TextSwitcher/android.widget.TextView");
            sepeteEkle.click();

            //SEPETE GİT
            MobileElement sepeteBtnTikla = (MobileElement) driver.
                    findElement(By.id("com.etsy.android:id/menu_bottom_nav_cart"));
            sepeteBtnTikla.click();
            Thread.sleep(5000);

        }
        @After
        public void tearDown() throws IOException {
        // SON EKRANIN RESMİNİ AL
            File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("LastScreenPict.jpg"));

            System.out.println("TEST FINISHED...");
        }

}

