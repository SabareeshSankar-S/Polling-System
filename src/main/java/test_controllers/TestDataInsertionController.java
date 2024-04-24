package test_controllers;



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

public class TestDataInsertionController extends MappingDispatchAction {

	//-----------------------------------TEST METHODS-----------------------------------------

	public ActionForward testInsertUserDetails(ActionMapping mapping,HttpServletRequest request)throws Exception 
	{
		String testName = request.getParameter("name");
		String testEmail = request.getParameter("email");
		String testAge =request.getParameter("age");
		String testGender = request.getParameter("gender");
		String testQualification = request.getParameter("qualification");
		String testOccupation = request.getParameter("occupation");
		String testState = request.getParameter("state");

		final String TESTQUERY="insert into polling_system_db.user_details "
				+ "values('"+testAge+"','"+testName+"','"+testEmail+"','"+testGender+"','"
				+testOccupation+"','"+testQualification+"','"+testState+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(TESTQUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("userDataInsertionSuccess");
		else
			return mapping.findForward("userDataInsertionFailed");
	}

	public ActionForward testInsertPage1Data(ActionMapping mapping,HttpServletRequest request)throws Exception 
	{

		String testVoterCapability = request.getParameter("voterCapability");
		String testVoteInterest = request.getParameter("voteInterest");
		String testChoice = request.getParameter("choice");
		String testFairness = request.getParameter("fairness");
		String testRatings = request.getParameter("ratings");

		final String TESTQUERY="insert into polling_system_db.page1_data "
				+ "values('"+testVoterCapability+"','"+testVoteInterest+"','"+testChoice+"','"+testFairness+"','"
				+testRatings+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(TESTQUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("page1DataInsertionSuccess");
		else
			return mapping.findForward("page1DataInsertionFailed");
	}

	public ActionForward testInsertPage2Data(ActionMapping mapping,HttpServletRequest request)throws Exception 
	{

		String testIssue = request.getParameter("issue");
		String testGovtPerformance = request.getParameter("govtPerformance");
		String testOpinion = request.getParameter("opinionAboutOppParty");
		String testEvents = request.getParameter("eventsAttended");
		String testMeasures = request.getParameter("measures");

		final String TESTQUERY="insert into polling_system_db.page2_data "
				+ "values('"+testIssue+"','"+testGovtPerformance+"','"+testOpinion+"','"+testEvents+"','"
				+testMeasures+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(TESTQUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("page2DataInsertionSuccess");
		else
			return mapping.findForward("page2DataInsertionFailed");
	}

	public ActionForward testInsertPage3Data(ActionMapping mapping,HttpServletRequest request)throws Exception  
	{
		String testSocialMediaInfluence = request.getParameter("socialMediaInfluence");
		String testSource = request.getParameter("source");
		String testFakeNews = request.getParameter("fakeNews");
		String testYourViews = request.getParameter("yourViews");
		String testFutureSurvey = request.getParameter("futureSurvey");

		final String TESTQUERY="insert into polling_system_db.page3_data "
				+ "values('"+testSocialMediaInfluence+"','"+testSource+"','"+testFakeNews+"','"+testYourViews+"','"
				+testFutureSurvey+"')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = connection.createStatement();
		int noOfRows=statement.executeUpdate(TESTQUERY);
		connection.close();
		statement.close();

		if(noOfRows==1)
			return mapping.findForward("page3DataInsertionSuccess");
		else
			return mapping.findForward("page3DataInsertionFailed");
	}

}



