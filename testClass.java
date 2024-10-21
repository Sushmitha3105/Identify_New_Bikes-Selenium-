package hackathonProjpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass
{
    public static void main(String[] args) throws IOException
    {
    
    	WebDriver driver = null;
       // ConfigReader config = new ConfigReader();
    	Properties prop = new Properties();
    	
        try
        {
        	//String filepath = System.getProperty("C:\\Users\\2361570\\eclipse-workspace\\hackathonProj\\src\\test\\java\\hackathonProjpack");
        	
            FileInputStream fis = new FileInputStream("C:\\Users\\2361570\\eclipse-workspace\\hackathonProj\\src\\test\\java\\hackathonProjpack\\config.properties");
        	
            prop.load(fis);

       // System.out.println("Before if");

        
        if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
        {
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get(prop.getProperty("url"));
        	driver.quit();
        }
        
        
       // System.out.println("done if");
        
        // Your test code here
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //driver.quit();
    }
    
}
