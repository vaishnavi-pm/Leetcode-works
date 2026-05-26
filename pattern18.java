class Solution {
    public void pattern18(int n) {
        
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            
            // Find starting character for each row
            // Row1 = E, Row2 = D, Row3 = C ...
            char start = (char)('A' + n - i);

            // Inner loop to print characters from start to E
            for (char ch = start; ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}