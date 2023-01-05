class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int index = i - 1;
                while (index >= 0 && nums[index] == 0) {
                    index--;
                }
                index++;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            // System.out.println(Arrays.toString(nums));
        }
    }
}
