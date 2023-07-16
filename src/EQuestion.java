import java.util.Random;

public class EQuestion 
{
	String[]Qs=new String[15];
    String[][]Options=new String[15][4];
    String []ans=new String[15];
    
	EQuestion()
	{
		Qs[0]="Which is the only body part that is fully grown from birth?";
		Qs[1]="How many hearts does an octopus have? ";
		Qs[2]="What planet is closest to the sun??";
		Qs[3]="Until 1923, what was the Turkish city of Istanbul called?";
		Qs[4]="Name the longest river in the world? ";
		Qs[5]="Name the densest jungle in the world?";
		Qs[6]="What type of gas is absorbed by plants?";
		Qs[7]="Name the smallest continent in terms of area?";
		Qs[8]="What is the name of a shape with 5 sides?";
		Qs[9]="Which colors mix together to form purple color?";
		Qs[10]="What does the BBC stand for?";
		Qs[11]="Which planet has the most moons?";
		Qs[12]="How many bones do we have in an ear?";
		Qs[13]="What is the world's fastest bird?";
		Qs[14]="How many stars are on the Chinese flag?";
		
		Options[0][0]="Nose";
		Options[0][1]="Eyes";
		Options[0][2]="Nails";
		Options[0][3]="Tongue";
		Options[1][0]="4";
		Options[1][1]="5";
		Options[1][2]="3";
		Options[1][3]="1";
		Options[2][0]="Uranus";
		Options[2][1]="Saturn";
		Options[2][2]="Mercury";
		Options[2][3]="Earth";
		Options[3][0]="Constantinople";
		Options[3][1]="Konya";
		Options[3][2]="Izmir";
		Options[3][3]="Bursa";
		Options[4][0]="Amazone";
		Options[4][1]="Congo";
		Options[4][2]="Nile";
		Options[4][3]="Ganges";
		Options[5][0]="The Amazone Rainforest";
		Options[5][1]="Congo Basin";
		Options[5][2]="Australian Temperate Forest";
		Options[5][3]="Taiga";
		Options[6][0]="Oxygen";
		Options[6][1]="Carbon Dioxide";
		Options[6][2]="Nitrogen";
		Options[6][3]="Helium";
		Options[7][0]="Asia";
		Options[7][1]="Europe";
		Options[7][2]="North America";
		Options[7][3]="Australia";
		Options[8][0]="Octagon";
		Options[8][1]="Pentagon";
		Options[8][2]="Hexagon";
		Options[8][3]="Nonagon";
		Options[9][0]="Red & yellow";
		Options[9][1]="Blue & Orange";
		Options[9][2]="Red & Green";
		Options[9][3]="Red & Blue";
		Options[10][0]="British Billingual Corporation";
		Options[10][1]="British Broadcasting Corporation";
		Options[10][2]="British Basketball Corporation";
		Options[10][3]="Bermuda Broadcasting Channel";
		Options[11][0]="Uranus";
		Options[11][1]="Saturn";
		Options[11][2]="Mercury";
		Options[11][3]="Earth";
		Options[12][0]="4";
		Options[12][1]="3";
		Options[12][2]="6";
		Options[12][3]="1";
		Options[13][0]="Rock Dove ";
		Options[13][1]="Humming Bird";
		Options[13][2]="Golden Eagle";
		Options[13][3]="The Peregrine Falcon";
		Options[14][0]="4";
		Options[14][1]="3";
		Options[14][2]="5";
		Options[14][3]="1";
		
	ans [0]="Eyes";
	ans [1]="3";
	ans [2]="Mercury";
	ans [3]="Constantinople";
	ans [4]="Nile";
	ans [5]="The Amazone Rainforest";
	ans [6]="Carbon Dioxide";
	ans [7]="Australia";
	ans [8]="Pentagon";
	ans [9]="Red & Blue";
	ans[10]="British Broadcasting Corporation";
	ans[11]="Saturn";
	ans[12]="3";
	ans[13]="The Peregrine Falcon";
	ans[14]="5";
	
	int randomIndexToSwap=0; 
    Random rand = new Random();
    for (int i = 0; i < Qs.length; i++) 
    {
	randomIndexToSwap = rand.nextInt(Qs.length);
	String temp = Qs[randomIndexToSwap];
	Qs[randomIndexToSwap] = Qs[i];
	Qs[i] = temp;
	
	String[] temp1 = Options[randomIndexToSwap];
	Options[randomIndexToSwap] = Options[i];
	Options[i] = temp1;
	
	String temp2 = ans[randomIndexToSwap];
	ans[randomIndexToSwap] = ans[i];
	ans[i] = temp2;
	
    }
    
}

	public String getQuestion(int i)
	{
		String q=" ";
		for(int j=0;j<=i;j++)
		{
		q=Qs[i];
		}
		return q;
	}
	public String getOptions(int i,int j)
	{
		String op="";
		for(int k=0;k<=i;k++)
		{
			for(int l=0;l<=j;l++)
			{
				op=Options[i][j];
			}
		}
		return op;
	}
	public String getcorrect(int i)
	{
		String q="";
		for(int j=0;j<=i;j++)
		{
		q=ans[i];
		}
		return q;
	}
}
