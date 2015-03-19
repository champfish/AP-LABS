//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
		int num = file.nextInt();
		MatrixSumming s = new MatrixSumming();
		for(int i=0;i<num;i++)
		{
			int r = file.nextInt();
			int c = file.nextInt();
			System.out.println(s.sum(r,c));
		}
	}
}



