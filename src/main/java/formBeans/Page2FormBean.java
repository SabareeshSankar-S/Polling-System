package formBeans;

import org.apache.struts.action.ActionForm;

public class Page2FormBean extends ActionForm{

	private String issue,govtPerformance,opinionAboutOppParty,eventsAttended,measures;

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getGovtPerformance() {
		return govtPerformance;
	}

	public void setGovtPerformance(String govtPerformance) {
		this.govtPerformance = govtPerformance;
	}

	public String getOpinionAboutOppParty() {
		return opinionAboutOppParty;
	}

	public void setOpinionAboutOppParty(String opinionAboutOppParty) {
		this.opinionAboutOppParty = opinionAboutOppParty;
	}

	public String getEventsAttended() {
		return eventsAttended;
	}

	public void setEventsAttended(String eventsAttended) {
		this.eventsAttended = eventsAttended;
	}

	public String getMeasures() {
		return measures;
	}

	public void setMeasures(String measures) {
		this.measures = measures;
	}
	
}
