import java.util.Random;

public class DQuestion 
{
	String[]Qs=new String[15];
    String[][]Options=new String[15][4];
    String []ans=new String[15];
	DQuestion()
	{
	
		    Qs[0]="What Does the “SIM” in the SIM Card Stand for?";
		    Qs[1]= "What will be 120% of 20?";
		    Qs[2]="How many balls are on a pool table at the start of a game?";
		    Qs[3]="In which country can you find the most freshwater resources? ";
		    Qs[4]="There are ______ seconds in a day? ";
		    Qs[5]="Who is the painter of the painting 'MONA LISA'?";
		    Qs[6]="On What Japanese City Was The First Atomic Bomb Dropped?";
		    Qs[7]="What was the name given to Android 4.3?";
		    Qs[8]="What type of reptile can detach their tails when they are in danger and then regrow it?";
		    Qs[9]="What type of cloud is a thundercloud?";
		    Qs[10]= "Betz cells are found in which part of the body?";
		    Qs[11]= "How many stomachs does a cow have?";
		    Qs[12]= "How many edges in a cube?";
		    Qs[13]= "What allows bats to fly in the dark?";
		    Qs[14]= "Paper was invented in what country?";
	

Options[0][0]="Security Information Management";
Options[0][1]="Subscriber Identity Module";
Options[0][2]="Strategic Instruction Model";
Options[0][3]="Systems In Motion";
Options[1][0]="22";
Options[1][1]="20";
Options[1][2]="24";
Options[1][3]="30";
Options[2][0]="15";
Options[2][1]="10";
Options[2][2]="16";
Options[2][3]="18";
Options[3][0]="Brazil";
Options[3][1]="America";
Options[3][2]="Switzerland";
Options[3][3]="South Korea";
Options[4][0]="84600";
Options[4][1]="86579";
Options[4][2]="86400";
Options[4][3]="68400";
Options[5][0]="Leonardo Da Vinci";
Options[5][1]="Pablo Picasso";
Options[5][2]="Michael Angelo";
Options[5][3]="Caravaggio";
Options[6][0]="Osaka";
Options[6][1]="Hiroshima";
Options[6][2]="Tokyo";
Options[6][3]="Sapporo";
Options[7][0]="Lollypop";
Options[7][1]="Marshmellow";
Options[7][2]="Oreo";
Options[7][3]="Jelly Bean";
Options[8][0]="Snake";
Options[8][1]="Lizard";
Options[8][2]="Turtle";
Options[8][3]="Aligator";
Options[9][0]="Cirus";
Options[9][1]="Stratus";
Options[9][2]="Cumulus";
Options[9][3]="Cumulonimbus";
Options[10][0]="Brain";
Options[10][1]="Lungs";
Options[10][2]="Stomach";
Options[10][3]="Heart";
Options[11][0]="Four";
Options[11][1]="Three";
Options[11][2]="Five";
Options[11][3]="One";
Options[12][0]="14 Edges";
Options[12][1]="13 Edges";
Options[12][2]="10 Edges";
Options[12][3]="12 Edges";
Options[13][0]="Electric Signals";
Options[13][1]="Rays";
Options[13][2]="Echolocation";
Options[13][3]="Waves";
Options[14][0]="India";
Options[14][1]="America";
Options[14][2]="China";
Options[14][3]="Italy";

ans [0]="Subscriber Identity Module";
ans [1]="24";
ans [2]="16";
ans [3]="Brazil";
ans [4]="86400";
ans [5]="Leonardo Da Vinci";
ans [6]="Hiroshima";
ans [7]="Jelly Bean";
ans [8]="Lizard";
ans [9]="Cumulonimbus";
ans[10]="Brain";
ans[11]="Four";
ans[12]="12 Edges";
ans[13]="Echolocation";
ans[14]="China";

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
