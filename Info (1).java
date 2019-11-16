package help;
import java.io.*;
public class Info implements ForAll {
	int people=0;
	int tabler=0;
	int tablet=(int)(Math.random()*15);
	public Info()
	{
		System.out.println("");
	}
	public Info(int p)
	{
		people=p;
	}
	char calculate(int people)
	{
		if(people%4==0)
			tabler=(people/4);
		else
			tabler=(people/4)+1;
		if(tabler<=tablet)
			return 'Y';
		else
			return 'X';
	}
	int bill(int c)
	{
		if(c==1)
			return 20;
		else if(c==2)
			return 15;
		else if(c==3)
			return 25;
		else
			return 0;
	}
	int bill2(int c2)
	{
		if(c2==1)
			return 4;
		else if(c2==2)
			return 5;
		else if(c2==3)
			return 6;
		else
			return 0;
	}
	public void display()throws IOException
	{
		System.out.println("********WELCOME*********");
	}
}
