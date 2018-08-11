package week7.runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import week6.classroom.SeMethodsWithReports;

public class Hooks extends SeMethodsWithReports
{
	
	@Before
	public void before(Scenario tc)
	{
		beginResult();
		startTest( tc.getName(), testDescription);
		
		tc.getId();
	}

	@After
	public void after(Scenario tc)
	{
		tc.getStatus();
	}
}
