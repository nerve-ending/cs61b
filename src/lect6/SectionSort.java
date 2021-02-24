package lect6;
/*
* 学习了选择排序来找最大值，其中String和String比较是用的(A[I].compareToA[k] > 0)的三目表达式
分为两个步骤：1、选择排序（迭代和递归思路一样：最大值和最后一个元素交换，右括号左移一，再找最大值排到最后，右括号再左移一，再排到最后。
*               但是迭代用while或者for循环不调自己，递归用if判断式就要调自己）
*  2、找出最大值（迭代方法：从后往前两两比较，用k来存储较大的那一个，for循环控制i指针从后往前移动；
*       递归方法：左括号在第一个后面，第一个和括号内最大的比较（用k存储），返回较大值，再左括号右移依次递归）
特殊的java打印字符串方法
* */

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

//    Iterative version
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
//            return (A[k].compareTo(A[i0]) > 0 ? k : i0);
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
