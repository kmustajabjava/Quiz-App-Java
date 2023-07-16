import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NextQuestion implements ActionListener
{
	JFrame frame=new JFrame();
    JPanel tpnl=new JPanel();
    JPanel rbpnl=new JPanel();
    JPanel qpnl=new JPanel();
    JPanel resultpnl=new JPanel();
    JPanel bpnl=new JPanel();
	
    
    JRadioButton A =new JRadioButton();
    JRadioButton B=new JRadioButton();
    JRadioButton C=new JRadioButton();
    JRadioButton D=new JRadioButton();
    
    JButton NextLevel=new JButton();
    JButton PlayAgain=new JButton();
    JButton Exit=new JButton();
    
    JLabel jl1=new JLabel(); 
    JLabel jl2=new JLabel();
    JLabel jl3=new JLabel();
    JLabel jl4=new JLabel();
    JLabel img=new JLabel(new ImageIcon("vict.gif"));
    JLabel seconds_left=new JLabel("Time left: ");
    
    Color peach=new Color(255,203,164); 
   	Color lightgrey=new Color(220,220,220);
   	Color teal=new Color(0,128,128);
    
    EQuestion eq=new EQuestion();
    
    int seconds=15;
    int index=0;
    int correct=0;   
    
    Timer timer = new Timer(1000, new ActionListener() 
	{
		public void actionPerformed(ActionEvent e)
		{
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0)
			{
				displayans();
			}
			}
	});
    
  	NextQuestion()
	{
  	frame.setLayout(new BorderLayout());	
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("GK QUIZ APP");
    frame.setVisible(true);
    
    ButtonGroup bg= new ButtonGroup();
    
	A.setFont(new Font("Monospaced", Font.BOLD, 18));
	A.setForeground(teal);
	
	B.setFont(new Font("Monospaced", Font.BOLD, 18));
	B.setForeground(teal);
	
	C.setFont(new Font("Monospaced", Font.BOLD, 18));
	C.setForeground(teal);
	
	D.setFont(new Font("Monospaced", Font.BOLD, 18));
	D.setForeground(teal);
    
    bg.add(A);
    bg.add(B);
    bg.add(C);
    bg.add(D);
    
    
    qpnl.setLayout(new BoxLayout(qpnl,BoxLayout.Y_AXIS));
    qpnl.add(jl1);
    qpnl.add(jl2);
    qpnl.setBackground(peach);
	qpnl.setOpaque(true);
    qpnl.setBorder(BorderFactory.createLineBorder(Color.black));
    
    rbpnl.setLayout(new BoxLayout(rbpnl,BoxLayout.Y_AXIS));
    rbpnl.add(A);
    rbpnl.add(B);
    rbpnl.add(C);
    rbpnl.add(D);
    rbpnl.add(jl4);
    
    tpnl.setLayout(new BorderLayout());
    tpnl.add(seconds_left,BorderLayout.EAST);
    tpnl.setBackground(peach);
	tpnl.setOpaque(true);
    qpnl.add(tpnl);
    
    frame.setSize(800,420);
    frame.add(qpnl,BorderLayout.NORTH);
    frame.add(rbpnl,BorderLayout.CENTER);
    
    A.addActionListener(this);
    B.addActionListener(this);
    C.addActionListener(this);
    D.addActionListener(this);
    nextq();
    
	}
public void nextq()
{
	if(index>=10)
	{
		result();
	}
	else
	{
	jl1.setText("QUESTION  "+(index+1));
	jl1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
	jl1.setFont(new Font("Monospaced", Font.BOLD, 24));
	jl1.setForeground(Color.black);
	jl2.setText(eq.getQuestion(index));
	jl2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
	jl2.setFont(new Font("Monospaced", Font.BOLD, 18));
	jl2.setForeground(Color.black);
	jl2.setBorder(BorderFactory.createLineBorder(peach));
	
	seconds_left.setAlignmentX(JLabel.LEFT_ALIGNMENT);
	seconds_left.setFont(new Font("Monospaced", Font.BOLD, 18));
	seconds_left.setForeground(Color.black);
	
	int k=0;
		A.setText(eq.getOptions(index, k++));
		B.setText(eq.getOptions(index, k++));
		C.setText(eq.getOptions(index, k++));
		D.setText(eq.getOptions(index, k++));
		jl4.setText("Correct Answer: "+eq.getcorrect(index));
		jl4.setFont(new Font("Monospaced", Font.BOLD, 19));
		jl4.setBackground(Color.white);
		jl4.setOpaque(true);
		jl4.setForeground(teal);
		jl4.setVisible(false);
		timer.start();
	}
	
}

void displayans()
{
	timer.stop();
	
    A.setEnabled(false);
	B.setEnabled(false);
	C.setEnabled(false);
	D.setEnabled(false);
	jl4.setVisible(true);
	
	Timer pause = new Timer(2000, new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			seconds=15;
			seconds_left.setText(String.valueOf(seconds));
			A.setEnabled(true);
			B.setEnabled(true);
			C.setEnabled(true);
			D.setEnabled(true);
			index++;
			nextq();
		}
	});
	pause.setRepeats(false);
	pause.start();
}

public void result()
{
	frame.setSize(850,700);
	NextLevel=new JButton ("      NEXT LEVEL      ");
	NextLevel.setFont(new Font("Monospaced", Font.BOLD, 22));
	NextLevel.setAlignmentX(JButton.CENTER_ALIGNMENT);
	NextLevel.setBackground(teal);
	NextLevel.setForeground(peach);
	NextLevel.addActionListener(this);
	NextLevel.setBorder(BorderFactory.createLineBorder(peach));
	
	PlayAgain=new JButton ("      PLAY AGAIN      ");
	PlayAgain.setFont(new Font("Monospaced", Font.BOLD, 22));
	PlayAgain.setAlignmentX(JButton.CENTER_ALIGNMENT);
	PlayAgain.setBackground(teal);
	PlayAgain.setForeground(peach);
	PlayAgain.addActionListener(this);
	PlayAgain.setBorder(BorderFactory.createLineBorder(peach));
	
	Exit=new JButton ("      EXIT      ");
	Exit.setFont(new Font("Monospaced", Font.BOLD, 22));
	Exit.setAlignmentX(JButton.CENTER_ALIGNMENT);
	Exit.setBackground(teal);
	Exit.setForeground(peach);
	Exit.addActionListener(this);
	Exit.setBorder(BorderFactory.createLineBorder(peach));
	
	qpnl.setVisible(false);
	rbpnl.setVisible(false);
	tpnl.setVisible(false);
	jl3.setText("RESULT! "+"\n"+correct+"/"+10);
	jl3.setFont(new Font("Monospaced", Font.BOLD, 22));
	resultpnl.add(jl3);
	
	bpnl.add(NextLevel);
	bpnl.add(PlayAgain);
	bpnl.add(Exit);
	
	frame.add(resultpnl,BorderLayout.NORTH);
	frame.add(img,BorderLayout.CENTER);
	frame.add(bpnl,BorderLayout.SOUTH);
	
}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Exit)
		{
			frame.setVisible(false);
		}
		else if(e.getSource()==NextLevel)
		{
			frame.setVisible(false);
			INextQ n3=new INextQ();
		}
		else if(e.getSource()==PlayAgain)
		{
			frame.setVisible(false);
			NextQuestion n3 =new NextQuestion();
		}
	else if(A.isSelected())
		{
				if(A.getText()==eq.getcorrect(index))
				{
					correct++;
				}
		}
		else if(B.isSelected())
		{
			
			if(B.getText()==eq.getcorrect(index))
				{
					correct++;
				
				}
			}
		
		else if(C.isSelected())
		{
			
			if(C.getText()==eq.getcorrect(index))
				{
					correct++;
				}
		}
		else if(D.isSelected())
		{
			
				if(D.getText()==eq.getcorrect(index))
				{
					correct++;
				
				}
		}
		displayans();
		}
}
