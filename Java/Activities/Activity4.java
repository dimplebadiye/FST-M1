package org.Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] numbArr = new int[] {4, 3, 2, 10, 12, 1, 5, 6};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(numbArr));
        ascendingSort(numbArr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(numbArr));
    }

    static void ascendingSort(int[] array) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = temp;
        }
    }
}
