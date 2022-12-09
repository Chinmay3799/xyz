package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReorterNG {

	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
	
		ExtentSparkReporter esr = new ExtentSparkReporter(path);
		
		esr.config().setReportName("Web automation Reports");
		esr.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		
		extent.attachReporter(esr);
		
		return extent;
		
	}
}
