import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

    @Test
    public static void login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users//vikas//Downloads//chromedriver-win32//chromedriver-win32//chromedriver.exe");

        // Use JDK's HTTP client for WebDriver HTTP requests (optional based on your environment)
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        // Initialize ChromeOptions and set arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("vikash6726972");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("vikashhhsharm9696@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vikash@1998");
//
        Select daydrop = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
        daydrop.selectByVisibleText("20");

        Select monthdrop = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
        monthdrop.selectByVisibleText("March");

        Select yeardrop = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
        yeardrop.selectByVisibleText("1998");

        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Vikash kumar");
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Sharma");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Katras bazar Dhanbad");

        Select countrydrop = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
        countrydrop.selectByVisibleText("India");

        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Jharkhand");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dhanbad");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("828114");
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("7979948972");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText(),"ACCOUNT CREATED!");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).getText(),"Logout");
        Thread.sleep(5000);
        //driver.quit();

    }
}
