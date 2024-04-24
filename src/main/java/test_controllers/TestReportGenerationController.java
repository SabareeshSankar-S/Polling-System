package test_controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.RequestProcessor;

import services.ReportsCalculatorService;

public class TestReportGenerationController extends Action{

	//----------------------------- TEST METHODS -------------------------------------------------
	
	int testCases=4;
	ReportsCalculatorService service = new ReportsCalculatorService();
	
	public Map<String, Double> testGenderPercentage(HttpServletRequest request,ActionMapping mapping) 
	{
		List<String> genderList = new ArrayList<String>();

		for(int i=1;i<=testCases;i++)
		{
			String gender =request.getParameter("gender"+i);
			genderList.add(gender);
		}
		return service.getGenderPercentage(genderList);
	}

	public Map<String, Double> testSourcePercentage(HttpServletRequest request,ActionMapping mapping) 
	{
		List<String> sourceList = new ArrayList<String>();
		for(int i=1;i<=testCases;i++)
		{
			String source =request.getParameter("source"+i);
			sourceList.add(source);
		}
		return service.getSourcePercentage(sourceList);
	}

	public Map<String, Double> testtrustPercentage(HttpServletRequest request,ActionMapping mapping) 
	{
		List<String> fairnessList = new ArrayList<String>();
		List<String> govtPerformanceList = new ArrayList<String>();

		for(int i=1;i<=testCases;i++)
		{
			String performance =request.getParameter("govtPerformance"+i);
			govtPerformanceList.add(performance);
		}

		for(int i=1;i<=testCases;i++)
		{
			String fairness =request.getParameter("fairness"+i);
			fairnessList.add(fairness);
		}
		return service.getTrustPercentage(fairnessList,govtPerformanceList);

	}

	public Map<String, Double> testChoicePercentage(HttpServletRequest request,ActionMapping mapping) 
	{
		List<String> choiceList = new ArrayList<String>();

		for(int i=1;i<=testCases;i++)
		{
			String choice =request.getParameter("choice"+i);
			choiceList.add(choice);
		}
		return service.getChoicePercentage(choiceList);
	}

	public double testRegVotersPercentage(HttpServletRequest request,ActionMapping mapping) 
	{

		List<String> voterCapabilityList = new ArrayList<String>();
		for(int i=1;i<=testCases;i++)
		{
			String gender =request.getParameter("voterCapability"+i);
			voterCapabilityList.add(gender);
		}
		return service.getVotersPercentage(voterCapabilityList);
	}

	public double testVotersInterestPercentage(HttpServletRequest request,ActionMapping mapping) 
	{
		List<String> voterInterestList = new ArrayList<String>();
		for(int i=1;i<=testCases;i++)
		{
			String voteInterest =request.getParameter("voterInterest"+i);
			voterInterestList.add(voteInterest);
		}
		return service.getVotingInterest(voterInterestList);
	}


	public double testAwarenessPercentage(HttpServletRequest request,ActionMapping mapping) 
	{
		List<Integer> ratingsList = new ArrayList();
		List<String> eventsAttendedList = new ArrayList<String>();
		List<String> measuresList = new ArrayList<String>();

		for(int i=1;i<=testCases;i++)
		{
			String rating =request.getParameter("rating"+i);
			ratingsList.add(Integer.parseInt(rating));
		}

		for(int i=1;i<=testCases;i++)
		{
			String events =request.getParameter("eventsAttended"+i);
			eventsAttendedList.add(events);
		}

		for(int i=1;i<=testCases;i++)
		{
			String measures =request.getParameter("measures"+i);
			measuresList.add(measures);
		}
		return service.getawarenessPercentage(measuresList,eventsAttendedList,ratingsList);
	}

}

