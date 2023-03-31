package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

// POM : Page Object Model
public class DialogContent extends Parent{
   // kullanıcı ile dialogla veri alan bölümler

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='customer.firstName']")
    public WebElement firstname;
    @FindBy(id = "customer.lastName")
    public WebElement lastname;
    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(xpath = "//*[@id='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//*[@id='customer.address.zipCode']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id='customer.phoneNumber']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='customer.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//*[@id='customer.username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='repeatedPassword']")
    public WebElement repeatedPassword;

    @FindBy(xpath = "//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input")
    public WebElement confirm;

    @FindBy(xpath = "//*[@id='rightPanel']/p")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@id='loginPanel']/form/div[1]/input")
    public WebElement id;

    @FindBy(xpath = "//*[@id='loginPanel']/form/div[2]/input")
    public WebElement pass;

    @FindBy(xpath = "//*[@id='loginPanel']/form/div[3]/input")
    public WebElement login;

    @FindBy(xpath = "//*[@id='rightPanel']/p")
    public WebElement negatifSuccess;

    @FindBy(linkText = "Bill Pay")
    public WebElement bill;

    @FindBy(name = "payee.name")
    public WebElement payeeName;
    @FindBy(name = "payee.address.street")
    public WebElement billaddres;
    @FindBy(name = "payee.address.city")
    public WebElement billcity;
    @FindBy(name= "payee.address.state")
    public WebElement billstate;
    @FindBy(name = "payee.address.zipCode")
    public WebElement billZip;
    @FindBy(name = "payee.phoneNumber")
    public WebElement billgsm;
    @FindBy(name = "payee.accountNumber")
    public WebElement accountNumber;
    @FindBy(name = "verifyAccount")
    public WebElement verifyAccount;
    @FindBy(name = "amount")
    public WebElement amount;
    @FindBy(xpath = "//div[@ng-show='showResult']/h1")
    public WebElement verifyOrder;
    @FindBy(xpath = "//*[@value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(linkText = "Log Out")
    public WebElement logout;
    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "firstname" : return firstname;
            case "lastname" : return lastname;
            case "address" : return address;
            case "city" : return city;
            case "state" : return state;
            case "zipcode" : return zipcode;
            case "phone" : return phone;
            case "ssn" : return ssn;
            case "username" : return username;
            case "password" : return password;
            case "repeatedPassword" : return repeatedPassword;
            case "confirm" : return confirm;
            case "id" : return id;
            case "pass" : return pass;
            case "login" : return login;
            case "payeeName" : return payeeName;
            case "billaddres" : return billaddres;
            case "billcity" : return billcity;
            case "billstate" : return billstate;
            case "billZip" : return billZip;
            case "billgsm" : return billgsm;
            case "accountNumber" : return accountNumber;
            case "verifyAccount" : return verifyAccount;
            case "verifyOrder" : return verifyOrder;
            case "sendPayment" : return sendPayment;
            case "amount" : return amount;
            case "bill" : return bill;

        }


        return null;
    }
    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"success");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        // açık dialog kutusu varsa kapansın
    }
    public void verifyNegatifTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"not be verified");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        // açık dialog kutusu varsa kapansın
    }

}
