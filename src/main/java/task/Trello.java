package task;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Trello {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Downloads\\chromedriver_win32 (1)\\chromedriver (2).exe");
		
		WebDriver driver=new ChromeDriver();

		  //Login to Trello
	      driver.get("https://trello.com/login");
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vaishnavichangole04@gmail.com");
	      driver.findElement(By.xpath("//input[@id='login']")).click();
	      Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vaishu@123");
	      driver.findElement(By.xpath("//span[@class='css-178ag6o']")).click();
	      Thread.sleep(2000);
	     	      //Create a new board
	   driver.findElement(By.xpath("//div[@class='board-tile mod-add']")).click();
driver.findElement(By.xpath("//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")).sendKeys("new board");
driver.findElement(By.xpath("//button[@class='ijFumaLuInvBrL bxgKMAm3lq5BpA SdamsUKjxSBwGb SEj5vUdI3VvxDc']")).click();
Thread.sleep(3000);
// Create List A and List B
driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List A");
driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")).click();
driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List B");
driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")).click();
// Add a card in List A
 driver.findElement(By.xpath("(//span[text()='Add a card'])[1]")).click();
 driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']")).sendKeys("CARD1");
 driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//Drag and drop the card from List A to List B	
		
 WebElement source = driver.findElement(By.xpath("//span[text()='CARD1']"));
 WebElement target = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div/div[3]/a"));
 Actions actions = new Actions(driver);
 actions.dragAndDrop(source, target).perform();
 Thread.sleep(2000);
 
//Get the x and y coordinates of the card
 Point location = target.getLocation();
 int x = location.getX();
 int y = location.getY();
 System.out.println("The x-coordinate of the card is " + x);
 System.out.println("The y-coordinate of the card is " + y);
 Thread.sleep(2000);
 
//Logout of Trello
 driver.findElement(By.xpath("(//span[@title='Vaishnavi changole (vaishnavichangole04)'])[1]")).click();
 driver.findElement(By.xpath("(//button[@class='yTThzZMDkelhke'])[2]")).click();
 Thread.sleep(2000);

 //Close the browser
 driver.quit();
 
 
 
 
 
 
 
 
 
}	
		
		
		
}


