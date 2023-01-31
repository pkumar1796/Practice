package prac;

public class parttern_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	//	int n = 5;
	      //Outer Loop for number of Rows
	      for(int i=0;i<=4;i++)
	      {
	          // Inner loop for printing '*' in each column.
	          for(int j=0;j<=5;j++)
	          {
	              // We add two spaces to match shape of a square.
	              System.out.print("*  ");
	          }
	          System.out.println();
	      }
	  }
	}