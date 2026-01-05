package org.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BaseClass {
	
    public static Properties prop;
    public static String getProperty(String key) {
    	
        if (prop == null) {
            prop = new Properties();
            try {
                FileInputStream file = new FileInputStream("D:\\selenium\\E_com_project_2\\src\\main\\resources\\config.properties");
                prop.load(file);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load config.properties file", e);
            }
        }
        String value = prop.getProperty(key);
        if (value == null) {
            throw new RuntimeException(" Property key not found: " + key);
        }
        return value;
    }
    
    public static void sleep(int sec) {
    	try {
			Thread.sleep(Duration.ofSeconds(sec));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    }
    
    
	public static void JsSendKeys(WebElement element ,String value) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);
	}


     public static void click(WebElement element) {
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
 		 wait.until(ExpectedConditions.elementToBeClickable(element)); 
 		element.click();
     }
     
     public static void sendKeys(WebElement element, String value) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.clear();
	        element.sendKeys(value);
	       
	    }

     
     public static void quit() {
    	 if(driver!=null) {
    	 driver.quit();
    	 }
     }
     
    
     public static void enter() {
    	 try {
    		 Robot r=new Robot();
    		 r.keyPress(KeyEvent.VK_ENTER);
    		 r.keyRelease(KeyEvent.VK_ENTER);
		 } catch (AWTException e) {
			System.out.println("Not enter the Should be done");
			e.printStackTrace();
		 }
     }
     public static void downKey(int ntimes) {
    	 try {
    		 Robot r=new Robot();
    		 for(int i=1;i<=ntimes;i++) {
    		 r.keyPress(KeyEvent.VK_DOWN);
    		 r.keyRelease(KeyEvent.VK_DOWN);
    		 }
    		 r.keyPress(KeyEvent.VK_ENTER);
    		 r.keyRelease(KeyEvent.VK_ENTER);
    	 } catch (AWTException e) {
    		 System.out.println("Not enter the Should be done");
    		 e.printStackTrace();
    	 }
     }
     
     public static void mouseOver(WebElement element) {
    	 Actions a = new Actions(driver);
    	 a.moveToElement(element);
     }
     
     public static void contentClick(WebElement element) {
    	 Actions a = new Actions(driver);
    	 a.contextClick(element);
     }
     
     public static void dragAndDrop(WebElement src,WebElement dest ) {
    	 Actions a = new Actions(driver);
    	 a.dragAndDrop(src,dest);
     }
     
     public static void doubleClick(WebElement element) {
    	 Actions a = new Actions(driver);
    	 a.doubleClick(element);
     }
     
     public WebElement findElement(String locatorType, String Value) {
        WebElement element=null;

         switch (locatorType) {
             case "id":
                 element=driver.findElement( By.id(Value));
                 break;
             case "name":
                 element = driver.findElement(By.name(Value));
                 break;
             case "xpath":
                 element = driver.findElement(By.xpath(Value));
                 break;
             case "css":
             case "cssselector":
                 element = driver.findElement(By.cssSelector(Value));
                 break;
             case "classname":
                 element = driver.findElement(By.className(Value));
                 break;
             case "tagname":
                 element = driver.findElement(By.tagName(Value));
                 break;
             case "linktext":
                 element = driver.findElement(By.linkText(Value));
                 break;
             case "partiallinktext":
                 element = driver.findElement(By.partialLinkText(Value));
                 break;
             default:
                 throw new IllegalArgumentException(" Invalid locator type: " + locatorType);
         }

         return element;
     }
	
     public static void takeScreenshot(String scenarioName) throws IOException {

    	    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    	    String screenshotName = scenarioName.replaceAll(" ", "_") + "_" + timeStamp + ".png";

    	    String basePath = System.getProperty("user.dir") + "/target/screenshots/";
    	    new File(basePath).mkdirs();

    	    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	    File destination = new File(basePath + screenshotName);

    	    FileUtils.copyFile(source, destination);
    	}

}
