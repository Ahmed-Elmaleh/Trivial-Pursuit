import java.util.ArrayList;
import java.util.HashMap;

public class QuestionBank {

	public QuestionBank(String fileName) {
		this.questionBank = new HashMap<String, ArrayList<Question>>();
		this.fileName = fileName;
		
		 getAndStoreQuestion();
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public HashMap<String, ArrayList<Question>> getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(HashMap<String, ArrayList<Question>> questionBank) {
		this.questionBank = questionBank;
	}

	//store question to question bank
	public void getAndStoreQuestion() {
		
	}
	
	//getQuestion
	public String getQuestion(String color) {
		return "Here is the question";
	}
	
	
	private String fileName;
	private HashMap<String, ArrayList<Question>> questionBank;
}
