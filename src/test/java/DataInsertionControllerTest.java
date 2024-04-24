
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import formBeans.Page1FormBean;
import formBeans.Page2FormBean;
import formBeans.Page3FormBean;
import formBeans.UserDetailsFormBean;
import net.bytebuddy.build.ToStringPlugin.Exclude;
import test_controllers.TestDataInsertionController;

class DataInsertionControllerTest {

	TestDataInsertionController testDataInsertionController;
	UserDetailsFormBean userDetailsformBean;
	HttpServletRequest request;
	HttpServletResponse response;
	ActionMapping mapping;

	@BeforeEach
	public void setup()
	{
		testDataInsertionController = new TestDataInsertionController();
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
		userDetailsformBean =new UserDetailsFormBean();
		mapping =mock(ActionMapping.class);
	}

	@Tag("DataInsertionTests")
	@Test
	@DisplayName("WelcomePageTest")
	void testWelcomePage() throws Exception 
	{
		when(request.getParameter("age")).thenReturn("20");
		when(request.getParameter("name")).thenReturn("Sabarie");
		when(request.getParameter("email")).thenReturn("sbr@gmail.com");
		when(request.getParameter("gender")).thenReturn("male");
		when(request.getParameter("occupation")).thenReturn("developer");
		when(request.getParameter("qualification")).thenReturn("B.E");
		when(request.getParameter("state")).thenReturn("TamilNadu");

		ActionForward expectedForward = new ActionForward();
		expectedForward.setName("userDataInsertionSuccess"); 
		when(mapping.findForward("userDataInsertionSuccess")).thenReturn(expectedForward);

		ActionForward actualForward =testDataInsertionController.testInsertUserDetails(mapping,request);
		assertEquals("userDataInsertionSuccess", actualForward.getName()); 
	}

	@Test
	@DisplayName("Page1Test")
	void testPage1() throws Exception 
	{
		when(request.getParameter("voterCapability")).thenReturn("yes");
		when(request.getParameter("voteInterest")).thenReturn("yes");
		when(request.getParameter("choice")).thenReturn("d.m.k");
		when(request.getParameter("fairness")).thenReturn("very confident");
		when(request.getParameter("ratings")).thenReturn("4");

		ActionForward expectedForward = new ActionForward();
		expectedForward.setName("page1DataInsertionSuccess"); 
		when(mapping.findForward("page1DataInsertionSuccess")).thenReturn(expectedForward);

		ActionForward actualForward =testDataInsertionController.testInsertPage1Data(mapping, request);
		assertEquals("page1DataInsertionSuccess", actualForward.getName()); 
	}

	@Test
	@DisplayName("Page2Test")
	void testPage2() throws Exception 
	{
		when(request.getParameter("issue")).thenReturn("healthcare");
		when(request.getParameter("govtPerformance")).thenReturn("very confident");
		when(request.getParameter("opinionAboutOppParty")).thenReturn("yes");
		when(request.getParameter("eventsAttended")).thenReturn("yes");
		when(request.getParameter("measures")).thenReturn("yes");

		ActionForward expectedForward = new ActionForward();
		expectedForward.setName("page2DataInsertionSuccess"); 
		when(mapping.findForward("page2DataInsertionSuccess")).thenReturn(expectedForward);

		ActionForward actualForward =testDataInsertionController.testInsertPage2Data(mapping, request);
		assertEquals("page2DataInsertionSuccess", actualForward.getName()); 
	}

	@Test
	@DisplayName("Page3Test")
	void testPage3() throws Exception 
	{
		when(request.getParameter("socialMediaInfluence")).thenReturn("significantInfluence");
		when(request.getParameter("source")).thenReturn("social Media");
		when(request.getParameter("fakeNews")).thenReturn("yes");
		when(request.getParameter("yourViews")).thenReturn("some text");
		when(request.getParameter("futureSurvey")).thenReturn("yes");

		ActionForward expectedForward = new ActionForward();
		expectedForward.setName("page3DataInsertionSuccess"); 
		when(mapping.findForward("page3DataInsertionSuccess")).thenReturn(expectedForward);

		ActionForward actualForward =testDataInsertionController.testInsertPage3Data(mapping,request);
		assertEquals("page3DataInsertionSuccess", actualForward.getName()); 
	}

	@Tag("DataValidationTests")
	@DisplayName("DataValidationTest")
	@Test
	void testDataValidations()
	{
		when(request.getParameter("name")).thenReturn("");
		when(request.getParameter("email")).thenReturn("");
		when(request.getParameter("age")).thenReturn("0");
		when(request.getParameter("gender")).thenReturn("");
		when(request.getParameter("qualification")).thenReturn("");
		when(request.getParameter("occupation")).thenReturn("");
		when(request.getParameter("state")).thenReturn("");

		ActionErrors actionErrors = userDetailsformBean.testValidate(mapping,request);
		boolean actual = actionErrors.isEmpty();
		boolean expected =false;

		assertEquals(expected,actual,"Invalid Inputs");
	}

}
