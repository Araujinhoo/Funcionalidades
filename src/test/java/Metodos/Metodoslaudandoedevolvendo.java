package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodoslaudandoedevolvendo {
	
	WebDriver driver;
	public void abrirnavegador (String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();		
	}	
	public void preencher (By Elemento, String texto) {
		driver.findElement(Elemento).sendKeys(texto);
	}	
	public void clicar (By Elemento) {
		driver.findElement(Elemento).click();
	}	
	public void tempo (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	public void fechar (By elemento) {
		driver.quit();
	}
	public void atualizar (By elemento ) {
		driver.navigate().refresh();
	}	
	public boolean verificarElementoExiste(By locator) {
        return driver.findElements(locator).size() > 0;
    }
}
