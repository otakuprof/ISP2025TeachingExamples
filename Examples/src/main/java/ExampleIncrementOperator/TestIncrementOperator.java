package ExampleIncrementOperator;

import java.util.Arrays;

public class TestIncrementOperator {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int i = 0;
        a[i++] += 4;
        System.out.println(Arrays.toString(a));
        /** TODO For the code above, what is seen on the screen?
         * A {1, 4, 3, 4, 5}
         * B {1, 6, 3, 4, 5}
         * C {4, 2, 3, 4, 5}
         * D {5, 2, 3, 4, 5}
         */
    }
}
