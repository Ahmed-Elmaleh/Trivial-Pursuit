
import java.awt.EventQueue;


public class Game {
   
    public static void main(String[] args) {
    	
    	Game newGame = new Game();
    	newGame.run();
    	
    }
    
    
    public void run() {
    	

    	/**
         * Launch the application.
         */
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	
    	
    	
//        LinkedList<Question> eventQuestions = new LinkedList<Question>();
//        LinkedList<Question> peopleQuestions = new LinkedList<Question>();
//        LinkedList<Question> placesQuestions = new LinkedList<Question>();
//        LinkedList<Question> independenceDayHolidayQuestions = new LinkedList<Question>();
        
        

    }

    public void createAndShowGUI() throws Exception {
 	    View view = new View();
        Controller c = new Controller(view);
        c.runController();
 	}
 	
  
    
    

	
 	
 	
 	
 	
 	
 	
 	
//    private void getQuestions(LinkedList<Question> list, String filePath)
//    {
//        String line="";
//        try
//        {
//            BufferedReader br = new BufferedReader(new FileReader(filePath));
//            while ((line = br.readLine()) != null)
//            {
//                String[] data = line.split(",");
//
//                String[] answers = {data[1], data[2],data[3],data[4]};
//                Question q = new Question(data[0], answers, data[5]);
//                list.add(q);
//            }
//        }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }
//    
    
	
}
