package prac;

public class Hollow_Print_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      //Outer Loop for number of Rows
	      for(int i=1;i<=4;i++)
	      {
	          // Inner loop for printing '*' in each column.
	          for(int j=1;j<=5;j++)
	          {
	              // For first row and last row we print '*' and for every other row we print the '*' at boundary region.
	              if(i==1 || j==1 || i==4 || j==5)
	              {
	              System.out.print("*  ");
	              }
	              // Otherwise we print blank space.
	              else
	              System.out.print("   ");
	          }
	          System.out.println();
	      }
	  }
	
	}


