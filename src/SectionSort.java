public class SectionSort {
    //    static void sort(String[] A, int L, int U) {
//        if (L < U) {
//            int k = indexOfLargeset(A, L, U);
//            String temp = A[U];
//            A[U] = A[k];
//            A[k] = temp;
//            sort(A, L, U-1);
//        }
//    }
    //Iterative version
    static void sort(String[] A, int L, int U) {
        while (L < U) {
            int k = indexOfLargest(A, L, U);
            String temp = A[k];
            A[k] = A[U];
            A[U] = temp;
            U -= 1;
        }
    }

    //    static int indexOfLargest(String[] A , int i0, int i1) {
//        if (i0 >= i1) {
//            return i1;
//        }
//        else {
//            int k = indexOfLargest(A, i0 + 1, i1);
//            return (A[i1].compareTo(A[k]) > 0) ? i1 : k;
//        }
//    }
    //Iterative version
    static int indexOfLargest(String[] A, int i0, int i1) {
        int k;
        k = i1;
        for (int i = i1 - 1; i > i0; i--) {
            k = (A[k].compareTo(A[i]) > 0) ? k : i;
        }
        return k;
    }

    static void print(String[] A) {
     /*   for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
        System.out.println();
    }*/
        for (String s : A) {
            System.out.print(s + " ");
        }
    }
}
