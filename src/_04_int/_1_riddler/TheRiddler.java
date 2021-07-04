package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		String input= JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
				if (input.equalsIgnoreCase("towel")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					score++;
				}
		
		// 5. Otherwise, say "wrong" and tell them the answer
				else {
			JOptionPane.showMessageDialog(null, "Wrong!");
				}
		// 6. Add some more riddles
				input= JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
				if(input.equalsIgnoreCase("Man")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					score++;
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Wrong!");
				}
				
				input=JOptionPane.showInputDialog("Take off my skin - I won't cry, but you will! What am I? ");
						if(input.equalsIgnoreCase("Onion")) {
							JOptionPane.showMessageDialog(null, "Correct!");
							score++;
						}
						
						else{
							JOptionPane.showMessageDialog(null, "Wrong!");
						}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score "+ score);
	}
}

