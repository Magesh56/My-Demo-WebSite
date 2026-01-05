package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="D:\\selenium\\E_com_project_2\\src\\test\\resources\\feature",
                 dryRun = !true,
                 monochrome = true,
                		  glue = {
                			        "org.stepdefination",
                			        "org.hooks"         
                			    },
                 plugin = {"pretty",
                           "html:target\\htmlreport.html",
                           "json:target\\jsonreport.json",
                           "junit:target\\junitreport.xml"})



public class Runner {
	
	@AfterClass
	public static void reports() throws InterruptedException {
		Thread.sleep(2000);
		JvmReport.generateJvmReport("target\\jsonreport.json");
		System.out.println("------------------Report Generated--------------------");
	}

	
}
