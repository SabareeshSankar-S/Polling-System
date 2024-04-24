package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import antlr.collections.List;
import formBeans.Page1FormBean;
import formBeans.Page2FormBean;
import formBeans.Page3FormBean;
import formBeans.UserDetailsFormBean;

public class DataInsertionController extends MappingDispatchAction {

	public ActionForward insertUserDetails(ActionMapping mapping, ActionForm formBean, 
			HttpServletRequest request,
			HttpServletResponse response)throws Exception 
	{
		UserDetailsFormBean userDetails= (UserDetailsFormBean)formBean;
		int age = userDetails.getAge();
		String name = userDetails.getName();
		String email = userDetails.getEmail();
		String gender = userDetails.getGender();
		String occupation = userDetails.getOccupation();
		String qualification = userDetails.getQualification();
		String state = userDetails.getState();

		final String QUERY="insert into polling_system_db.user_details "
				+ "values('"+age+"','"+name+"','"+email+"','"+gender+"','"
				+occupation+"','"+qualification+"','"+state+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(QUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("userDataInsertionSuccess");
		else
			return mapping.findForward("userDataInsertionFailed");
	}

	public ActionForward insertPage1Data(ActionMapping mapping, ActionForm formBean, 
			HttpServletRequest request,
			HttpServletResponse response)throws Exception 
	{
		Page1FormBean page1FormBean= (Page1FormBean)formBean;
		String voterCapability = page1FormBean.getVoterCapability();
		String voteInterest = page1FormBean.getVoteInterest();
		String choice = page1FormBean.getChoice();
		String fairness = page1FormBean.getFairness();
		int ratings = page1FormBean.getRatings();

		final String QUERY="insert into polling_system_db.page1_data "
				+ "values('"+voterCapability+"','"+voteInterest+"','"+choice+"','"+fairness+"','"
				+ratings+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(QUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("page1DataInsertionSuccess");
		else
			return mapping.findForward("page1DataInsertionFailed");
	}

	public ActionForward insertPage2Data(ActionMapping mapping, ActionForm formBean, 
			HttpServletRequest request,
			HttpServletResponse response)throws Exception 
	{
		Page2FormBean page2Formbean = (Page2FormBean)formBean;
		String issue = page2Formbean.getIssue();
		String govtPerformance = page2Formbean.getGovtPerformance();
		String opinionAboutOppParty = page2Formbean.getOpinionAboutOppParty();
		String eventsAttended = page2Formbean.getEventsAttended();
		String measures = page2Formbean.getMeasures();

		final String QUERY="insert into polling_system_db.page2_data "
				+ "values('"+issue+"','"+govtPerformance+"','"+opinionAboutOppParty+"','"
				+eventsAttended+"','"+measures+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(QUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("page2DataInsertionSuccess");
		else
			return mapping.findForward("page2DataInsertionFailed");
	}

	public ActionForward insertPage3Data(ActionMapping mapping, ActionForm formBean, 
			HttpServletRequest request,
			HttpServletResponse response)throws Exception 
	{
		Page3FormBean page3FormBean= (Page3FormBean)formBean;
		String socialMediaInfluence = page3FormBean.getSocialMediaInfluence();
		String source = page3FormBean.getSource();
		String fakeNews = page3FormBean.getFakeNews();
		String yourViews = page3FormBean.getYourViews();
		String futureSurvey = page3FormBean.getFutureSurvey();

		final String QUERY="insert into polling_system_db.page3_data "
				+ "values('"+socialMediaInfluence+"','"+source+"','"+fakeNews+"','"+yourViews+"','"
				+futureSurvey+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(QUERY);
		System.out.println(noOfRows+" inserted");
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("page3DataInsertionSuccess");
		else
			return mapping.findForward("page3DataInsertionFailed");
	}
}

