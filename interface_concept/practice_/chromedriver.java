package practice_;

public class chromedriver implements webdriver {


	
	@Override
	public void browsersetup() {
	System.out.println("BrowserOpnenig code");	
	}

	@Override
	public void teardown() 
	{		
	System.out.println("Browser closing code");
	}

	public static void main(String[] args) {
   
	webdriver driver=new chromedriver();
	driver.browsersetup();
	driver.teardown();	 
	
    }
    }