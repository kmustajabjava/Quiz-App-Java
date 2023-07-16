import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI implements ActionListener
{
	JButton Start;
	JFrame frame;
GUI()
{
	Color peach=new Color(255,203,164); 
	Color teal=new Color(0,128,128);
	frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("GK QUIZ APP");
    frame.setVisible(true);
    frame.setBackground(Color.white);
    frame.setContentPane(new JLabel(new ImageIcon("giphy.gif")));
    frame.setLayout(new BorderLayout());
	
	JPanel toppnl=new JPanel();
	JPanel mainpnl=new JPanel();
	JPanel btnPnl = new JPanel();
	
	JLabel jl1=new JLabel("           ");
	jl1.setFont(new Font("Monospaced", Font.BOLD, 34));
	Start=new JButton("  Let's Start  ");
	Start.setFont(new Font("Monospaced", Font.BOLD, 28));
	Start.setBackground(Color.white);
	Start.setForeground(Color.black);
	
	btnPnl.add(Start);
	btnPnl.setBackground(Color.white);
	toppnl.setBackground(peach);
	mainpnl.setBackground(peach);
	toppnl.add(jl1);
    mainpnl.add(btnPnl);
    toppnl.setBorder(BorderFactory.createLineBorder(teal));
    mainpnl.setBorder(BorderFactory.createLineBorder(teal));
    
	frame.add(toppnl,BorderLayout.NORTH);
	frame.add(mainpnl,BorderLayout.SOUTH);
    frame.setSize(800,420);
    frame.setResizable(false);
    Start.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==Start)
	{
		frame.setVisible(false);
		Category c=new Category();
	}
}
public static void main(String[] args) 
{  
    new GUI();  
}
}
