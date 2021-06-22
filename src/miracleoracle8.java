import java.awt.EventQueue;
import java.security.SecureRandom;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class miracleoracle8 {

	private JFrame frmMagicOracle;
	private JTextField txtquestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miracleoracle8 window = new miracleoracle8();
					window.frmMagicOracle.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public miracleoracle8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMagicOracle = new JFrame();
		frmMagicOracle.getContentPane().setBackground(new Color(175, 238, 238));
		frmMagicOracle.setTitle("MAGIC ORACLE");
		frmMagicOracle.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Question:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtquestion = new JTextField();
		txtquestion.setForeground(Color.BLACK);
		txtquestion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtquestion.setColumns(10);
		
		JButton btnNewButton = new JButton("Consult The Oracle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answers[] = {"It is certain", "It is decidedly so", "Without a doubt",
			            "Yes - definitely", "You may rely on it", "As I see it, yes",
			            "Most likely", "Outlook good", "Signs point to yes",
			            "Yes", "Reply hazy, try again", "Ask again later",
			            "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
			            "Don't count on it", "My reply is no", "My sources say no",
			            "Outlook not so good", "Very doubtful"};

			        //constructs a random number generator 
			        SecureRandom randomNumber = new SecureRandom();
			       

			        //while loop allows the user to continue asking questions until they click no
			       
			            //prompts the user to enter a question 
			            String question = txtquestion.getText();
			                    
			            //displays the answer
			            if(question != "") {
			                JOptionPane.showMessageDialog(null, question + "\n" + answers[randomNumber.nextInt(answers.length)], 
			                "The Magic-8 Ball has responded.", JOptionPane.INFORMATION_MESSAGE);
			             JOptionPane.showConfirmDialog(null, "AM STILL MIRACLE 8", "Would you like to ask again?", 
			                    JOptionPane.ERROR_MESSAGE, 0);}                           
			        
			        		else {
			        				JOptionPane.showMessageDialog(null, "MiracleOracle", "Goodbye! You don't have a question.", 
				                JOptionPane.PLAIN_MESSAGE);}
			            

				        //displays name after user enters no
				        JOptionPane.showMessageDialog(null, "MiracleOracle", "Goodbye! Your answers have been answerd.", 
				                JOptionPane.PLAIN_MESSAGE);}
			        
			            
			    
			        

			
			
		});
		
	
		
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout groupLayout = new GroupLayout(frmMagicOracle.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtquestion, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtquestion, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		frmMagicOracle.getContentPane().setLayout(groupLayout);
		frmMagicOracle.setBounds(100, 100, 450, 300);
		frmMagicOracle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

}
}
