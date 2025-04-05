package org.pattern.binarysearch.kokoeatingbanana;

import java.util.Arrays;

public class LeetCode875 {
    public static int minEatingSpeed(int[] piles, int h) {
       int max =  Arrays.stream(piles).max().getAsInt();
       int start = 1;
       int ans = Integer.MAX_VALUE;

       while(start <= max){
           int m = start + ((max-start)/2);
           int localTime = 0;
           for(int p : piles){
               double t = (double) p/m;
               localTime += Math.ceil(t);
               //localTime += (p + m - 1) / m;

           }
           if(localTime <= h){
               ans = Math.min(ans, m);
               max = m - 1;
           }else{
               start = m+1;
           }
       }
       return  ans;


    }
    public static void main(String args[]){
       int piles [] = {3,6,7,11};
        System.out.println(minEatingSpeed(piles, 8));
    }
}
