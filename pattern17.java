class Solution {
    public void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing letters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }

            // Decreasing letters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }

            System.out.println();
        }
    }
}