package Domain;
public class Grade {
	
	private static final int minimumGrade = -3;
	private static final int maximumGrade = 3;

	private double value;
	private Researcher reviewer;

	public Grade(double value, Researcher reviewer) {
		this.value = value;
		this.reviewer = reviewer;
	}

	public double getValue() {
		return this.value;
	}

	public Researcher getReviewer() {
		return this.reviewer;
	}
	
	public boolean isValidValue() {
		if(value >= minimumGrade || value <= maximumGrade) {
			return true;
		}
		else
			return false;
	}

}
