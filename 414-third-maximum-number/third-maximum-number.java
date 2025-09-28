class Solution {
    public int thirdMax(int[] nums) {
        long Max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Max || nums[i] == secondMax || nums[i] == thirdMax) {
                continue; // skip duplicates
            }

            if (nums[i] > Max) {
                thirdMax = secondMax;
                secondMax = Max;
                Max = nums[i];
                count++;
            } else if (nums[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
                count++;
            } else if (nums[i] > thirdMax) {
                thirdMax = nums[i];
                count++;
            }
        }

        if (count < 3) {
            return (int) Max;
        } else {
            return (int) thirdMax;
        }
    }
}
