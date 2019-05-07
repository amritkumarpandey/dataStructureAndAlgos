package com.amrit.dsa.sorting.recursive;

import java.util.Arrays;

/**
 * @author amrit
 * Description:
 * ============
 * 1. Based on Devide and Conquer Algorithm
 * 2. Recursive Algorith
 * 3. Two Phases: Splitting and Sorting method
 * 4. Splitting results in faster Sorting
 * 5. Splitting is logica, no new array is created
 * 6. Not an In-Place Algorithm
 * 7.Complexity: O(nlogn) base 2
 * 8. Stable Algorithm
 *
 * */
public class MergeSortDemo {
    public static void main(String [] args) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        // print the array after sorting
        System.out.println("====================================");
        System.out.println("Sorted Array using Merge Sort");
        System.out.println("====================================");
        System.out.println("Array Before Sorting: " + Arrays.toString(inputArray));
        mergeSort(inputArray, 0,inputArray.length);
        System.out.println("Array After Sorting: " + Arrays.toString(inputArray));
        System.out.println("====================================");

    }

    public static void mergeSort(int[] inputArray , int start , int end) {

        if(end - start < 2){
            return;
        }

        int mid = (start +  end ) /2;

        // split left partition
        mergeSort(inputArray, start , mid);
        //split right partition
        mergeSort(inputArray, mid, end);

        // merge the splitted partitions

        mergeSort(inputArray , start , mid, end);

    }

    private static void mergeSort(int[] inputArray, int start, int mid, int end) {

        // check if partitions are already sorted
        if(inputArray[mid -1 ] <= inputArray [mid]){
            return;
        }

        // the array is not already sorted, therefore sorting and merging of splitted arrays are required
        int splittedLeftArrayStart = start;
        int splittedRightArrayStart = mid;
        int tempCurrent = 0;
        int[] temp = new int[end - start];

        while (splittedLeftArrayStart < mid && splittedRightArrayStart < end){
            temp[tempCurrent++] = (inputArray[splittedLeftArrayStart] <= inputArray[splittedRightArrayStart] ? inputArray[splittedLeftArrayStart++] : inputArray[splittedRightArrayStart++]);
        }
        /**
         * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         *           Copies an array from the specified source array, beginning at the specified position,
         *           to the specified position of the destination array.
         *
         * */
        /*System.out.println("inputArray: " + Arrays.toString(inputArray));
        System.out.println("splittedLeftArrayStart: " + splittedLeftArrayStart);
        System.out.println("start+ tempCurrent: " + (start+ tempCurrent));
        System.out.println("mid-1: " + (mid-1));*/
        System.arraycopy(inputArray , splittedLeftArrayStart , inputArray , start+ tempCurrent , mid-splittedLeftArrayStart);

        System.arraycopy(temp, 0 , inputArray , start , tempCurrent);
    }
}
