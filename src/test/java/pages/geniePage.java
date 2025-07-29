package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class geniePage {
    public geniePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//a[contains(@class, 'navbar_text-link') and contains(., 'Log In')]")
    public WebElement login;

    @FindBy(xpath = "//a[@href='/signup' and normalize-space(text())='Sign up']")
    public WebElement sign;

    @FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-9pcz29']")
    public WebElement signUpGorunurMu;

    @FindBy(xpath = "//a[@class='color cetc']")
    public WebElement fakeMailCopy;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
    public WebElement workMail;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement radioButon;

}
