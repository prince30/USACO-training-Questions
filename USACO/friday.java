/*
ID:rockerz1
LANG: JAVA
PROG: friday 
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class friday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   //Following sat sun mon tue wed thu fri 
	    FileReader fin = new FileReader("friday.in");
	   int totalDays=1;
	  
	  
	   int monthDays[]=new int[12];
	    int daysNum[]=new int[8];
	    
	   
	   Scanner sc =new Scanner(fin);
		int N;
	                         
		N=Integer.parseInt(sc.nextLine());
	  monthDays[0]=31;
	  monthDays[1]=28;
	  monthDays[2]=31; 
	  monthDays[3]=30;
	  monthDays[4]=31; 
	  monthDays[5]=30;
	  monthDays[6]=31;
	  monthDays[7]=31;
	  monthDays[8]=30;
	  monthDays[9]=31;
	  monthDays[10]=30;
	  monthDays[11]=31;
   
    for (int years = 1900; years <(1900+N); years++) 
    {
            
        if (years % 4 == 0)
		{		
			monthDays[1]=29;


             if (years % 100 == 0 && years % 400 != 0)
                monthDays[1]=28;
        }
        else
            monthDays[1]=28;
        for (int month = 0; month < 12; month++)
        {
            for (int day = 0; day < monthDays[month]; day++)
            {
		totalDays++; 
                if (day == 12)

                       daysNum[totalDays % 7]++; 

            }
        }
    }

  
     
		FileWriter fout = new FileWriter("friday.out");
		for(int i=0;i<6;i++)
		{
        fout.write(daysNum[i]+" ");
		}
        fout.write(daysNum[6]+"\n");
        fout.close();
		
	}
}
