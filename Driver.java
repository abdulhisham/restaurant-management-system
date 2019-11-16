package help;
import java.io.*;
public class Driver extends Bill {
	public static void main(String[]args)throws IOException
	{
		Info obj=new Info();
		Info ob1=new Bill();
		obj.display();
		ob1.display();
	}
}
