package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = new int[]{5, 2, 4, 6, 1, 3, 0} ;
        System.out.println("Insertion sort:");
        System.out.print(Arrays.toString(a));
        insertionSortInt(a);
        System.out.print("   ->   " + Arrays.toString(a));
    }
    public static void insertionSortInt(int[] unsortedIntArr){
        for (int i = 0; i < unsortedIntArr.length - 1; i++ ){
            int newElement = unsortedIntArr[i+1];
            int location = i;
            while (location >= 0 && unsortedIntArr[location] > newElement){
                unsortedIntArr[location+1] = unsortedIntArr[location];
                unsortedIntArr[location] = newElement;
                location--;
            }
        }

    }
}
