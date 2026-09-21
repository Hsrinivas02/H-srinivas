package day12assesment;


/*
 * //TestCase  - 1

Login to orangeHrm application ->click on Recruitment link ->click on vacancies link ->enter vacancy name ,
select job title,add description , select hiring manager, number of positons-> 
click on save button 
//Testcase 2

Login to orangeHrm application ->click on MyInfo link ->change employee first name, lastname ,employee id ->
click on save->logut and then login again ->verify whether the edited details are updated-> logout


------Use all  required frameWork concepts-----
 */

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase extends HRMBaseClass{
	// Read vacancy details from Excel
	@DataProvider
	public Object[][] JobDetails() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/main/java/day12assesment/Vacency.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Object[][] ob = new Object[sh.getLastRowNum()][3];
		for(int i=0;i<sh.getLastRowNum();i++) {
			for(int j=0;j<3;j++) {
				ob[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return ob;
	}
	// Test Case 1: Create a vacancy
	@Test(dataProvider="JobDetails")
	// Create vacancy using the data from Excel
	public void TestCase1(String vName,String vDes,String hrm) throws FileNotFoundException, AWTException, InterruptedException {
		System.out.println("Test Case - 1 Executing");
		// Open Recruitment
		HomePagePom r = new HomePagePom(driver);
		r.getrecruiterLink();
		// Open Vacancies
		recruiterPagePom rp = new recruiterPagePom(driver);
		rp.getvacancyLink();
		// Click Add button
		rp.getAddLink();
		// Enter vacancy name
		VacancyPom vp = new VacancyPom(driver);
		vp.getVacancyName().sendKeys(vName);
		Thread.sleep(1500);
		// Select Job Title
		vp.getJobTi();
		vp.getJobTittle();
		// Enter description
		vp.getDes(vDes);
		// Enter Hiring Manager
		vp.gethRm(hrm);
		// Select Hiring Manager from suggestions
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Enter number of positions
		vp.getnoofp();
		
		// Save the vacancy
		vp.getsavebtn();
		Thread.sleep(4000);
		System.out.println("Test Case - 1 Executed");
	}
	
	
	// Test Case 2: Update and verify employee details
	@Test
	public void TestCase_2() throws InterruptedException, IOException {
		System.out.println("Test Case - 2 Executing");
	    // Open My Info
	    HomePagePom r = new HomePagePom(driver);
	    r.getMyInfoLink();
	    // Edit employee details
	    MyInfoPom m = new MyInfoPom(driver);
	    m.getFname("Charlie");
	    m.getLname("Chaplin");
	    m.getempId("SMILEBABY");
	    // Save the changes
	    m.getSaveBtn();
	    // Logout
	    LogOutPom lg = new LogOutPom(driver);
	    lg.getdropd();
	    lg.getlogout();
	    // Login again
	    LoginPom li = new LoginPom(driver);
	    li.getUn();
	    li.getPwd();
	    li.getLgbutton();
	    // Open My Info again
	    HomePagePom r2 = new HomePagePom(driver);
	    r2.getMyInfoLink();
	    // Create a new POM for the new page
	    MyInfoPom m2 = new MyInfoPom(driver);
	    // Get the updated details
	    String updatedFname = m2.getFname();
	    String updatedLname = m2.getLname();
	    // Verify the updated details
	    Assert.assertEquals(updatedFname, "Charlie");
	    Assert.assertEquals(updatedLname, "Chaplin");
	    System.out.println("Test Case - 2 Executed");
	}
}