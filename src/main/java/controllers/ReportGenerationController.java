package controllers;

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

public class ReportGenerationController extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		ReportsCalculatorService service = new ReportsCalculatorService();

		//WELCOME PAGE
		List<String> genderList = new ArrayList<String>();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement =con.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from polling_system_db.user_details");
		while(resultSet.next())
		{	
			String gender=resultSet.getString("gender");
			genderList.add(gender);
		}

		Map<String,Double> genderPercentageMap = service.getGenderPercentage(genderList);
		request.setAttribute("genderPercentageMap", genderPercentageMap);

		//PAGE 1
		List<String> voterCapabilityList = new ArrayList<String>();
		List<String> voterInterestList = new ArrayList<String>();
		List<String> choiceList = new ArrayList<String>();
		List<String> fairnessList = new ArrayList<String>();
		List<Integer> ratingsList = new ArrayList<Integer>();

		resultSet=statement.executeQuery("select * from polling_system_db.page1_data");
		while(resultSet.next())
		{
			String voterCapability = resultSet.getString("voterCapability");
			voterCapabilityList.add(voterCapability);

			String voterInterest = resultSet.getString("voteInterest");
			voterInterestList.add(voterInterest);

			String choice = resultSet.getString("choice");
			choiceList.add(choice);

			String fairness = resultSet.getString("fairness");
			fairnessList.add(fairness);

			int ratings = resultSet.getInt("ratings");
			ratingsList.add(ratings);
		}

		double registeredVotersPercentage = service.getVotersPercentage(voterCapabilityList);
		request.setAttribute("registeredVotersPercentage", registeredVotersPercentage);

		double voterInterestPercentage = service.getVotingInterest(voterInterestList);
		request.setAttribute("voterInterestPercentage", voterInterestPercentage);

		Map<String,Double> choicePercentageMap = service.getChoicePercentage(choiceList);
		request.setAttribute("choicePercentageMap", choicePercentageMap);

		//PAGE 2
		List<String> govtPerformanceList = new ArrayList<String>();
		List<String> eventsAttendedList = new ArrayList<String>();
		List<String> measuresList = new ArrayList<String>();

		resultSet=statement.executeQuery("select * from polling_system_db.page2_data");
		while(resultSet.next())
		{
			String govtPerformance = resultSet.getString("govtPerformance");
			govtPerformanceList.add(govtPerformance);

			String eventsAttended = resultSet.getString("eventsAttended");
			eventsAttendedList.add(eventsAttended);

			String measures = resultSet.getString("measures");
			measuresList.add(measures);
		}
		Map<String,Double> trustPercentageMap = service.getTrustPercentage(fairnessList,govtPerformanceList);
		request.setAttribute("trustPercentageMap", trustPercentageMap);

		double awarenessPercentage = service.getawarenessPercentage(measuresList,eventsAttendedList,ratingsList);
		request.setAttribute("awarenessPercentage", awarenessPercentage);

		//PAGE 3
		List<String> sourceList = new ArrayList<String>();

		resultSet=statement.executeQuery("select * from polling_system_db.page3_data");
		while(resultSet.next())
		{
			String source = resultSet.getString("source");
			sourceList.add(source);
		}

		Map<String,Double> sourcePercentageMap = service.getSourcePercentage(sourceList);
		request.setAttribute("sourcePercentageMap", sourcePercentageMap);

		con.close();
		statement.close();
		return mapping.findForward("reportGenerated");
	}
}

