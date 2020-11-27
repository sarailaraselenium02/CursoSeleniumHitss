package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class LoginCorrecto {

	WebDriver driver;
	@Given("Ingresar a la pagina de saucedemo")
	public void Ingresar_a_la_pagina_de_saucedemo() {
		System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedrivers.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/index.html");

	}
	
	/*@When("El titulo de la pagina swaglabs")
	public void el_titulo_de_la_pagina_es_swaglabs()  {
	   String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("login_logo", title);
	}*/
	
	@When("Ingresar usuario y password valido")
	public void Ingresar_usuario_y_password_valido() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@Then("Dar clic en login")
	public void Dar_clic_en_login() {
	    driver.findElement(By.id("login-button")).click();
	}
	
	@Then("Deberia ir a la pagina de Products")
	public void Deberia_ir_a_la_pagina_de_Products() {
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).isDisplayed();
	}
}

