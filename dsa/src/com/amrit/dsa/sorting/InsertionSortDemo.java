package com.amrit.dsa.sorting;

import java.util.Arrays;

/**
 * @author amrit
 * Description:
 * ============
 * 1. This is an "in-place" comparison-based sorting algorithm.
 * 2. A sub-list is maintained which is always sorted. For example, the lower part of an array is maintained
 * to be sorted. An element which is to be 'inserted' in this sorted sub-list, has to find its appropriate
 * place and then it has to be inserted there. Hence the name, insertion sort.
 * 3. It starts with the assumption that element in sorted partition are sorted , the first element is used to be
 * in sorted partition in the beginning i.e. in the beginning the first sorted partion is at the extreme left of the
 * array having only one element.
 * 4. First unsorted index = 1
 * 5. Insertion Sort is a:
 *      a) In Place Algorithm
 *      b) Complexity: O(n^2) : Quadratic
 *      c) Stable Algorithm
 *
 * */
public class InsertionSortDemo {

    public static void main(String [] args) {
        int[] unsortedArray = {20, 35, -15, 7, 55 ,1, -22};
        // print the array after sorting
        System.out.println("====================================");
        System.out.println("Sorted Array using Insertion Sort");
        System.out.println("====================================");
        System.out.println("Array Before Sorting: " + Arrays.toString(unsortedArray));
       // int unsortedIndex = 1;

        for(int unsortedIndex =1 ; unsortedIndex < unsortedArray.length ; unsortedIndex++){
            // current first UnsortedIndex i.e. first number in current unsorted partition
            int currentUnsortedNumber = unsortedArray[unsortedIndex];
            int sortedArrayIndex;

            //
            for(sortedArrayIndex = unsortedIndex  ; sortedArrayIndex > 0 && unsortedArray[sortedArrayIndex-1] > currentUnsortedNumber ; sortedArrayIndex-- ){
                unsortedArray[sortedArrayIndex] =  unsortedArray[sortedArrayIndex - 1];
            }

            unsortedArray[sortedArrayIndex] = currentUnsortedNumber;

        }


        System.out.println("Array After Sorting: " + Arrays.toString(unsortedArray));
        System.out.println("====================================");
    }

}
