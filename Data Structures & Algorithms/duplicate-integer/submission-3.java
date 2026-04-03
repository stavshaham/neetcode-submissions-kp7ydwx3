class Solution {
    public boolean hasDuplicate(int[] nums) {
        // O(n^2)
        // boolean found = false;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             found = true;
        //         }
        //     }
        // }

        // return found;

        // O(n)
        boolean found = false;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                found = true;
            }
        }

        return found;

    }
}