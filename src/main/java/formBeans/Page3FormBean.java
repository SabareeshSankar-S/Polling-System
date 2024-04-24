package formBeans;

import org.apache.struts.action.ActionForm;

public class Page3FormBean extends ActionForm{

	private String socialMediaInfluence,source,fakeNews,yourViews,futureSurvey;

	public String getSocialMediaInfluence() {
		return socialMediaInfluence;
	}

	public void setSocialMediaInfluence(String socialMediaInfluence) {
		this.socialMediaInfluence = socialMediaInfluence;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getFakeNews() {
		return fakeNews;
	}

	public void setFakeNews(String fakeNews) {
		this.fakeNews = fakeNews;
	}

	public String getYourViews() {
		return yourViews;
	}

	public void setYourViews(String yourViews) {
		this.yourViews = yourViews;
	}

	public String getFutureSurvey() {
		return futureSurvey;
	}

	public void setFutureSurvey(String futureSurvey) {
		this.futureSurvey = futureSurvey;
	}
	
}
