package formBeans;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserDetailsFormBean extends ActionForm{

	private String name,email,gender,qualification,occupation,state;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) 
	{
		ActionErrors actionErrors = new ActionErrors();
		
		if(name.equals(""))
			actionErrors.add("nameError", new ActionMessage("nameErrorMsg"));
		if(email.equals(""))
			actionErrors.add("emailError", new ActionMessage("emailErrorMsg"));
		if(gender.equals(""))
			actionErrors.add("genderError", new ActionMessage("genderErrorMsg"));
		if(qualification.equals(""))
			actionErrors.add("qualificationError", new ActionMessage("qualificationErrorMsg"));
		if(occupation.equals(""))
			actionErrors.add("occupationError", new ActionMessage("occupationErrorMsg"));
		if(state.equals(""))
			actionErrors.add("stateError", new ActionMessage("stateErrorMsg"));
		if(age==0)
			actionErrors.add("ageError", new ActionMessage("ageErrorMsg"));
		
		return actionErrors ;	
	}
	
	public ActionErrors testValidate(ActionMapping mapping, HttpServletRequest request) 
	{
		ActionErrors actionErrors = new ActionErrors();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String age =request.getParameter("age");
		String gender = request.getParameter("gender");
		String qualification = request.getParameter("qualification");
		String occupation = request.getParameter("occupation");
		String state = request.getParameter("state");
		
		if(name.equals(""))
			actionErrors.add("nameError", new ActionMessage("nameErrorMsg"));
		if(email.equals(""))
			actionErrors.add("emailError", new ActionMessage("emailErrorMsg"));
		if(gender.equals(""))
			actionErrors.add("genderError", new ActionMessage("genderErrorMsg"));
		if(qualification.equals(""))
			actionErrors.add("qualificationError", new ActionMessage("qualificationErrorMsg"));
		if(occupation.equals(""))
			actionErrors.add("occupationError", new ActionMessage("occupationErrorMsg"));
		if(state.equals(""))
			actionErrors.add("stateError", new ActionMessage("stateErrorMsg"));
		if(age.equals("0"))
			actionErrors.add("ageError", new ActionMessage("ageZeroMsg"));
	
		return actionErrors ;
	}

}
