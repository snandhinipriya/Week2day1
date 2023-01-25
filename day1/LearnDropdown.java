package Week2.day1;


import java.util.List;

//import java.awt.List;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jdk.jfr.internal.Options;


public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         //driver.get("https://www.leafground.com/select.xhtml");
         driver.get("http://leaftaps.com/opentaps/control/login");
         driver.manage().window().maximize();
         WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
         Select dd = new Select(eleTool);
         //dd.selectByIndex(1);
         //dd.selectByVisibleText("Playwright");
         dd.selectByValue("LEAD_CONFERENCE");
         
        List<WebElement> Options = dd.getOptions();
         
         
        for (int i = 0;  i< Options.size(); i++) {
	    WebElement Option = Options.get(i);
	    String Text = Option.getText();
        System.out.println(Text);
	}

}
}

