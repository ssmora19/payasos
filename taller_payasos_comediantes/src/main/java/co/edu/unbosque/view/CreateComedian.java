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

public class CreateComedian extends JFrame{
	
	private JLabel background;
	private JPanel panel;
	private JTextField name,identification,studiesLevel,openmic;
	private JButton bcreate,back;
	

	public CreateComedian() {
		this.setSize(1000, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		background= new JLabel();
		background.setBounds(0, 0, 1000, 650);
		ImageIcon fond = new ImageIcon("src/co/edu/unbosque/view/resources/Create comedian.jpg"); 
		background.setIcon(new ImageIcon(fond.getImage().getScaledInstance(995, 600, Image.SCALE_DEFAULT)));
		
		component();
		add(background);
	}
	
	public void component() {
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(953,1003));
		
		name= new JTextField();
		name.setBounds(542, 349, 390, 33);
		name.setBorder(null);
		name.setFont(new Font ("", Font.PLAIN,20));
		panel.add(name);
		
		identification= new JTextField();
		identification.setBounds(542, 440, 390, 33);
		identification.setBorder(null);
		identification.setFont(new Font ("", Font.PLAIN,20));
		panel.add(identification);
		
		studiesLevel= new JTextField();
		studiesLevel.setBounds(542, 527, 390, 33);
		studiesLevel.setBorder(null);
		studiesLevel.setFont(new Font ("", Font.PLAIN,20));
		panel.add(studiesLevel);
		
		openmic= new JTextField();
		openmic.setBounds(542, 617, 390, 33);
		openmic.setBorder(null);
		openmic.setFont(new Font ("", Font.PLAIN,20));
		panel.add(openmic);
		
		bcreate = new JButton();
		bcreate.setBounds(700, 80, 235, 80);
		bcreate.setBorderPainted(false);
		bcreate.setContentAreaFilled(false);
		add(bcreate);
		
		back = new JButton();
		back.setBounds(80, 513, 235, 80);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		add(back);
	
	}

	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public void setName(JTextField name) {
		this.name = name;
	}

	public JTextField getIdentification() {
		return identification;
	}

	public void setIdentification(JTextField identification) {
		this.identification = identification;
	}

	public JTextField getStudiesLevel() {
		return studiesLevel;
	}

	public void setStudiesLevel(JTextField studiesLevel) {
		this.studiesLevel = studiesLevel;
	}

	public JTextField getOpenmic() {
		return openmic;
	}

	public void setOpenmic(JTextField openmic) {
		this.openmic = openmic;
	}

	public JButton getBcreate() {
		return bcreate;
	}

	public void setBcreate(JButton bcreate) {
		this.bcreate = bcreate;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}
	
	
}
