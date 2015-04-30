//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scanny = new Scanner(new File("maze.dat"));
		int length;
		String line;
		Maze m;
		length= scanny.nextInt();
		scanny.nextLine();
		line = scanny.nextLine();
		m = new Maze(length,line);
		
		length= scanny.nextInt();
		scanny.nextLine();
		line = scanny.nextLine();
		m = new Maze(length,line);
		
		length= scanny.nextInt();
		scanny.nextLine();
		line = scanny.nextLine();
		m = new Maze(length,line);
		
		length= scanny.nextInt();
		scanny.nextLine();
		line = scanny.nextLine();
		m = new Maze(length,line);
		
		length= scanny.nextInt();
		scanny.nextLine();
		line = scanny.nextLine();
		m = new Maze(length,line);
		
		length= scanny.nextInt();
		scanny.nextLine();
		line = scanny.nextLine();
		m = new Maze(length,line);
		
		
	}
}
