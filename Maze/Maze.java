//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private char[][] maze;
   private char[][] path;
   int best = Integer.MAX_VALUE;
	public Maze(int size, String line)
	{
		maze = new char[size][size];
		int n=0; 
		for(int i=0; i<maze.length;i++)
		{
			for(int i3=0; i3< maze[i].length;i3++)
			{
				maze[i][i3]= line.charAt(n);
				n++;
			}
		}
		
		
		//Find PAath Here
		char [][] newMatrix = new char[maze.length][];
		for(int i = 0; i < maze.length; i++)
		    newMatrix[i] = maze[i].clone();
		path = newMatrix;
		
		char [][] newMatrix2 = new char[maze.length][];
		for(int i = 0; i < maze.length; i++)
		    newMatrix2[i] = maze[i].clone();
		
		
		
		int num = hasExitPath(0,0,1, newMatrix2);
		for(int r=0; r<path.length;r++)
		{
			for(int c=0;c<path[r].length;c++)
			{
				System.out.print(path[r][c]+ " ");  //forgot to change back debug code = 7  minute debug
			}
			System.out.print("\n");
		}
		System.out.println(num!=Integer.MAX_VALUE?"Path found- " + num + " steps away.": "No path found.");
		System.out.println("\n");
	}

	public int hasExitPath(int r, int c, int max, char[][] matrix)
	{
		max++;
		matrix[r][c]= 'P';
		if(c== matrix.length-1) //Didn't count from 0 = 40 minute debug.
		{
			if(max<best)
			{
				path=matrix;
				best = max;
				return max;
			}
			else
			{
				return Integer.MAX_VALUE;
			}
		}
		int left =Integer.MAX_VALUE;
		int right =Integer.MAX_VALUE;
		int up =Integer.MAX_VALUE;
		int down = Integer.MAX_VALUE;
		try
		{
			char [][] newMatrix = new char[matrix.length][];
			for(int i = 0; i < matrix.length; i++)
			    newMatrix[i] = matrix[i].clone();
			if(matrix[r-1][c-0]=='1')
			down = hasExitPath(r-1,c,max, newMatrix);
		}catch(Exception e){}
		try
		{
			char [][] newMatrix2 = new char[matrix.length][];
			for(int i = 0; i < matrix.length; i++)
			    newMatrix2[i] = matrix[i].clone();
			if(matrix[r+1][c-0]=='1')
			up = hasExitPath(r+1,c,max, newMatrix2);
		}catch(Exception e){}
		try
		{
			char [][] newMatrix3 = new char[matrix.length][];
			for(int i = 0; i < matrix.length; i++)
			    newMatrix3[i] = matrix[i].clone();
			if(matrix[r-0][c+1]=='1')
			right = hasExitPath(r,c+1,max, newMatrix3);
		}catch(Exception e){}
		try
		{
			char [][] newMatrix4 = new char[matrix.length][];
			for(int i = 0; i < matrix.length; i++)
			    newMatrix4[i] = matrix[i].clone();
			if(matrix[r-0][c-1]=='1')
			left = hasExitPath(r,c-1,max, newMatrix4);
		}catch(Exception e){}
		
		return (Math.min(Math.min(left, right), Math.min(up, down)));
	}

	public String toString()
	{
		/**
		String s = "";
		for(int i=0;i<maze.length;i++)
		{
			for(int i3=0;i3<maze[i].length;i3++)
			{
				s+=maze[i][i3];
			}
		}
		return s;
		**/
		return "\n";
	}
}
