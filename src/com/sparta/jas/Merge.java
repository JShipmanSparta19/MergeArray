package com.sparta.jas;

import java.util.ArrayList;
import java.util.List;

public class Merge {
    private int[] arr1;
    private int[] arr2;

    Merge(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    private List<Integer> finArr = new ArrayList<>();

    public List<Integer> merge() {
        int indexArr1 = 0;
        int indexArr2 = 0;
        while(indexArr1 < arr1.length || indexArr2 < arr2.length){
            if (indexArr1 == arr1.length){
                finArr.add(arr2[indexArr2]);
                indexArr2++;
            } else if (indexArr2 == arr2.length){
                finArr.add(arr1[indexArr1]);
                indexArr1++;
            } else if (arr1[indexArr1] < arr2[indexArr2]) {
                finArr.add(arr1[indexArr1]);
                indexArr1++;
            } else {
                finArr.add(arr2[indexArr2]);
                indexArr2++;
            }
        }
        return finArr;
    }
}

