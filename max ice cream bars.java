class Solution {
    public int maxIceCream(int[] costs, int coins) {

        // Step 1: Find the maximum cost
        int maxCost = 0;

        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }

        // Step 2: Create frequency array
        int[] freq = new int[maxCost + 1];

        // Step 3: Count frequency of each cost
        for (int cost : costs) {
            freq[cost]++;
        }

        int count = 0;

        // Step 4: Buy ice creams from cheapest to costliest
        for (int cost = 1; cost <= maxCost; cost++) {

            while (freq[cost] > 0 && coins >= cost) {

                coins -= cost;   // Spend coins

                count++;         // Bought one ice cream

                freq[cost]--;    // Reduce frequency
            }
        }

        // Step 5: Return maximum ice creams bought
        return count;
    }
}