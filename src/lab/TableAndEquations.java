package lab;

public class TableAndEquations {

	public static void main(String[] args){
		
		PythagoreanTheorem();
	}
	
    


public static void PythagoreanTheorem() {
	// Create a table with 2 columns and 10 rows
    int numRows = 10;
    int numCols = 2;
    String[][] table = new String[numRows][numCols];

    // Initialize the table with values
    for (int row = 0; row < table.length ; row++) {
    for (int col = 0; col < table.length ; col++) {
        if (col == 0) {
          // First column: values from 0 to 9
          table[row][0] = String.valueOf(row);
        } else {
          // Second column: values from 10 to 19
          table[row][1] = String.valueOf(row);
        }
    }
    }
    // Print the table
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table.length; col++) {
    	  if (col == 0) {
              // First column: values from 0 to 9
              System.out.println(table[row][col]);
            } else {
              // Second column: values from 10 to 19
            	System.out.println(table[row][col]);
            }
      }
    }
      System.out.println();

    // Perform some calculations
    int x = 5;
    int y = 7;
    int sum = x + y;
    int difference = x - y;
    int product = x * y;
    double quotient = (double) x / y;

    System.out.println("x + y = " + sum);
    System.out.println("x - y = " + difference);
    System.out.println("x * y = " + product);
    System.out.println("x / y = " + quotient);
    
    for (int table1 = 1; table1 <= 10; table1++) {
        System.out.println("Multiplication Table of " + table);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\t",table1, i, table1 * i);
        }
        System.out.println("\n");
    }
  
    
    double a = 3.0; // length of side a
    double b = 4.0; // length of side b
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // length of side c (hypotenuse)
  
    System.out.println("Length of side a: " + a);
    System.out.println("Length of side b: " + b);
    System.out.println("Length of side c (hypotenuse): " + c);
    System.out.println("c^2 = a^2 + b^2 : " + c*c + " " + a*a + " " + b*b);
    
}
}
	
	
	