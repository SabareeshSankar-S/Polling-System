

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import formBeans.Page1FormBean;
import formBeans.UserDetailsFormBean;
import services.ReportsCalculatorService;
import test_controllers.TestReportGenerationController;

class ReportGenerationControllerTest {

	TestReportGenerationController testReportGenerationController;
	HttpServletRequest request;
	HttpServletResponse response;
	ActionMapping mapping;
	ReportsCalculatorService service;

	@Test
	@BeforeEach
	void setup() {

		testReportGenerationController = new TestReportGenerationController();
		service = new ReportsCalculatorService();
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
		mapping =mock(ActionMapping.class);
	}

	@Tag("ReportGenerationTest")
	@DisplayName("ReportGeneratorTest")
	@Test
	void testReportGenerator()
	{
		when(request.getParameter("gender1")).thenReturn("male");
		when(request.getParameter("gender2")).thenReturn("female");
		when(request.getParameter("gender3")).thenReturn("male");
		when(request.getParameter("gender4")).thenReturn("female");

		Map<String, Double> actualGenderValues = testReportGenerationController.testGenderPercentage(request, mapping);
		Map<String, Double> expectedGenderValues = new HashMap<String, Double>();
		expectedGenderValues.put("Male", 50.0);
		expectedGenderValues.put("Female", 50.0);
		assertEquals(expectedGenderValues, actualGenderValues,"Error in the method");


		when(request.getParameter("voterCapability1")).thenReturn("yes");
		when(request.getParameter("voterCapability2")).thenReturn("yes");
		when(request.getParameter("voterCapability3")).thenReturn("no");
		when(request.getParameter("voterCapability4")).thenReturn("no");

		double actualRegdVoterss = testReportGenerationController.testRegVotersPercentage(request, mapping);
		double expectedRegdVoters = 50.0;
		assertEquals(expectedRegdVoters, actualRegdVoterss,"Error in the method");

		when(request.getParameter("voterInterest1")).thenReturn("yes");
		when(request.getParameter("voterInterest2")).thenReturn("yes");
		when(request.getParameter("voterInterest3")).thenReturn("no");
		when(request.getParameter("voterInterest4")).thenReturn("no");

		double actualInterest = testReportGenerationController.testVotersInterestPercentage(request, mapping);
		double expectedInterest = 50.0;
		assertEquals(expectedInterest, actualInterest,"Error in the method");

		when(request.getParameter("choice1")).thenReturn("bjp");
		when(request.getParameter("choice2")).thenReturn("bjp");
		when(request.getParameter("choice3")).thenReturn("congress");
		when(request.getParameter("choice4")).thenReturn("congress");

		Map<String,Double> actualChoiceValues = testReportGenerationController.testChoicePercentage(request, mapping);
		Map<String, Double> expectedChoiceValues = new HashMap<String, Double>();
		expectedChoiceValues.put("B.J.P", 50.0);
		expectedChoiceValues.put("Congress", 50.0);
		expectedChoiceValues.put("D.M.K", 0.0);
		expectedChoiceValues.put("A.D.M.K", 0.0);
		assertEquals(expectedChoiceValues, actualChoiceValues,"Error in the method");

		when(request.getParameter("govtPerformance1")).thenReturn("very confident");
		when(request.getParameter("govtPerformance2")).thenReturn("very confident");
		when(request.getParameter("govtPerformance3")).thenReturn("not confident");
		when(request.getParameter("govtPerformance4")).thenReturn("not confident");

		when(request.getParameter("fairness1")).thenReturn("very confident");
		when(request.getParameter("fairness2")).thenReturn("very confident");
		when(request.getParameter("fairness3")).thenReturn("not confident");
		when(request.getParameter("fairness4")).thenReturn("not confident");

		Map<String, Double> actualTrustValues = testReportGenerationController.testtrustPercentage(request, mapping);
		Map<String, Double> expectedTrustValues = new HashMap<String, Double>();
		expectedTrustValues.put("Very Confident", 50.0);
		expectedTrustValues.put("Somewhat Confident", 0.0);
		expectedTrustValues.put("Not Confident", 50.0);
		assertEquals(expectedTrustValues, actualTrustValues,"Error in the method");

		when(request.getParameter("rating1")).thenReturn("4");
		when(request.getParameter("rating2")).thenReturn("4");
		when(request.getParameter("rating3")).thenReturn("1");
		when(request.getParameter("rating4")).thenReturn("1");

		when(request.getParameter("eventsAttended1")).thenReturn("yes");
		when(request.getParameter("eventsAttended2")).thenReturn("yes");
		when(request.getParameter("eventsAttended3")).thenReturn("no");
		when(request.getParameter("eventsAttended4")).thenReturn("no");

		when(request.getParameter("measures1")).thenReturn("yes");
		when(request.getParameter("measures2")).thenReturn("yes");
		when(request.getParameter("measures3")).thenReturn("no");
		when(request.getParameter("measures4")).thenReturn("no");

		double actualAwareness = testReportGenerationController.testAwarenessPercentage(request, mapping);
		double expectedAwareness = 50.0;
		assertEquals(expectedAwareness, actualAwareness,"Error in the method");

		when(request.getParameter("source1")).thenReturn("social media");
		when(request.getParameter("source2")).thenReturn("social media");
		when(request.getParameter("source3")).thenReturn("news channels");
		when(request.getParameter("source4")).thenReturn("news channels");

		Map<String, Double> actualSourceValues = testReportGenerationController.testSourcePercentage(request, mapping);
		Map<String, Double> expectedSourceValues = new HashMap<String, Double>();
		expectedSourceValues.put("Social Media", 50.0);
		expectedSourceValues.put("News Channels", 50.0);
		expectedSourceValues.put("Friends and family", 0.0);
		expectedSourceValues.put("Political Rallies/Events", 0.0);
		assertEquals(expectedSourceValues, actualSourceValues,"Error in the method");

	}
}
