import java.util.*;
import java.io.*; 

public class MatrixSumming
{
    private int[][] m=
    {
        {1,2,3,4,5},
        {6,7,8,9,0},
        {6,7,1,2,5},
        {6,7,8,9,0},
        {5,4,3,2,1}
    };  //load in the matrix values

    public int sum( int r, int c )
    {
    	int sum=0;
    	for(int r=-1;r<=1;r++)
    	{
    	    for(int c=-1;c<=1;c++)
    	    {
    	        sum+=getValue(r,c);
    	    }
    	}
    	return sum;
    }
    
    public int getValue(int r, int c)
    {
        try
        {
            return m[r][c];
        }catch(Exception e){}
        return 0;
    }

    public String toString()
    {
    	return "";
    }
}
