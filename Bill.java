package help;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bill extends Info implements ForAll {
	void calc()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tot=0,cv=0,cn=0,cs=0,d1=0,d2=0,d3=0;
		System.out.println("Enter your name:");
		String name=br.readLine();
		System.out.println("Enter your mode of payment:");
		System.out.println("(10% discount available on payment by card)");
		String pay=br.readLine();
		double tot2=0;
		System.out.println("Enter number of peole:");
		int p=Integer.parseInt(br.readLine());
		Info obj=new Info(p);
		char ans=obj.calculate(p);
		if(ans=='Y')
		{
			System.out.println("Please come in");
			System.out.println("\n\n");
			int g=p;
			while(g!=0)
			{
				System.out.println("1.Non veg Buffet----Price=$20");
				System.out.println("2.Veg buffet--------Price=$15");
				System.out.println("3.Seafood Buffet----Price=$25");
				System.out.println("Enter choice of drink:");
				System.out.println("1.Virgin Mojito-----Price=$4");
				System.out.println("2.Ginger Lemon Tea--Price=$5");
				System.out.println("Blueberry Mocktail--Price=$6");
				System.out.println("Enter your choice:");
				int cho=Integer.parseInt(br.readLine());
				int cho2=Integer.parseInt(br.readLine());
				int b2=obj.bill2(cho2);
				int b=obj.bill(cho);
				if(b2==4)
					d1++;
				else if(b2==5)
					d2++;
				else if(b2==6)
					d3++;
				else
					System.out.println("\n");
				if(b==20)
					cn++;
				else if(b==15)
					cv++;
				else if(b==25)
					cs++;
				else
					System.out.println("\n");
				tot=tot+b+b2;
				tot2=tot;
				if(pay.contentEquals("Card")||pay.contentEquals("card")||pay.contentEquals("CARD"))
					tot2=tot*0.9;
				g--;
			}
			System.out.println("\n");
			System.out.println("*********************");
			System.out.println("\nName:"+name);
			System.out.println("\nMode of Payment:"+pay);
			System.out.println("\nNumber of people:"+p);
			System.out.println("\nNumber of veg buffet="+cv);
			System.out.println("\nNumber of non veg buffet="+cn);
			System.out.println("\nNumber of seafood buffets="+cs);
			System.out.println("\nNumber of Virgin Mojito="+d1);
			System.out.println("\nNumber of Ginger Lemon Tea="+d2);
			System.out.println("\nNumber of Blueberry Mocktail="+d3);
			System.out.println("\nTotal bill=$"+tot2);
			System.out.println("\n******Thank You******");
		}
		else
		{
			System.out.println("Sorry but you have to wait");
			System.out.println("Would you like to cancel your order?(Y/N)");
			String cho3=br.readLine();
			if(cho3=="N")
			{
				System.out.println("Then we will recommend you to enter your details");
			int g=p;
			while(g!=0)
			{
				System.out.println("1.Non veg Buffet----Price=$20");
				System.out.println("2.Veg buffet--------Price=$15");
				System.out.println("3.Seafood Buffet----Price=$25");
				System.out.println("Enter choice of drink:");
				System.out.println("1.Virgin Mojito-----Price=$4");
				System.out.println("2.Ginger Lemon Tea--Price=$5");
				System.out.println("Blueberry Mocktail--Price=$6");
				System.out.println("Enter your choice:");
				int cho=Integer.parseInt(br.readLine());
				int ch2=Integer.parseInt(br.readLine());
				int b2=obj.bill2(ch2);
				int b=obj.bill(cho);
				if(b2==4)
					d1++;
				else if(b2==5)
					d2++;
				else if(b2==6)
					d3++;
				else
					System.out.println("\n");
				if(b==20)
					cn++;
				else if(b==15)
					cv++;
				else if(b==25)
					cs++;
				else
					System.out.println("\n");
				tot=tot+b+b2;
				tot2=tot;
				if(pay.contentEquals("Card")||pay.contentEquals("card")||pay.contentEquals("CARD"))
					tot2=tot*0.9;
				g--;
			}
			System.out.println("\n");
			System.out.println("*********************");
			System.out.println("\nName:"+name);
			System.out.println("\nMode of Payment:"+pay);
			System.out.println("\nNumber of people:"+p);
			System.out.println("\nNumber of veg buffet="+cv);
			System.out.println("\nNumber of non veg buffet="+cn);
			System.out.println("\nNumber of seafood buffets="+cs);
			System.out.println("\nNumber of Virgin Mojito="+d1);
			System.out.println("\nNumber of Ginger Lemon Tea="+d2);
			System.out.println("\nNumber of Blueberry Mocktail="+d3);
			System.out.println("\nTotal bill=$"+tot2);
			System.out.println("\n******Thank You******");
		}
			else
			{
			System.out.println("We are sorry. Hope to see you soon!!");
			}
		}
	}
	public void display()throws IOException
	{
		Bill obj =new Bill();
		obj.calc();
	}
}
