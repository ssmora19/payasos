package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JFrame{
	
	private JLabel font;
	private JButton bclown;
	private JButton bcomedian;
	private JButton bcontinue;
	
	public WelcomePanel() {
		this.setSize(1000, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		font= new JLabel();
		font.setBounds(0, 0,1000, 650);
		ImageIcon fond=new ImageIcon("holaaaaaaaaaa");
	    font.setIcon(new ImageIcon(fond.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT)));
	    
	    component();
	    
	    add(font);
	}
	
	
	private void component() {
		bclown= new JButton();
		bclown.setBounds(360, 560, 300, 80);
		bclown.setEnabled(false);
		bclown.setOpaque(false);
		bclown.setContentAreaFilled(false);
		bclown.setBorderPainted(false);
		add(bclown);
		
		bcomedian= new JButton();
		bcomedian.setBounds(360, 570, 300, 80);
		bcomedian.setEnabled(false);
		bcomedian.setOpaque(false);
		bcomedian.setContentAreaFilled(false);
		bcomedian.setBorderPainted(false);
		add(bcomedian);
		
		bcontinue= new JButton();
		bcontinue.setBounds(360, 580, 300, 80);
		bcontinue.setEnabled(false);
		bcontinue.setOpaque(false);
		bcontinue.setContentAreaFilled(false);
		bcontinue.setBorderPainted(false);
		add(bcontinue);
	
	}



	public JButton getBclown() {
		return bclown;
	}


	public void setBclown(JButton bclown) {
		this.bclown = bclown;
	}


	public JButton getBcomedian() {
		return bcomedian;
	}


	public void setBcomedian(JButton bcomedian) {
		this.bcomedian = bcomedian;
	}


	public JButton getBcontinue() {
		return bcontinue;
	}


	public void setBcontinue(JButton bcontinue) {
		this.bcontinue = bcontinue;
	}
	
	

}
