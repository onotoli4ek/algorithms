package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = new int[]{5, 2, 4, 6, 1, 3, 0} ;
        System.out.println("Insertion sort:");
        System.out.print(Arrays.toString(a));
//        insertionSortInt(a);
        selectionSort(a);
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

    public static void selectionSort(int[] arr){
    /*По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным */
            int min_element = i;
        /*В оставшейся части подмножества ищем элемент, который меньше предположенного минимума*/
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < arr[min_element]) {
                    min_element = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
            if (i != min_element) {
                int tmp = arr[i];
                arr[i] = arr[min_element];
                arr[min_element] = tmp;
            }
        }
    }

    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
}
