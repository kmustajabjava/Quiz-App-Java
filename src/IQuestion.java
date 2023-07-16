import java.util.Random;

public class IQuestion 
{
	
	String[]Qs=new String[15];
    String[][]Options=new String[15][4];
    String []ans=new String[15];
	IQuestion()
	{
	
		Qs[0]="Who discovered electricity?";
		Qs[1]="Which Language is Used by the Computer to Process Data?";
		Qs[2]="Who is the inventor of television?";
		Qs[3]="Name the acidic form of Vitamin C? ";
		Qs[4]="What is the rarest blood type? ";
		Qs[5]="Who created cartoon character popeye?";
		Qs[6]="A computer cannot boot if it does not have the _____?";
		Qs[7]="Who was the discoverer of the vaccine Penicillin?";
		Qs[8]="I die when I drink and live when I eat. Who am I?";
		Qs[9]="Which food never goes bad?";
		Qs[10]="Who was the first woman to win a Nobel Prize?";
		Qs[11]="What is pi, written out to 5 decimal places?";
        Qs[12]="Which of these is botanically a fruit?";
        Qs[13]="Which of these is the correct spelling?";
        Qs[14]="Which term refers to the distance around a circle?";
        
	Options[0][0]="Michael Faraday";
	Options[0][1]="Benjamin Franklin";
	Options[0][2]="Newton";
	Options[0][3]="Marie Curie";
	Options[1][0]="Java";
	Options[1][1]="Pascal";
	Options[1][2]="Binary Language";
	Options[1][3]="C++";
	Options[2][0]="Benjamin Franklin";
	Options[2][1]="Marie Curie";
	Options[2][2]="John Logie Baird";
	Options[2][3]="Alexander Graham Bell";
    Options[3][0]="Ascorbic Acid";
	Options[3][1]="Malic Acid";
	Options[3][2]="Oxalic Acid";
	Options[3][3]="Tartaric";
	Options[4][0]="O Negative";
	Options[4][1]="B Positive";
	Options[4][2]="AB Negative";
	Options[4][3]="OB Positive";
	Options[5][0]="E. C. Segar";
	Options[5][1]="William Hanna & Joseph Barbera";
	Options[5][2]="Chris Gifford";
	Options[5][3]="Iwao Takamoto";
	Options[6][0]="Compiler";
	Options[6][1]="Operating System";
	Options[6][2]="Loader";
	Options[6][3]="Assembler";
	Options[7][0]="Edward Jenner";
	Options[7][1]="Albert Calmette";
	Options[7][2]="Emil von Behring";
	Options[7][3]="Alexander Fleming";
	Options[8][0]="Poison";
	Options[8][1]="Fire";
	Options[8][2]="Water";
	Options[8][3]="Snow";
	Options[9][0]="Cheese";
	Options[9][1]="Sugar";
	Options[9][2]="Paprika";
	Options[9][3]="Honey";
	Options[10][0]="Andrea M. Ghez";
	Options[10][1]="Mother Teresa";
	Options[10][2]="Carolyn R. Bertozzi";
	Options[10][3]="Marie Curie";
	Options[11][0]="3.13344";
	Options[11][1]="3.14111";
	Options[11][2]="3.14159";
	Options[11][3]="3.14156";
	Options[12][0]="Jalapeno";
	Options[12][1]="Onion";
	Options[12][2]="Carrot";
	Options[12][3]="Coriander";
	Options[13][0]="Desparate";
	Options[13][1]="Desparete";
	Options[13][2]="Desperate";
	Options[13][3]="Despirate";
	Options[14][0]="Radius";
	Options[14][1]="Pi";
	Options[14][2]="Diameter";
	Options[14][3]="Circumference";

	ans [0]="Benjamin Franklin";
	ans [1]="Binary Language";
	ans [2]="Alexander Graham Bell";
	ans [3]="Ascorbic Acid";
	ans [4]="AB Negative";
	ans [5]="E. C. Segar";
	ans [6]="Operating System";
	ans [7]="Alexander Fleming";
	ans [8]="Fire";
	ans [9]="Honey";
	ans[10]="Marie Curie";
	ans[11]="3.14159";
	ans[12]="Jalapeno";
	ans[13]="Desperate";
	ans[14]="Circumference";
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
