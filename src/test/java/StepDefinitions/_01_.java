package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _01_ {
    DialogContent dc = new DialogContent();


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "success");
    }

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window();

    }

    @Then("Negatif success message displayed")
    public void negatifSuccessMessageDisplayed() {
        dc.verifyNegatifTextFunction(dc.negatifSuccess, "not be verified");
    }

    @Then("if you see loguot then success login")
    public void ifYouSeeLoguotThenSuccessLogin() {
        Assert.assertTrue(dc.logout.getText().toLowerCase().contains("log out"));
    }

    @Then("Success payment bill")
    public void successPaymentBill() {
        dc.verifySuccesOrder(dc.verifyOrder, "complete");
    }
}
