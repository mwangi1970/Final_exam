

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    static WebDriver driver;

    public static void initializeDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

        //open URL in browser.
        driver.get("https://techfios.com/test/101/");

        //Maximise browser window
        driver.manage().window().maximize();

        //Adding wait
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    public static void closeDriver(){
        String i = driver.getCurrentUrl();
        System.out.println(i);
        driver.close();
    }


    // Scenario: Scenario: changing background color to sky blue
    @Given("'Set SkyBlue Background' button exists")
    public static boolean skyBlueButtonExists()
    {

        initializeDriver();

        WebElement skyBlueButton = driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']"));

        boolean testPassed = false;

        if(skyBlueButton.isDisplayed()) {
            System.out.println("Test has passed. 'Set SkyBlue Background' button exists");
            testPassed = true;
        }

        Assert.assertTrue(testPassed);

        closeDriver();

        return testPassed;
    }

    @When("I click on the Sky Blue background button")
    public static void clickSkyBlueButton() {

        initializeDriver();

        WebElement skyBlueButton = driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']"));

        skyBlueButton.click();

    }

    @Then("the background color will change to sky blue")
    public static boolean backgroundColorIsSkyBlue() {

        WebElement backgroundColor = driver.findElement(By.cssSelector("body[style='background-color: skyblue;']"));

        boolean testPassed = false;
        if(backgroundColor.isDisplayed()){
            System.out.println("Test has passed. The background color has changed to sky blue");
            testPassed = true;
        }
        else{
            System.out.println("Test has failed.");
        }

        Assert.assertTrue(testPassed);

        closeDriver();

        return testPassed;

    }



    //Scenario: changing background color to white
    @Given("'Set White Background' button exists")
    public static boolean whiteButtonExists()
    {

        initializeDriver();

        WebElement whiteButton = driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']"));

        boolean testPassed = false;

        if(whiteButton.isDisplayed()) {
            System.out.println("Test has passed. 'Set White Background' button exists");
            testPassed = true;
        }

        Assert.assertTrue(testPassed);

        closeDriver();

        return testPassed;
    }

    @When("I click on the White background button")
    public static void clickWhiteButton() {

        initializeDriver();

        WebElement whiteButton = driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']"));

        whiteButton.click();

    }

    @Then("the background color will change to white")
    public static boolean backgroundColorIsWhite() {

        WebElement backgroundColor = driver.findElement(By.cssSelector("body[style='background-color: white;']"));

        boolean testPassed = false;
        if(backgroundColor.isDisplayed()){
            System.out.println("Test has passed. The background color has changed to white");
            testPassed = true;
        }
        else{
            System.out.println("Test has failed.");
        }

        Assert.assertTrue(testPassed);

        closeDriver();

        return testPassed;

    }


}
