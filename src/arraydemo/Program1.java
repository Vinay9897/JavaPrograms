package arraydemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

// Given an array arr containing N positive integers, sort them 
// according to the increasing modulus of their values with their frequencies.

public class Program1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 5, 3, 2, 3, 3, 3, 4, 5, 4, 5 };
        int len = arr.length;
        sort(arr, len);
    }

    private static void sort(int[] arr, int len) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count  = 0 ;
        for (int i = 0; i < len; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            
            } else
                freq.put(arr[i], 1);
                count +=1;
        }
        // for (Entry<Integer, Integer> entrySet : freq.entrySet()) {
        //     System.out.println("Key:" + entrySet.getKey() + " Value :" + entrySet.getValue());
        // }
        for(int i = 0; i<count;i++ ){
            
        }
    }

}
