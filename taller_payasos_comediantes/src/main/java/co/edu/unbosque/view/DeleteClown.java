package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

 

	public class DeleteClown extends JFrame {

		private JLabel background;
		private JButton back;
		private JButton bdelete;
		private JTextField identification;
		private JPanel panel;
		
		public DeleteClown() {
			
			this.setSize(1000, 650);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setResizable(false);
			
			background= new JLabel();
			background.setBounds(0, 0, 1000, 650);
			ImageIcon fond = new ImageIcon("src/co/edu/unbosque/view/resources/Delete clown.jpg"); 
			background.setIcon(new ImageIcon(fond.getImage().getScaledInstance(995, 600, Image.SCALE_DEFAULT)));
			
			component();
			add(background);
		}
		public void component() {

			panel = new JPanel();
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(953, 1003));
		
			identification= new JTextField();
			identification.setBounds(542, 440, 390, 33);
			identification.setBorder(null);
			identification.setFont(new Font ("", Font.PLAIN,20));
			panel.add(identification);
			
			back = new JButton();
			back.setBounds(360, 600, 300, 80);
			back.setBorderPainted(false);
			back.setContentAreaFilled(false);
			add(back);
			
			bdelete = new JButton();
			bdelete.setBounds(360, 100, 300, 80);
			bdelete.setBorderPainted(false);
			bdelete.setContentAreaFilled(false);
			add(bdelete);
			
			
		}
		
		public void setBackground(JLabel background) {
			this.background = background;
		}
		public JTextField getIdentification() {
			return identification;
		}
		public void setIdentification(JTextField identification) {
			this.identification = identification;
		}
		public JPanel getPanel() {
			return panel;
		}
		public void setPanel(JPanel panel) {
			this.panel = panel;
		}
		
	
}
