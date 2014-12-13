package fibonacci;

import java.util.Scanner;

public class LastElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fib = s.nextInt();
        int f1=0;
        int f2=1;
        int temp;
        if (fib == 0){
            System.out.println(f1);
        } else {
            for (int i=2; i<=fib; i++) {
                temp = (f1 + f2) % 10;
                f1 = f2;
                f2 = temp;
            }
            System.out.println(f2);

        }


    }
    static int lastNumberOfElement (int n) {
        int[] f = new int[2];
        f[0]=1; f[1]=1;
        for (int i=2; i<=(n-1); i++) {
            f[i % 2] = (f[i % 2] + f[(i + 1) % 2]) % 10;
        }
        System.out.println("~~~~~~");
        return f[(n-1)%2];
    }

    static int lastNumberOfElement2 (int n) {
        int f1=0;
        int f2=1;
        int temp;
        if (n == 0){
            return f1;
        } else {
            for (int i=2; i<=n; i++) {
                temp = (f1 + f2) % 10;
                f1 = f2;
                f2 = temp;
            }
            System.out.println("~~~~~~");
            return f2;

        }
    }
}
