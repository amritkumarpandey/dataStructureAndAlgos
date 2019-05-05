package com.amrit.dsa.sorting;

import java.util.Arrays;

/**
 * @author amrit
 * Description:
 * ============
 * 1. Shell Sort is a variation of insertion sort.
 * 2. Insertion sort has Quadratic O(n^2) time complexity. However, it was observed that when the sequence of values
 * to to be sorted are almost sorted, the complexity reduces to almost linear time. It is because less shifting is
 *  required.
 * 3. Insertion sort choose which element to choose with the gap of 1.
 * 4. Shell Sort starts with a larger gap. As algorithm runs, the gap is reduced.
 * 5. Goal is to reduce amoount of shifting required.
 * 6. The last gap value is always 1.
 * 7.By the time we get to the insertion sort, the has partially been sorted, so there is less shifting required.
 * 8. In Other words, what shell sort does is preiliminary work, it sorts the array till almost sorted state and then
 *    Insertion sort kicks in to do rest of the job on almost sorted array provided by Shell Sort.
 * 9. Important: Choosing gap for shell sort is very important, the gap decides the complexity of the Shell sort algorithm.
 * 10. Choosing Gap/Interval for Shell Sort.
 *     ====================================
 *     There are various ways of choosing the interval, here are some:
 *     (i) KNUTH SEQUENCE:
 *         --------------
 *         a) Interval is caculated with the formula: (3^k -1)/2
 *              where, k = length of array
 *         b)  The goal is to set the gap as close as possible to the length of of the array, wiithout being
 *              greater than the length.
 *      (ii) Some time programmer tend to choose the gap with the value ~~(array.length/2)
 * 11. Shell Sort Facts:
 *      a) In - Place algorithm
 *      b) Difficult to nail down the complaxity because it depends on the chosen gap.
 *      c) Worst case complexity: O(n^2) , but it can perform much better than that.
 *      d) Doest not require much shifting as compared to Insertion sort, so comparatively performance is better.
 *      e) Unstable algorithm.
 *      f) SHell sort can also be used in conjunction of the BUBBLE Sort to improve the performance.
 *
 **/
public class ShellSortDemo {
    public static void main(String[] args){

        int[] unsortedArray = {20, 35, -15, 7, 55 ,1, -22};
        // print the array after sorting
        System.out.println("====================================");
        System.out.println("Sorted Array using Shell Sort");
        System.out.println("====================================");
        System.out.println("Array Before Sorting: " + Arrays.toString(unsortedArray));

        /*
        * Loop 1:
        * ========
        * 1. Maintains the gap
        * 2. Starts from gap = arr.length/2 and gap decreases to half in every subsequent pass
        **/
        for( int gap = unsortedArray.length / 2; gap > 0 ; gap /=2) {

            /*
             * Loop 2:
             * ========
             * 1. Picks elements right side of the gap one by one in every pass , till the end of the array
             * 2. Keeps the hold of the current element at the gap position
             * 3. keeps the track of the index from where current pass has started
             **/

            for(int rightEnd  = gap ; rightEnd < unsortedArray.length ; rightEnd++){
                // current value at the gap position
                int valueAtCurrentGapPosition = unsortedArray[rightEnd];
                // position where the current pass started at
                int leftEnd = rightEnd;

                /*
                 * Loop 3:
                 * ========
                 * 1. WHILE
                 *      (i) Till the leftEnd >= gap &&
                 *      (ii) Element at the left end of the gap is GREATER than the element at the right end of
                 *           the gap
                 *    Keep Doing the following
                 *       (i) Update Position at right end of the gap with the element at left end of the gap
                 *       (ii) jump left with another gap i,e, [leftEnd = leftEnd - gap]
                 *
                 **/

                 while(leftEnd >= gap && unsortedArray[leftEnd- gap] > valueAtCurrentGapPosition){
                     unsortedArray[leftEnd] = unsortedArray[leftEnd- gap] ;
                     leftEnd -= gap;
                 }

                 // update the left most end of the array position with the value at current gap
                 unsortedArray[leftEnd] = valueAtCurrentGapPosition;
            }



        }

        System.out.println("Array After Sorting: " + Arrays.toString(unsortedArray));
        System.out.println("====================================");

    }

}
