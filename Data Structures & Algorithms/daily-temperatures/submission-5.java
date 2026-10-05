class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int counter = 0;
            int flag = 0;
            while (j < n && flag == 0) {
                if (temperatures[i] < temperatures[j]) {
                    flag = 1;
                }

                counter++;
                if (flag == 0) {
                    j++;
                }
            }
            
            counter = (j == n) ? 0 : counter;

            results[i] = counter;
        }

        return results;
    }
}
