package Domain;

import java.util.ArrayList;
import java.util.List;

public class Conference {

	private String initials;
	private ArrayList<Researcher> committeeMembers;
	private ArrayList<Article> sumbmittedArticles;

	public Conference(String initials, ArrayList<Researcher> researchers, ArrayList<Article> submittedArticles) {
		this.initials = initials;
		this.committeeMembers = researchers;
		this.sumbmittedArticles = submittedArticles;
	}

	public List<Researcher> getResearchers() {
		return this.committeeMembers;
	}

	public List<Article> getSubmittedArticles() {
		return this.getSubmittedArticles();
	}

	public boolean isConferenceAllocated() {
		return false;
	}

	public boolean allArticlesHaveGrades(int numberOfGrades) {
		boolean validator = false;
		for(Article i : sumbmittedArticles) {
			if(i.hasReceivedAllGrades(numberOfGrades))
				validator = true;
			else
				return false;
		}
		return validator;
	}

}
