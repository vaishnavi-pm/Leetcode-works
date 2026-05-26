class Solution {
    public void pattern22(int n) {

        // Size of square matrix
        int size = 2 * n - 1;

        // Outer loop -> rows
        for (int i = 0; i < size; i++) {

            // Inner loop -> columns
            for (int j = 0; j < size; j++) {

                // Distance from all 4 borders
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                // Smallest distance
                int min = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                // Print number
                System.out.print((n - min) + " ");
            }

            // Next line
            System.out.println();
        }
    }
}