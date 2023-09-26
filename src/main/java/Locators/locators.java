package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Inicializar el Webdriver
        WebDriver driver = new ChromeDriver();

        //Abrir la Web
        driver.get("https://www.saucedemo.com");

        //Maximizar la pagina
        driver.manage().window().maximize();

        //Credenciales
        String username = "standard_user";
        String password = "secret_sauce";

        //Localizar por ID
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        //WebElement loginBtn = driver.findElement(By.id("login-button"));

        //Localizar por clase
        //WebElement loginBtn = driver.findElement(By.className("submit-button"));

        //Localizar por nombre
        //WebElement loginBtn = driver.findElement(By.name("login-button"));

        //Localizar por XPath
        //WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        //Localizar por CSS selector
        WebElement loginBtn = driver.findElement(By.cssSelector("input.submit-button"));

        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
}
