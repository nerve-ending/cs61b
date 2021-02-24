package lect6;

public class Shove {
    public static void main(String[] args) {
        int[] A = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            A[i] = Integer.parseInt(args[i]);
        }
        moreOver(A);
        for (int s: A) {
            System.out.println(s + " ");
        }
        System.out.println();
    }

    static void moreOver(int[] A) {
        moreOver(A, A.length);
    }

//感觉挺像冒泡排序的算法的一小部分，即从k位置开始的，即从右往左的第一个比他小的数之后的数组
//这里是冒泡排序两两比较，只是每次指针减一，即比较指针和指针的前一个。
// sectionSort是包含一个查找最大值和排序的过程。
    static void moreOver(int[] A, int U) {
        if (U > 0) {
            if (A[U] < A[U - 1]) {
                int tmp = A[U];
                A[U] = A[U - 1];
                A[U - 1] = tmp;
                moreOver(A, U - 1);
            }
        }
    }
}
