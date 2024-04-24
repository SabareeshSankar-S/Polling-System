package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReportsCalculatorService {

	int precision = 2;

	public double getVotersPercentage(List<String> voterCapabilityList)
	{
		Double count=0.0,percentage=0.0;

		for(String capability : voterCapabilityList)
			if(capability.equalsIgnoreCase("yes"))
				count++;

		percentage = Double.parseDouble( String.format("%." + precision + "f", (count/voterCapabilityList.size())*100));
		return percentage;
	}

	public double getVotingInterest(List<String> voterInterestList)
	{
		double count=0.0,percentage=0.0;

		for(String interest : voterInterestList)
			if(interest.equalsIgnoreCase("yes"))
				count++;

		percentage = Double.parseDouble( String.format("%." + precision + "f", (count/voterInterestList.size())*100));
		return percentage;
	}

	public Map<String,Double> getChoicePercentage(List<String> choiceList)
	{
		Double dmkCount=0.0,bjpCount=0.0,admkCount=0.0,congressCount=0.0,
				dmkPercentage=0.0,admkPercentage=0.0,bjpPercentage=0.0,congressPercentage=0.0;

		for(String choice : choiceList)
		{
			if(choice.equalsIgnoreCase("dmk"))
				dmkCount++;
			if(choice.equalsIgnoreCase("admk"))
				admkCount++;
			if(choice.equalsIgnoreCase("bjp"))
				bjpCount++;
			if(choice.equalsIgnoreCase("congress"))
				congressCount++;
		}

		dmkPercentage = Double.parseDouble( String.format("%." + precision + "f", (dmkCount/choiceList.size())*100));
		admkPercentage = Double.parseDouble( String.format("%." + precision + "f", (admkCount/choiceList.size())*100));
		bjpPercentage = Double.parseDouble( String.format("%." + precision + "f", (bjpCount/choiceList.size())*100));
		congressPercentage = Double.parseDouble( String.format("%." + precision + "f", (congressCount/choiceList.size())*100));

		Map<String,Double> choicePercentageMap = new LinkedHashMap();

		choicePercentageMap.put("D.M.K", dmkPercentage);
		choicePercentageMap.put("A.D.M.K", admkPercentage);
		choicePercentageMap.put("B.J.P", bjpPercentage);
		choicePercentageMap.put("Congress", congressPercentage);

		return choicePercentageMap;
	}

	public Map<String,Double> getTrustPercentage(List<String> fairnessList, List<String> govtPerformanceList)
	{
		double veryConfidentCount=0.0,somewhatConfidentCount=0.0,noConfidentCount=0.0,
				veryConfidentPercentage=0.0,somewhatConfidentPercentage=0.0,noConfidentPercentage=0.0;

		for(String fairness : fairnessList)
		{
			if(fairness.equalsIgnoreCase("very confident"))
				veryConfidentCount++;
			if(fairness.equalsIgnoreCase("somewhat confident"))
				somewhatConfidentCount++;
			if(fairness.equalsIgnoreCase("not confident"))
				noConfidentCount++;
		}

		for(String performance :govtPerformanceList)
		{
			if(performance.equalsIgnoreCase("very confident"))
				veryConfidentCount++;
			if(performance.equalsIgnoreCase("somewhat confident"))
				somewhatConfidentCount++;
			if(performance.equalsIgnoreCase("not confident"))
				noConfidentCount++;	
		}

		veryConfidentPercentage = Double.parseDouble( String.format("%." + precision + "f", (veryConfidentCount/(fairnessList.size()+govtPerformanceList.size()))*100));
		somewhatConfidentPercentage = Double.parseDouble( String.format("%." + precision + "f", (somewhatConfidentCount/(fairnessList.size()+govtPerformanceList.size()))*100));
		noConfidentPercentage = Double.parseDouble( String.format("%." + precision + "f", (noConfidentCount/(fairnessList.size()+govtPerformanceList.size()))*100));

		Map<String,Double> trustPercentageMap = new LinkedHashMap();

		trustPercentageMap.put("Very Confident", veryConfidentPercentage);
		trustPercentageMap.put("Somewhat Confident", somewhatConfidentPercentage);
		trustPercentageMap.put("Not Confident", noConfidentPercentage);

		return trustPercentageMap;
	}

	public double getawarenessPercentage(List<String> measuresList, List<String> eventsAttendedList,
			List<Integer> ratingsList) {

		double count=0.0,percentage=0.0;

		for(String measure : measuresList)
			if(measure.equalsIgnoreCase("yes"))
				count++;

		for(String event : eventsAttendedList)
			if(event.equalsIgnoreCase("yes"))
				count++;

		for(Integer rating : ratingsList)
			if(rating.equals(4) || rating.equals(5))
				count++;

		percentage = Double.parseDouble( String.format("%." + precision + "f", (count/(measuresList.size()+eventsAttendedList.size()+ratingsList.size()))*100));
		return percentage;
	}

	public Map<String,Double> getSourcePercentage(List<String> sourceList) {

		double newsChannelCount=0.0,socialMediaCount=0.0,friendsAndFamilyCount=0.0,ralliesCount=0.0,
				newsChannelPercentage=0.0,socialMediaPercentage=0.0,friendsAndFamilyPercentage=0.0,ralliesPercentage=0.0;
		for(String source : sourceList)
		{
			if(source.equalsIgnoreCase("news channels"))
				newsChannelCount++;
			if(source.equalsIgnoreCase("social media"))
				socialMediaCount++;
			if(source.equalsIgnoreCase("friends and family"))
				friendsAndFamilyCount++;
			if(source.equalsIgnoreCase("Political Rallies/Events"))
				ralliesCount++;	
		}

		newsChannelPercentage =Double.parseDouble( String.format("%." + precision + "f", (newsChannelCount/sourceList.size())*100));
		socialMediaPercentage =Double.parseDouble( String.format("%." + precision + "f", (socialMediaCount/sourceList.size())*100));
		friendsAndFamilyPercentage =Double.parseDouble( String.format("%." + precision + "f", (friendsAndFamilyCount/sourceList.size())*100));
		ralliesPercentage =Double.parseDouble( String.format("%." + precision + "f", (ralliesCount/sourceList.size())*100));

		Map<String,Double> sourcePercentageMap = new LinkedHashMap();

		sourcePercentageMap.put("News Channels", newsChannelPercentage);
		sourcePercentageMap.put("Social Media", socialMediaPercentage);
		sourcePercentageMap.put("Friends and family", friendsAndFamilyPercentage);
		sourcePercentageMap.put("Political Rallies/Events", ralliesPercentage);
		return sourcePercentageMap;	
	}

	public Map<String,Double> getGenderPercentage(List<String> genderList) {

		double maleCount=0.0,femaleCount=0.0,malePercentage=0.0,femalePercentage=0.0;

		for(String gender : genderList)
		{
			if(gender.equalsIgnoreCase("male"))
				maleCount++;
			if(gender.equalsIgnoreCase("female"))
				femaleCount++;
		}

		malePercentage = Double.parseDouble( String.format("%." + precision + "f", (maleCount/genderList.size())*100));
		femalePercentage = Double.parseDouble( String.format("%." + precision + "f", (femaleCount/genderList.size())*100));

		Map<String,Double> genderPercentageMap = new LinkedHashMap();

		genderPercentageMap.put("Male", malePercentage);
		genderPercentageMap.put("Female", femalePercentage);

		return genderPercentageMap;
	}

}
