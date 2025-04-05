package org.pattern.binarysearch.findpeakelemnt;

public class LeetCode162 {
    public int findPeakElement(int[] nums) {
        int h = nums.length;
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[h - 1] > nums[h - 2])
            return h - 1;

        int l = 1;

        h = h - 2;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] < nums[m - 1]) {
                h = m - 1;
            } else if (nums[m] < nums[m + 1]) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
