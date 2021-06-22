import java.security.SecureRandom;
import java.awt.*;
import javax.swing.*;
public class miracle8 {

	
		// TODO Auto-generated method stub
		private final static SecureRandom randomNumber = new SecureRandom();
	    private final static String answers[] = {
	            "yes",
	            "no",
	            "Yes i think so",
	            "Absolutely",
	            "Your future is cloudy ",
	            "As I see it, yes",
	            "Not likely",
	            "Outlook good",
	           };
	    private final static ImageIcon image = new ImageIcon("8ball_small.jpg");

	    public static void main(String[] args) {
	        boolean askQuestion = true;

	        while (askQuestion) {
	            String question = getUserQuestion();
	            String randomAnswer = getRandomAnswer();
	            	
	            			
	            displayAnswer(question, randomAnswer);

	            askQuestion = userWantsToAskAnotherQuestion();
	        }

	        showExitMessage();
	    }

	    private static String getUserQuestion() {
	        return JOptionPane.showInputDialog(null,
	                "PLease enter a question:",
	                "WELCOME: Magic Miracle!",
	                JOptionPane.INFORMATION_MESSAGE
	                );
	    }

	    private static String getRandomAnswer() {
	  
	        return answers[randomNumber.nextInt(answers.length)];
	        
	    }

	    private static void displayAnswer(String question, String randomAnswer) {
	        JOptionPane.showMessageDialog(null, question + "\n" + randomAnswer, "MagicOracle has responded.", JOptionPane.INFORMATION_MESSAGE, image);
	    }

	    private static boolean userWantsToAskAnotherQuestion() {
	        return 0 == JOptionPane.showConfirmDialog(null, "", "Would you like to ask again?", JOptionPane.YES_NO_OPTION, 0,
	        		image);
	    }

	    private static void showExitMessage() {
	        JOptionPane.showMessageDialog(null, "MAGICORACLE", "Goodbye! Your answers have been answerd.", JOptionPane.PLAIN_MESSAGE);
	    }
	}

