package HomePageBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown1 {
		WebDriver driver;
		Actions act;
	
	//Step 1 : Declaration of variable globally (data members)
	
		@FindBy(xpath="(//a[@id='nav_link_2'])") //Groceries = driver.findElement(By.id("nav_link_2"));
		private WebElement Groceries;
		
		@FindBy(xpath="(//li[@id='nav_cat_2']/div/ul/li/a)")
		private List<WebElement> list;
		
		//Step 2 : Initialization of Global Variable (data member)
		
		public Dropdown1(WebDriver driver) throws InterruptedException { 
			PageFactory.initElements(driver,this);
			this.driver = driver;
			act = new Actions(driver);

		}
		
		//Step 3 : Method creation
		public void Grocerie() throws InterruptedException {
			Thread.sleep(2000);
			System.out.println("==========="+Groceries.getText()+"========");
			act.moveToElement(Groceries).build().perform();		}
		
		public void listt() throws InterruptedException {
			for(WebElement e : list) {
				Thread.sleep(300);
				act.moveToElement(e).build().perform();
				System.out.println(e.getText());
			}
			Thread.sleep(2000);
			}
	}
