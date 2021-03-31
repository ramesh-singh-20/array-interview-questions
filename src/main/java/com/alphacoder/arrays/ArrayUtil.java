package com.alphacoder.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtil {

    public static int maxNonOverLappingSumCount(int [] arr){
        int prev= 0;
        int prevCheckCount= 0;
        Map<Integer, Integer> sumCount= new HashMap<>();

        for(int i=0; i<arr.length-1; i++){
            int sum= arr[i]+ arr[i+1];

            if(sum== prev){
                prevCheckCount++;
                if(prevCheckCount%2!= 0) {
                    continue;
                }
            }

            sumCount.put(sum, sumCount.getOrDefault(sum, 0)+1);
            prev= sum;
        }

        return sumCount.values().stream().mapToInt(k -> k).max().getAsInt();
    }
}
