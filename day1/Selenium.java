package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement eleUsername = driver.findElement(By.xpath("//input[@type='text']"));
		eleUsername.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		
		
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhinipriya");
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
		 //Select dd = new Select(eleTool);
        
		
		//WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
        //Select dd = new Select (eleSource);
        //dd.selectByValue("LEAD_CONFERENCE");
        
        
    
		driver.findElement(By.name("submitButton")).click();
		String firstName =  driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("firstName");
		
		if(firstName.equalsIgnoreCase("Nandhinipriya"))
		{
		System.out.println("firstName is correct");
		}
		else
		{
			System.out.println("firstName is Not correct");
		}
		driver.close();
	}
	}


