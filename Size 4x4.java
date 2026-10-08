public class Size4x4 {
    public static void main(String[] args) {
        int[][] grid = new int[4][4];
        int value = 1;
        
        // Populate the 4x4 array
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
        
                if (i == j) {
                    grid[i][j] = 0; 
                } else {
                    grid[i][j] = value; 
                }
                value++; 
            }
        }
        
        /
        System.out.println("4x4 Array with Zeroes on the Main Diagonal:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}