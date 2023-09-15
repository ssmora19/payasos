package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CRUDPanel extends JFrame{
	
	private JButton bread;
	private JButton bupdate;
	private JButton bdelete;
	private JButton bcreate;
	private JButton back;
	private JLabel background;
	
	public CRUDPanel() {
		this.setSize(1000, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		background= new JLabel();
		background.setBounds(0, 0, 1000, 650);
		ImageIcon fond = new ImageIcon("src/co/edu/unbosque/view/resources/CRUD.jpg"); 
		background.setIcon(new ImageIcon(fond.getImage().getScaledInstance(995, 600, Image.SCALE_DEFAULT)));
		
		component();
		add(background);
	}
	
	public void component() {
		
		bread=new JButton();
		bread.setBounds(360, 560, 300, 80);
		bread.setBorderPainted(false);
		bread.setContentAreaFilled(false);
		add(bread);
		
		bdelete = new JButton();
		bdelete.setBounds(360, 570, 300, 80);
		bdelete.setBorderPainted(false);
		bdelete.setContentAreaFilled(false);
		add(bdelete);
		
		bupdate = new JButton();
		bupdate.setBounds(360, 580, 300, 80);
		bupdate.setBorderPainted(false);
		bupdate.setContentAreaFilled(false);
		add(bupdate);
		
		bcreate = new JButton();
		bcreate.setBounds(360, 590, 300, 80);
		bcreate.setBorderPainted(false);
		bcreate.setContentAreaFilled(false);
		add(bcreate);
		
		back = new JButton();
		back.setBounds(360, 600, 300, 80);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		add(back);
		
	}

	public JButton getBread() {
		return bread;
	}

	public void setBread(JButton bread) {
		this.bread = bread;
	}

	public JButton getBupdate() {
		return bupdate;
	}

	public void setBupdate(JButton bupdate) {
		this.bupdate = bupdate;
	}

	public JButton getBdelete() {
		return bdelete;
	}

	public void setBdelete(JButton bdelete) {
		this.bdelete = bdelete;
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
