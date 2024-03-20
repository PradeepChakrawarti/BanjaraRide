package Rider2;
import org.testng.annotations.AfterTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class Simple {
	
	
	
			public class simple extends Rider2 {
				AndroidDriver<AndroidElement> driver;
				@AfterTest
				public void last() {
					
					service.stop();
				}
			
	}
}
