package Utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, int testID) throws IOException {
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH mm ss");  
		LocalDateTime now = LocalDateTime.now();  
		 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("test-output//Screenshot//Test-" + testID + " " + date.format(now) + ".jpeg");
		FileHandler.copy(source, dest);
	}

}
