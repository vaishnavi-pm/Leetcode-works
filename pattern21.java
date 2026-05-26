class Solution {
    public void pattern21(int n) {

        // Outer loop -> rows
        for (int i = 1; i <= n; i++) {

            // Inner loop -> columns
            for (int j = 1; j <= n; j++) {

                // Print star on border
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } 
                // Print spaces inside
                else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}