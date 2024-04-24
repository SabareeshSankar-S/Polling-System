package formBeans;

import org.apache.struts.action.ActionForm;

public class Page1FormBean extends ActionForm{

	private String voterCapability,voteInterest,choice,fairness;
	private int ratings;
	
	public String getVoterCapability() {
		return voterCapability;
	}
	public void setVoterCapability(String voterCapability) {
		this.voterCapability = voterCapability;
	}
	public String getVoteInterest() {
		return voteInterest;
	}
	public void setVoteInterest(String voteInterest) {
		this.voteInterest = voteInterest;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public String getFairness() {
		return fairness;
	}
	public void setFairness(String fairness) {
		this.fairness = fairness;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
}
