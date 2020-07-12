import javax.swing.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.LinkedList;

public class Game {

    public static void main(String[] args) {
        LinkedList<Question> eventQuestions = new LinkedList<Question>();
        LinkedList<Question> peopleQuestions = new LinkedList<Question>();
        LinkedList<Question> placesQuestions = new LinkedList<Question>();
        LinkedList<Question> independenceDayHolidayQuestions = new LinkedList<Question>();


        System.out.println("Hello World!");
    }

    public void getQuestions(LinkedList<Question> list, String filePath)
    {
        String line="";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");

                String[] answers = {data[1], data[2],data[3],data[4]};
                Question q = new Question(data[0], answers, data[5]);
                list.add(q);
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
}
