package com.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Utility_Files {
		public static WebDriver driver;
	public static WebDriver browser_Launch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;	
	    }
	
	public static void impliWait (int sec) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
	public static void pageLoadWait(int sec) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	    }
	public static  void getUrl(String url) {
			driver.get(url);
		}
	public static  void navigateToUrl(String url) {
		driver.navigate().to(url);
	}
	public static void navigateback() {
		driver.navigate().back();
	    }
	public static void navigateforward() {
		driver.navigate().forward();
	    }
	public static void refresh() {
		driver.navigate().refresh();
	    }
	public static void close_() {
		driver.close();
	    }
	public static void quit_() {
		driver.quit();
		}
	public static WebElement findEleByXpath (String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
		}
	public static List<WebElement> findElementsByXpath(String xpath) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		return elements;
	    }
	public static void click_(WebElement e) {
		e.click();	
	    }
	public static void send_Keys(WebElement e,String key) {
		e.sendKeys(key);	
	    }
	public static void clear_(WebElement e) {
		e.clear();	
	    }
	public void nav_To(String url) {
		driver.navigate().to(url);
		}
	public static void nav_Ref() {
		driver.navigate().refresh();
		}
	public static void nav_Forward() {
		driver.navigate().forward();
		}
	public static void nav_Back() {
		driver.navigate().back();
		}
	public static String get_Title() {
		String title = driver.getTitle();
		return title;	
		}
	public static String get_CurrentURL() {
		String url = driver.getCurrentUrl();
		return url;
		}
	public static Select select(WebElement element) {
		 Select s = new Select(element);
		return s;
	    }
	public static void selectByText(Select s,String text) {
		s.selectByVisibleText(text);
	    }
	public static void selectByValue(Select s,String value) {
		s.selectByValue(value);
	    }
	
	public static void source_Destination_Copy(TakesScreenshot t,String destination) throws IOException {
		File source = t.getScreenshotAs(OutputType.FILE);
		File des = new File(destination);
		FileUtils.copyFile(source, des);
	    }
	public static void threadSleep(int milli) throws InterruptedException {
		Thread.sleep(milli);
	    }
	public static Actions actions() {
		Actions a = new Actions(driver);
		return a;
		}
	public static void moveToEle(Actions a , WebElement element) {
	a.moveToElement(element).build().perform();	
	   }
	public static boolean is_Enabled(WebElement element) {
	     boolean enabled = element.isEnabled();
	     return enabled;
	   }
	public static boolean is_Displayed(WebElement element) {
	     boolean dispalyed = element.isDisplayed();
	     return dispalyed;
	   }
	public static boolean is_Selected(WebElement element) {
	     boolean selected = element.isSelected();
	     return selected;
	   }
	
	public static void alert_(String type,String key) {
		if (type.equalsIgnoreCase("simple")) {
			driver.switchTo().alert().dismiss();
			driver.switchTo().defaultContent();
			
		}
		else if(type.equalsIgnoreCase("confirm")) {
        	driver.switchTo().alert().accept();	
        	driver.switchTo().defaultContent();
		}
		else if (type.equalsIgnoreCase("prompt")) {
			driver.switchTo().alert().sendKeys(key);
			driver.switchTo().alert().accept();
			 driver.switchTo().defaultContent();
			}
		 
	    }
	
	public static List<WebElement> get_Options(Select s) {
		List<WebElement> options = s.getOptions();
		 return options;
	   }
	public static List<WebElement> get_AllSelected(Select s) {
		List<WebElement> options = s.getAllSelectedOptions();
		 return options;
	   }
	public static WebElement get_FirstSelectedOptions(Select s) {
		WebElement option = s.getFirstSelectedOption();
		 return option;
	   }
	public static void deSelectAll(Select s) {
		s.deselectAll();
	   }
	public static boolean is_Multiple(Select s) {
		boolean multiple = s.isMultiple();
	   return multiple;
	   }
	public static void deSelectBy(Select s, String by,String value_or_text_or_index ) {
		if (by.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value_or_text_or_index);
			s.deselectByIndex(index);
			}
		else if (by.equalsIgnoreCase("value")) {
			s.deselectByValue(value_or_text_or_index);
		}
	    else if (by.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value_or_text_or_index);
		}
	   }
	
	public static void click_AndHold(Actions a,WebElement element) {
		a.clickAndHold(element).build().perform();
	   }
	public static void rel(Actions a) {
		a.release().build().perform();
	   }
    public static List<WebElement> findElementsByTagName(String tagName) {
        List<WebElement> elements_ = driver.findElements(By.tagName(tagName));
    	return elements_;
       }
	public static void switch_ToFrame(String type,String index_Or_Name_or, WebElement frameElement ) {
		if (type.equalsIgnoreCase("index")) {
			int Int = Integer.parseInt(type);
			driver.switchTo().frame(Int);
		}
		else if(type.equalsIgnoreCase("name")) {
        	driver.switchTo().frame(index_Or_Name_or);	
		}
		else if (type.equalsIgnoreCase("webelement")) {
			
			driver.switchTo().frame(frameElement);
			}
		else if (type.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
			
		}
	    }
    public static void switchToFrameByEle(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	   }
	public static void switch_ToDefaultContent () {
		driver.switchTo().defaultContent();
	  }
	public static JavascriptExecutor javaScriptExe() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		return j;
	}
	public static void jsScrollIntoView(JavascriptExecutor j,WebElement element) {
		j.executeScript("arguments[0].scrollIntoView();", element);

	}
	public static String get_CurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	  }
	public static String get_Text (WebElement element) {
		String text = element.getText();
		return text;
	  }
	public static String get_Attribute (String xpath, String name) {
		String text = findEleByXpath(xpath).getAttribute(name);
		return text;
	  }
	public static void jsScrollDown(JavascriptExecutor j) {
		j.executeScript("arguments[0].scrollBy(0,document.body.scrollheight);");
	}
	public static void jsScrollUp(JavascriptExecutor j) {
		j.executeScript("arguments[0].scrollBy(0,-document.body.scrollheight);");
	}
	public static void robo_NewTab(WebElement element,Actions a) throws AWTException {
		 Robot r = new Robot();
		 moveToEle(a, element);
		 a.contextClick().build().perform();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
     	 r.keyRelease(KeyEvent.VK_ENTER);	
	}
	public static String get_WindowHandel() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public static Set<String> get_WindowHandels() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public static Workbook get_Workbook (String excel_Path ) throws IOException {
		File f = new File(excel_Path);
		FileInputStream iS = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(iS);
		return work;
	}
	public static String get_Date(Workbook work, int sheet_num,int row_num,int cell_num) throws IOException {
		Sheet sheetAt = work.getSheetAt(sheet_num);
		Row row = sheetAt.getRow(row_num);
		Cell cell = row.getCell(cell_num);
	    CellType cellType = cell.getCellType();
	    String date = null;
	    SimpleDateFormat s = null;
if (cellType.equals(CellType.NUMERIC)) {
			Date date1 = cell.getDateCellValue(); 
			if (s==null) {
			 s = new SimpleDateFormat("d/MM/YYYY");
			 }
			 date = s.format(date1);
		
			} 
               return date;
	     }
	public static String cellData(Workbook work, int sheet_num,int row_num,int cell_num) throws IOException {
		Sheet sheetAt = work.getSheetAt(sheet_num);
		Row row = sheetAt.getRow(row_num);
		Cell cell = row.getCell(cell_num);
	    CellType cellType = cell.getCellType();
	    String data = null; 
	    if (cellType.equals(CellType.STRING )) {
			data = cell.getStringCellValue();
	}
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double d = cell.getNumericCellValue();
			
			int a = (int) d;
			data = String.valueOf(a);
	}
	     
		  return data;
		 
	}
	public static List<WebElement> findByAttributeName(String name ){
		List<WebElement> findElements = driver.findElements(By.name(name));
		return findElements;
	}
	public static List<WebElement> findByElementsTagName(String tagName ){
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		return findElements;
	}
	 public static List<String> getWindows() {
		 Set<String> win = get_WindowHandels();
		 List<String> l = new ArrayList<String>(win); 
		 return l;
	 }
	 public static void switchToWindow(List<String>window_Handels ,int i) {
		 driver.switchTo().window(window_Handels.get(i));
	 }
    
   public static void broken_Url_Or_Img(String tagName,String attributeName) throws IOException {
	    Logger log = Logger.getLogger(Logger.class);
	    BasicConfigurator.configure();
	   List<WebElement> list = findByElementsTagName(tagName);
	   Map<String, String> m = new LinkedHashMap<String, String>();
	   for (WebElement element : list) {
		String link = element.getAttribute(attributeName);
		
	 if (link==null&&link.isEmpty()) {
		 continue;
	}
	 else if (link.startsWith("http")) {
		 URL url = new URL(link);
		 URLConnection open = url.openConnection();
		 HttpURLConnection http = (HttpURLConnection) open;
		 http.connect();
		 String message = null;
		 int code = http.getResponseCode();
		 if (attributeName.equals("href")&&code>399) {
		 message = http.getResponseMessage();
		 m.put(link,message );
		 Set<Entry<String, String>> entrySet = m.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			 if (entry.getValue()==null) {
				 continue;
			}
			 else {
				 log.info( entry);
			}}}
		 else if (attributeName.equals("src")&&code!=200) {
			 message = http.getResponseMessage();
			 m.put(link,code+" - "+message );
			 Set<Entry<String, String>> entrySet = m.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				 if (entry.getValue()==null) {
					 continue;
				}
				 else {
					 log.info( entry);
				}}}
	}
	}
   }


}

