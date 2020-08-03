import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class QuestionBank
{

    private final  String filePath;
    private LinkedList<Question> questions;

    public QuestionBank(String filePath)
    {
        questions = new LinkedList<Question>();
        this.filePath = filePath;
        
        fillQuestionBank();
    }

    //store questions to question bank
    public void fillQuestionBank()
    {
        String line="";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(this.filePath));
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");

                String[] answers = {data[1], data[2],data[3],data[4]};
                Question q = new Question(data[0], answers, data[5]);
                this.questions.add(q);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public Question getQuestion() {

        int max = this.questions.size();
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;

        return this.questions.get(rand);
    }

}
