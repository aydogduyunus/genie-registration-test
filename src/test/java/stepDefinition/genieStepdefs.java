package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.geniePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class genieStepdefs {

    WebDriver driver;
    Actions action;
    geniePage page;

    public genieStepdefs() {
        this.driver = Driver.getDriver();
        this.action = new Actions(driver);
        this.page = new geniePage();
    }
    @Given("Kullanıcı Genie ana sayfasına gider")
    public void kullanıcıGenieAnaSayfasınaGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("genieUrl"));
        Thread.sleep(3000);
    }

    @And("Çıkan kurabiye bilgilendirme penceresini kabul eder")
    public void çıkanKurabiyeBilgilendirmePenceresiniKabulEder() {
        action.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        ReusableMethods.visibleWait(page.login,5);
    }

    @And("{string} butonunun görünür olduğunu doğrular")
    public void butonununGörünürOlduğunuDoğrular(String arg0) {

        Assert.assertTrue(page.login.isDisplayed());
    }

    @When("Kullanıcı {string} butonuna tıklar")
    public void kullanıcıButonunaTıklar(String arg0) {
        page.login.click();
        ReusableMethods.switchToWindow(1);
    }

    @Then("Kullanıcı {string} bağlantısının görünür olduğunu doğrular")
    public void kullanıcıBağlantısınınGörünürOlduğunuDoğrular(String arg0) {
        for (int i = 0; i < 10; i++) {
            action.sendKeys(Keys.TAB, Keys.ENTER).perform();
            ReusableMethods.bekle(3);
        }
        Assert.assertTrue(page.sign.isDisplayed());
    }

    @When("Kullanıcı {string} bağlantısına tıklar")
    public void kullanıcıBağlantısınaTıklar(String arg0) {
        action.click(page.sign).perform();
    }

    @Then("Kullanıcı kayıt formunun yüklendiğini ve {string} alanının görünür olduğunu doğrular")
    public void kullanıcıKayıtFormununYüklendiğiniVeAlanınınGörünürOlduğunuDoğrular(String arg0) {
        Assert.assertTrue(page.signUpGorunurMu.isDisplayed());
    }

    @And("Kullanıcı yeni sekmede fake mail sitesini açar")
    public void kullanıcıYeniSekmedeFakeMailSitesiniAçar() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMail"));
        ReusableMethods.bekle(3);
        ReusableMethods.switchToWindow(2);
    }

    @And("Geçici bir e-posta adresi alır")
    public void geçiciBirEPostaAdresiAlır() {
        action.click(page.fakeMailCopy).perform();
        action.doubleClick(page.fakeMailCopy).perform(); // tam algilamayabiliyor :)
    }

    @And("Genie sekmesine geri döner")
    public void genieSekmesineGeriDöner() {
        ReusableMethods.switchToWindow(1);
    }

    @And("E-posta alanına geçici adresi yazar")
    public void ePostaAlanınaGeçiciAdresiYazar() {
        page.workMail.click();
        action.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
        ReusableMethods.bekle(3);

    }


    @Given("Kullanıcı kayıt formunu doldurur")
    public void kullanıcıKayıtFormunuDoldurur() {
    }

    @And("CAPTCHA adımına gelir")
    public void captchaAdımınaGelir() {
    }
}
