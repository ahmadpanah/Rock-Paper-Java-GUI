import java.util.Random;

// Backend
public class RockPaper {
	
	private static final String[] computerChoices = {"Rock" , "Paper" , "scissors"};
	
	public int getComputerScore() {
		return computerScore;
	}


	public int getPlayerScore() {
		return playerScore;
	}


	public String getComputerChoice() {
		return computerChoice;
	}

	private String computerChoice;
	
	private int computerScore, playerScore;
	
	private Random random;
	

	
	public RockPaper() {
		random = new Random();
	}
	
	public String playRockPaper(String playerChoice) {
		computerChoice = computerChoices[random.nextInt(computerChoice.length())];
		
		String result;
		
		if (computerChoice.equals("Rock")) {
			if (playerChoice.equals("Paper")) {
				result = "Player Wins! 👍👌";
				playerScore++;
				
			} else if (playerChoice.equals("Scissors")) {
				result = "Computer Wins! 👍👌";
				computerScore++;
			} else {
				result = "Draw";
			} else if (computerChoice.equals("Paper")) {
				if (playerChoice.equals("Rock")) {
					result = "Computer Wins! 👍👌";
					computerScore++;
					
				} else if (playerChoice.equals("Scissors")) {
					result = "Player Wins! 👍👌";
					playerScore++;
				} else {
					result = "Draw";
			} else {
				if (computerChoice.equals("Scissors")) {
					if (playerChoice.equals("Rock")) {
						result = "Player Wins! 👍👌";
						playerScore++;
						
					} else if (playerChoice.equals("Paper")) {
						result = "Computer Wins! 👍👌";
						computerScore++;
					} else {
						result = "Draw";
			}
		}
				
				return result;
		
	}

}
