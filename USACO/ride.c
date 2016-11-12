/*
ID:rockerz1
LANG: C
PROG: ride 
*/

#include <stdio.h>
int calc(char *);
int main(void) 
{
    char c[2][15];
    int i,g,comet;
    
   FILE *fin=fopen ("ride.in", "r");
   FILE *fout = fopen ("ride.out", "w");
     for(i=0;i<2;i++)
     {
         fgets(c[i],14,fin);
       
     }
     
   //  printf("%s",c[0]);
   //  printf("%s",c[1]);
     comet=calc(c[0]);
     g=calc(c[1]);
     
     if((comet%47)==(g%47))
     {
          fprintf (fout, "GO\n");
     }
     else
     {
          fprintf (fout, "STAY\n");
     }
    
     
	// your code goes here prince
	return 0;
}


int calc(char a[])
{
        int s=1,i;
     for(i=0;i<6;i++)
     {
         switch(a[i])
         {
             case 'A':    s*=1;
                        break;
            case 'B':s*=2;
                        break;
            case 'C':s*=3;
                        break;
            case 'D':s*=4;
                        break;
            case 'E':s*=5;
                        break;
            case 'F':s*=6;
                        break;
            case 'G':s*=7;
                        break;
            case 'H':s*=8;
                        break;
            case 'I':s*=9;
                        break;
            case 'J':s*=10;
                        break;
            case 'K':s*=11;
                        break;
            case 'L':s*=12;
                        break;
            case 'M':s*=13;
                        break;
            case 'N':s*=14;
                        break;
            case 'O':s*=15;
                        break;
            case 'P':s*=16;
                        break;
            case 'Q':s*=17;
                        break;
            case 'R':s*=18;
                        break;
            case 'S':s*=19;
                        break;
            case 'T':s*=20;
                        break;
            case 'U':s*=21;
                        break;
            case 'V':s*=22;
                        break;
            case 'W':s*=23;
                        break;
            case 'X':s*=24;
                        break;
            case 'Y':s*=25;
                        break;
            case 'Z':s*=26;
                        break;
          
             
         }
         
         
         
     }
     
     return s;
     
}

