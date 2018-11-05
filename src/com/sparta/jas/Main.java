package com.sparta.jas;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        Merge merger = new Merge(arr1, arr2);
        List<Integer> finalArray;
        finalArray = merger.merge();
        System.out.println(finalArray.toString());
    }
}
