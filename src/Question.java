public class Question {

    private String question;
    private String answers[] = new String[4];
    private String correctAnswer;

    public Question(String question, String[] answers, String correctAnswer)
    {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(String playerAnswer)
    {
        System.out.println("Comparing player answer '"+playerAnswer+"' with correct answer");
        return playerAnswer.equals(this.correctAnswer);
    }

    public void printQuestion()
    {
        System.out.println(this.question);
        System.out.println("a. "+answers[0]);
        System.out.println("b. "+answers[1]);
        System.out.println("c. "+answers[2]);
        System.out.println("d. "+answers[3]);
    }

}
