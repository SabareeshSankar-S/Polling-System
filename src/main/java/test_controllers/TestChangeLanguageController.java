package test_controllers;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestChangeLanguageController extends Action{

	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		String language = request.getParameter("language");
		Locale locale = new Locale(language);
		return locale.getDisplayName();
	}

}
