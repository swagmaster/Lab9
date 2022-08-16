import java.util.ArrayList;


public class QuizTracker implements Cloneable {

	private ArrayList<QuizScore> listOfScores = new ArrayList<QuizScore>();
	private ArrayList<QuizScore> copyOfScores = new ArrayList<QuizScore>();
	
	
	public QuizTracker(QuizTracker newQT) {
		for (QuizScore qs : listOfScores) {
			copyOfScores.add(qs.clone());
		}
	}
	
	@Override
	public QuizTracker clone() {
		return new QuizTracker(this);
	}
	
	public void add(QuizScore newScore) {
		listOfScores.add(newScore.clone());
	}
}
