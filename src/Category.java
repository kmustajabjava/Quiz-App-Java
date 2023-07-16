import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Category implements ActionListener
{
	JButton easy,inter,diff,exit; 
	JFrame frame=new JFrame();
Category()
{
	Color peach=new Color(255,203,164); 
	Color lightgrey=new Color(220,220,220);
	Color teal=new Color(0,128,128);
	
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("QUIZ APP");
    frame.setVisible(true);
    frame.setLayout(new FlowLayout());
	
	easy=new JButton ("      EASY      ");
	easy.setFont(new Font("Monospaced", Font.BOLD, 34));
	easy.setAlignmentX(JButton.CENTER_ALIGNMENT);
	easy.setBackground(teal);
	easy.setForeground(peach);
	easy.addActionListener(this);
	
	inter=new JButton("  INTERMEDIATE  ");
	inter.setAlignmentX(JButton.CENTER_ALIGNMENT);
	inter.setFont(new Font("Monospaced", Font.BOLD, 34));
	inter.setBackground(peach);
	inter.setForeground(teal);
	inter.addActionListener(this);
	
	diff=new JButton ("    DIFFICULT   ");
	diff.setAlignmentX(JButton.CENTER_ALIGNMENT);
	diff.setFont(new Font("Monospaced", Font.BOLD, 34));
	diff.setBackground(teal);
	diff.setForeground(peach);
	diff.addActionListener(this);
	
	exit=new JButton ("      EXIT      ");
	exit.setAlignmentX(JButton.CENTER_ALIGNMENT);
	exit.setFont(new Font("Monospaced", Font.BOLD, 34));
	exit.setBackground(Color.white);
	exit.setForeground(Color.black);
	exit.addActionListener(this);
	
	JLabel jl1=new JLabel("           CHOOSE YOUR LEVEL           ");
	jl1.setFont(new Font("Monospaced", Font.BOLD, 44));
	jl1.setBackground(Color.white);
	jl1.setOpaque(true);
	jl1.setForeground(Color.black);
	
	JPanel mainpnl=new JPanel();
	JPanel pnl=new JPanel(new BorderLayout());
	JPanel btnpnl=new JPanel();
	JPanel exitPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	btnpnl.setLayout(new BoxLayout(btnpnl,BoxLayout.Y_AXIS));
	mainpnl.setLayout(new FlowLayout(FlowLayout.CENTER));
	mainpnl.add(jl1);
	exitPnl.add(exit);
	exitPnl.setBackground(Color.white);
	
	btnpnl.add(easy);
	btnpnl.add(inter);
	btnpnl.add(diff);
	btnpnl.setAlignmentX(JPanel.CENTER_ALIGNMENT);
	btnpnl.setBackground(lightgrey);
	
	pnl.add(mainpnl,BorderLayout.NORTH);
	pnl.add(btnpnl,BorderLayout.CENTER);
	pnl.add(exitPnl,BorderLayout.SOUTH);
	
	frame.add(pnl);
	frame.setResizable(false);
	frame.setSize(800,420);
	frame.setVisible(true);
}

public void actionPerformed(ActionEvent e) 
{
	
	if(e.getSource()==easy)
	{
		frame.setVisible(false);
		NextQuestion n1 =new NextQuestion();	
	}
	else if(e.getSource()==inter)
	{
		frame.setVisible(false);
		INextQ n2 =new INextQ();	
	}
	else if(e.getSource()==diff)
	{
		frame.setVisible(false);
		DNextQ n3 =new DNextQ();
	}
	else if(e.getSource()==exit)
	{
		frame.setVisible(false);
	}
}
}
