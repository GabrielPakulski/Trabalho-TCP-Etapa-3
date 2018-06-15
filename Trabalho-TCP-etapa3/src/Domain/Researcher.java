package Domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Researcher {

	private int id;
	private String name;
	private Affiliation affiliation;
	private ArrayList <SearchTopics> searchTopics;
	private Article article;
	private LinkedList <Article> reviewedArticles;

	
	public Researcher(int id, String name, Affiliation affiliation, ArrayList <SearchTopics> searchTopics) {
		this.id = id;
		this.name = name;
		this.affiliation = affiliation;
		this.searchTopics = searchTopics;
	}

	public int getReasercherID() {
		return this.id;
	}

	public ArrayList<SearchTopics> getSearchTopics() {
		return this.searchTopics;
	}

	public Affiliation getAffiliation() {
		return this.affiliation;
	}

	public List<Article> getReviewedArticles() {
		return this.reviewedArticles;
	}

	public void setReviewedArticles(Article reviewedArticle) {
		reviewedArticles.add(reviewedArticle);
	}

}
