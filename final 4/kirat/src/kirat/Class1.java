package kirat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test; 
class Class1 {

    @Test
    public void Saini(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amanpreet\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actualTitle = "Google";
        Assert.assertEquals(driver.getTitle(), actualTitle );
       WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")  );
      Assert.assertEquals(true, logo.isDisplayed());
        System.out.println("pass");
        driver.close();
}
}