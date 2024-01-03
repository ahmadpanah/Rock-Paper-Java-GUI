import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

// Frontend
public class RockPaperGUI extends JFrame {
	
	JButton rockBtn, paperBtn, scissorBtn;
	
	JLabel computerChoice;
	
	public RockPaperGUI() {
		super("Rock Paper Game");
		
		setSize(450,574);
		
		setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		addGuiComponents();
	}

	private void addGuiComponents() {
		// TODO Auto-generated method stub
		JLabel computerScoreLabel = new JLabel ("Computer: 0");
		computerScoreLabel.setBounds(0, 43, 450, 30);
		computerScoreLabel.setFont(new Font("Dialog" , Font.BOLD, 26));
		computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(computerScoreLabel);
		
		computerChoice = new JLabel("?");
		computerChoice.setBounds(175, 118, 100, 80);
		computerChoice.setFont(new Font("Dialog" , Font.PLAIN, 18));
		computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
		computerChoice.setBorder(BorderFactory.createLineBorder(Color.pink));
		add(computerChoice);
		
		JLabel playerScoreLabel = new JLabel ("Player: 0");
		playerScoreLabel.setBounds(0, 317, 450, 30);
		playerScoreLabel.setFont(new Font("Dialog" , Font.BOLD, 26));
		playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(playerScoreLabel);
		
		rockBtn = new JButton("Rock");
		rockBtn.setBounds(40, 387, 105, 80);
		rockBtn.setFont(new Font("Dialog" , Font.PLAIN, 18));
		add(rockBtn);
		
		paperBtn = new JButton("Paper");
		paperBtn.setBounds(165, 387, 105, 80);
		paperBtn.setFont(new Font("Dialog" , Font.PLAIN, 18));
		add(paperBtn);
		
		scissorBtn = new JButton("Scissor");
		scissorBtn.setBounds(290, 387, 105, 80);
		scissorBtn.setFont(new Font("Dialog" , Font.PLAIN, 18));
		add(scissorBtn);
		
		showDialog("Test Meesage");
		
	}
	
	private void showDialog(String message) {
		JDialog resultDialog = new JDialog(this, "Result", true);
		resultDialog.setSize(227,125);
		resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		resultDialog.setResizable(false);
		
		JLabel resultLabel = new JLabel(message);
		resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultDialog.add(resultLabel, BorderLayout.CENTER);
		
		// Try Again Button
		JButton tryAgainBtn = new JButton("Try Again?");
		tryAgainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					computerChoice.setText("?");
					resultDialog.dispose();
			}
		});
		resultDialog.add(tryAgainBtn, BorderLayout.SOUTH);
		
		resultDialog.setLocationRelativeTo(this);
		resultDialog.setVisible(true);
	}
}
