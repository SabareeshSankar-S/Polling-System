import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import formBeans.UserDetailsFormBean;
import net.bytebuddy.build.ToStringPlugin.Exclude;
import test_controllers.TestChangeLanguageController;
import test_controllers.TestDataInsertionController;

class ChangeLanguageControllerTest {

	TestChangeLanguageController changeLanguageController;
	HttpServletRequest request;
	HttpServletResponse response;

	@BeforeEach
	public void setup()
	{
		changeLanguageController = new TestChangeLanguageController();
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
	}
	
	@Test
	void testLanguage() throws Exception
	{
		when(request.getParameter("language")).thenReturn("en");
		String actual = changeLanguageController.execute( request, response);
		String expected ="English";
		
		assertEquals(expected, actual,"Error in the method");
	}

}
