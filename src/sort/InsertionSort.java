package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = new int[]{5, 2, 4, 6, 1, 3} ;
        int j = 0;
        for (int i = 1; i <= a.length - 1; i++ ){
            int x = a[i];
            j = i - 1;
            while (i > 0 && a[i] > x){
                a[i+1] = a[i];
                a[i+1] = x;
            }
        }
        System.out.println(a);
    }
}
