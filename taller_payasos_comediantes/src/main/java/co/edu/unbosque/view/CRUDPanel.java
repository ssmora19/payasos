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
	private JLabel font;
	
	public CRUDPanel() {
		this.setSize(1000, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		font= new JLabel();
		font.setBounds(0, 0, 1000, 650);
		ImageIcon fond = new ImageIcon("holaaaaaaaaaaaaaa"); 
		font.setIcon(new ImageIcon(fond.getImage().getScaledInstance(995, 600, Image.SCALE_DEFAULT)));
		
		component();
		
	}
	
	public void component() {
		
		bread=new JButton();
		bread.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		bread.setBorderPainted(false);
		bread.setContentAreaFilled(false);
		add(bread);
		
		bdelete = new JButton();
		bdelete.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		bdelete.setBorderPainted(false);
		bdelete.setContentAreaFilled(false);
		add(bdelete);
		
		bupdate = new JButton();
		bupdate.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		bupdate.setBorderPainted(false);
		bupdate.setContentAreaFilled(false);
		add(bupdate);
		
		bcreate = new JButton();
		bcreate.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		bcreate.setBorderPainted(false);
		bcreate.setContentAreaFilled(false);
		add(bcreate);
		
		
		
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

}
