/*
ID:rockerz1
LANG: JAVA
PROG: gift1 
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gift1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    FileReader fin = new FileReader("gift1.in");
	   Scanner sc =new Scanner(fin);
		int a,shareOfEach=0,rem=0;
	
	
		a=Integer.parseInt(sc.nextLine());
		String str[]=new String[a];
		
		Map<String,Integer> moneyLeft=new HashMap<String,Integer>();
	
		
		for(int i=0;i<a;i++)
		{
		    str[i]=sc.nextLine();
		    
		}
		for(int i=0;i<a;i++)
		{
		    moneyLeft.put(str[i],0);
		    
		}
		for(int j=0;j<a;j++)
		{
		    	shareOfEach=0;
		    	rem=0;
    		String giver=sc.nextLine();
    		int params[]=new int[2];
    		
    	 String readLine = sc.nextLine();
        String[] splitted = readLine.split(" ");
        for (int i = 0; i < 2; ++i)
        {
           params[i] = Integer.parseInt(splitted[i]);
        }
    		
    
    
    		String reciever[]=new String[params[1]];
    		for(int i=0;i<params[1];i++)
    		{
    		    reciever[i]=sc.nextLine();
    		}
    		if(params[1]!=0&&params[0]!=0)
    		{
    		shareOfEach=params[0]/params[1];
	    	rem=params[0]%params[1];
    		}
	        int m=moneyLeft.get(giver);
	        
	      //   m+=rem; 
	      
	       
	        m-=(shareOfEach*params[1]);
	           System.out.println(m);
	      
	        moneyLeft.put(giver,m);
	    	
	    	int temp[]=new int[params[1]];
	    	
	    	for(int i=0;i<params[1];i++)
    		{
    		   temp[i]=moneyLeft.get(reciever[i]);
    		   temp[i]+=shareOfEach;
    		   moneyLeft.put(reciever[i],temp[i]);
    		   
    		}
    		
    		
		}
		
		FileWriter fout = new FileWriter("gift1.out");
		for(int i=0;i<a;i++)
		{
        fout.write( str[i]+" "+moneyLeft.get( str[i])+"\n");
		}
        fout.close();
	
		
		
		
		
	}
}
