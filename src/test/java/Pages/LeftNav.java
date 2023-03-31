package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
   // sol taraftaki menuler burda

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='loginPanel']/p[2]/a")
    public WebElement register;


    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "register" : return register;
        }

        return null;
    }


}
