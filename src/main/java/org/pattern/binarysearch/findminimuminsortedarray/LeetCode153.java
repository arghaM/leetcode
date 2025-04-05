package org.pattern.binarysearch.findminimuminsortedarray;

public class LeetCode153 {
    public int findMin(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(l<= h ){
            int m = l+ (h-l)/2;
            if(arr[m]<= arr[h] ){
                min = Math.min(min,arr[m]);
                h = m-1;
            }else{
                min = Math.min(min,arr[l]);
                l = m+1;
            }
        }
        return min;
    }
}
