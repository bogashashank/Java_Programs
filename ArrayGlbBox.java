public class ArrayGlbBox {
    public static void main(String[] args) {
        // Declare a 2D array with 4 rows and 4 columns
        int[][] grid = new int[4][4];
        
        int value = 1;
        
        // Populate the 4x4 array with numbers 1 through 16
        for (int i = 0; i < grid.length; i++) {           // Outer loop for rows
            for (int j = 0; j < grid[i].length; j++) {    // Inner loop for columns
                grid[i][j] = value;
                value++;
            }
        }
        
        // Print the 2D array
        System.out.println("4x4 2D Array Output:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // Print each element with a tab space (\t) for neat column alignment
                System.out.print(grid[i][j] + "\t");
            }
            // Move to the next line after printing all columns in the current row
            System.out.println(); 
        }
    }
}