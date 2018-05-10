import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.google.common.io.Files;

public class FirstClass {
	public static Logger logger = Logger.getLogger(FirstClass.class.getName());

	public static void main(String[] args)
			throws InterruptedException, IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_m5.06.15\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.get("http://www.google.com");
		
		PropertyConfigurator.configure("C:\\Users\\training_m5.06.15\\workspace\\FirstProj\\src\\config.properties");
try{
		FileInputStream f1=new FileInputStream (new File ("C:\\temp\\log.xlsx"));
		XSSFWorkbook b1=new XSSFWorkbook(f1);
		XSSFSheet s1= b1.getSheet("1");
		System.out.println("Sheet is present");}
catch(FileNotFoundException fe)
{
	logger.info("file not found");
	logger.error("file not found error");
}
catch(IOException o)
{
	System.out.println("IOexception occured"+o);
}
		
		
		
		
		System.out.println("****************  process Ends  *******************");
			
		
		/*
		 * XSSFWorkbook workbook = new XSSFWorkbook(); // creates blank workbook
		 * XSSFSheet sheet = workbook.createSheet("Java Books");
		 * 
		 * Object[][] bookData = { { "Need First Java", "Kathy serria", 79 }, {
		 * "Effective java", "bloch", 36 } };
		 * 
		 * int rowCount = 0;
		 * 
		 * for (Object[] aBook : bookData){ Row row=sheet.createRow(rowCount++);
		 * 
		 * int coloumnCount=0;
		 * 
		 * for (Object field:aBook){ Cell cell=row.createCell(coloumnCount++);
		 * if (field instanceof String){ cell.setCellValue((String) field); }
		 * else if (field instanceof Integer){ cell.setCellValue((Integer)
		 * field); } } }
		 * 
		 * 
		 * try(FileOutputStream outputStream = new
		 * FileOutputStream("C:\\temp\\Javabooks.xlsx")){
		 * workbook.write(outputStream); workbook.close(); }
		 * 
		 */

		/*
        FileInputStream inputstream = new FileInputStream("C:\\temp\\demo.xlsx");
		Workbook workbook = new XSSFWorkbook(inputstream);
		Sheet firstSheet=workbook.getSheetAt(0);
		Iterator  iterator=(Iterator) firstSheet.iterator();
		
		while (iterator.next() != null){
			Row nextRow=(Row) iterator.next();
			Iterator cellIterator=(Iterator) nextRow.cellIterator();
			
			while (cellIterator.next() != null){
				Cell cell=(Cell) cellIterator.next();
				
				switch (cell.getCellType()){
				case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue());
				break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
				}
				System.out.println("-");
			}
			System.out.println();
			
		}
		
		*/
		
				

		/*
		 * //reading xml file
		 * 
		 * File file1=new File("C:\\temp\\employee.xml"); DocumentBuilderFactory
		 * dbFactory=DocumentBuilderFactory.newInstance(); DocumentBuilder
		 * dBuilder=dbFactory.newDocumentBuilder(); Document
		 * doc=dBuilder.parse(file1);
		 * 
		 * System.out.println("root element"+
		 * doc.getDocumentElement().getNodeName());
		 * 
		 * NodeList nList=doc.getElementsByTagName("shipto");
		 * 
		 * System.out.println(nList); System.out.println("------------");
		 * System.out.println(nList.getLength());
		 * 
		 * for (int temp=0;temp < nList.getLength();temp++){ Node
		 * nNode=nList.item(temp); System.out.println("clear idea"+nNode);
		 * System.out.println("\nCurrent Element:"+nNode.getNodeName());
		 * 
		 * if (nNode.getNodeType()==Node.ELEMENT_NODE){ Element eElement =
		 * (Element)nNode; System.out.println("name of employee"
		 * +eElement.getAttribute("name")); }
		 * 
		 * }
		 * 
		 */

		/*
		 * reading text file using properties File file=new
		 * File("C:\\temp\\sample.txt"); FileInputStream fileInput=new
		 * FileInputStream(file); Properties properties=new Properties();
		 * properties.load(fileInput); fileInput.close(); Enumeration
		 * enuKeys=properties.keys(); while(enuKeys.hasMoreElements()){ String
		 * key=(String)enuKeys.nextElement(); String
		 * value=properties.getProperty(key);
		 * 
		 * System.out.println(key+":"+ value); }
		 */

		// String abc="learning";
		// BufferedWriter writer=Files.newWriter(file, charset);
		// writer.write(arg0);

		// Path file=Paths.get("C:\\temp","sample.txt");
		// Charset charset=charset.forName("US-)

		/*
		 * writing into txt file File f=new File("C:\\temp\\sample.txt"); byte[]
		 * write1={'a','b','c'}; Files.write(write1,f);
		 */

		/*
		 * copy content of one to another InputStream i=new
		 * FileInputStream("C:\\temp\\demo.xlsx"); OutputStream o=new
		 * FileOutputStream("C:\\temp\\abc.xlsx"); byte[] r=new byte[1024]; int
		 * a; while((a=i.read(r))>0) { o.write(r,0,a);}
		 * 
		 */

		/*
		 * getting file path File file= new File("C:\\temp\\demo.xlsx"); String
		 * abc=file.getAbsolutePath(); System.out.println(
		 * "absolute path of the file is "+abc);
		 */

		/*
		 * this is to wait for specific one element // wait for grid to appear
		 * By container = By.cssSelector(".demo-container"); WebDriverWait wait
		 * = new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(container));
		 */

		/*
		 * //using javascript clicking on button
		 * driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("accnture"
		 * );; WebElement element=driver.findElement(By.name("btnK"));
		 * JavascriptExecutor executor=(JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();",element); //taking
		 * screenshot File
		 * srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcFile, new File("C:\\temp\\screenshot.png"));
		 */

		/*
		 * WebElement GoogleSearch = driver.findElement(By.name("btnK")); Point
		 * p = GoogleSearch.getLocation(); Dimension d = GoogleSearch.getSize();
		 * System.out.println(p.x +"---" +p.y); System.out.println(d.height
		 * +"---" +d.width);
		 */

		// Ations act = new Actions(driver);

		// hread.sleep(5000);

		// System.out.println("**************** process Ends
		// *******************");

		/*
		 * adding & deleting cookies Cookie name1 = new Cookie("mycookie1",
		 * "1111"); Cookie name2 = new Cookie("mycookie2", "2222"); Cookie name3
		 * = new Cookie("mycookie3", "3333"); driver.manage().addCookie(name1);
		 * driver.manage().addCookie(name2); driver.manage().addCookie(name3);
		 * //driver.manage().deleteCookieNamed("mycookie1");
		 * driver.manage().deleteAllCookies(); Set<Cookie> cookiesList =
		 * driver.manage().getCookies(); for (Cookie getcookies : cookiesList)
		 * System.out.println(getcookies);
		 */

		/*
		 * uploading file driver.get("https://encodable.com/uploaddemo/");
		 * Thread.sleep(5000); WebElement
		 * browse=driver.findElement(By.xpath("//*[@id='uploadname1']"));
		 * browse.sendKeys("C:\\test.txt");
		 */

		/*
		 * driver.navigate().to("http://www.google.co.in"); Thread.sleep(10000);
		 * driver.findElement(By.linkText("Gmail")).click(); Thread.sleep(5000);
		 * //driver.navigate().back(); //Thread.sleep(5000);
		 * //driver.navigate().forward(); //Thread.sleep(5000);
		 * driver.findElement(By.id("Email")).sendKeys("username");
		 * Thread.sleep(5000); driver.navigate().refresh();
		 */

		/*
		 * act.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
		 * act.doubleClick(driver.findElement(By.linkText("Gmail"))).perform();
		 */

		/*
		 * driver.get(
		 * "http://jqueryui.com/resources/demos/droppable/default.html");
		 * WebElement draggable =
		 * driver.findElement(By.xpath("//*[@id='draggable']")); WebElement
		 * droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		 * act.dragAndDrop(draggable, droppable).perform();
		 */

		/*
		 * driver.get(
		 * "http://jqueryui.com/resources/demos/resizable/default.html");
		 * WebElement resize =
		 * driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		 * act.dragAndDropBy(resize, 800, 200).perform();
		 */

		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get("http://jqueryui.com/dialog"); driver.switchTo().frame(0);
		 * driver.findElement(By.xpath("//button[@title='Close']")).click();
		 * driver.close(); driver.quit();
		 */

		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get(
		 * "http://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width"
		 * ); int size=driver.findElements(By.tagName("iframe")).size();
		 * System.out.println("total number of frames in the page "+size);
		 * size=driver.findElements(By.tagName("iframe")).size();
		 * System.out.println("total number of frames A "+size);
		 * driver.switchTo().frame(3);
		 * System.out.println(driver.findElement(By.xpath("html/body/h1")).
		 * getText()); driver.switchTo().defaultContent();
		 */
	}

}
