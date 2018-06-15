package Domain;
import java.util.ArrayList;
import java.util.List;

import Actions.GradeAssignment;

public class Article {

	private int id;
	private String title;
	private Researcher author;
	private SearchTopics searchTopic;
	private ArrayList <Grade> grades;
	private GradeAssignment gradeAssignment;
	private Conference conference;
	private ArrayList <Researcher> reviewers;
	private ArticleStatus status;
	
	public Article(int id, String title, Researcher author, Conference conference, SearchTopics searchTopic) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.searchTopic = searchTopic;
		this.conference = conference;
	}

	public Conference getConference() {
		return this.conference;
	}

	public SearchTopics getSearchTopic() {
		return this.searchTopic;
	}

	public List<Researcher> getReviewers() {
		return this.reviewers;
	}
	
// ATENTAR PARA EXCEPTION DE FALTA DE MEMÓRIA
	public void addReviewers(Researcher reviewer) {
		reviewers.add(reviewer);
	}

	public double calculateAverage() {
		double average = 0;
		int count = 0;
		for(Grade i : grades) {
			count++;
			average += i.getValue();
		}
		return average/count;
	}
	

	public boolean hasReceivedAllGrades(int numberOfGrades) {
		boolean validator = false;
		for(Grade i : grades) {
			if (i.isValidValue())
				validator = true;
			else
				validator = false;
		}
		if(grades.size() == numberOfGrades)
			return validator;
		else
			return false;
	}

	public void saveGrade(Grade grade) {
		grades.add(grade);
	}

	// percorre todas as grades e atualiza o status do artigo
	public void setArticleStatus() {
		if(this.status == null) {
			if(calculateAverage() >= 0)
				this.status = ArticleStatus.ACCEPTED;
			else
				this.status = ArticleStatus.REJECTED;
		}
	}

	public ArticleStatus getArticleStatus() {
		return this.status;
	}
}
