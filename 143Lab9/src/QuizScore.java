

public class QuizScore implements Cloneable {

	private int score;
	

	public QuizScore(QuizScore newScore) {
		this.setScore(newScore.getScore());
	}
	
	@Override
	public QuizScore clone(){
		return new QuizScore(this);
	}
	
	public QuizScore(int score) {	
		this.setScore(score);	
		
	}
	
	public int getScore() {	
		return this.score;	
		
	}
	
	public void setScore(int score) {	
		this.score = score;
		
	}
}