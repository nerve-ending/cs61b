package worksheet3;

import discussion3.IntList;

public class demo {
    public static void main(String[] args) {
        System.out.println(sumDigits(31415));
        int i = 3;
        int a = i / 10;
        System.out.println(a);
    }
    public static int sumDigits(int num) {
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
    /*//递归版本求和
    public static int sumDigitsRecursive(int x) {
        if (x <= 0) {
            return 0;
        }
        return x % 10 + sumDigits(x / 10);
    }*/


    /*//Nondestructive
    public static IntList skipMe(IntList L) {
        IntList pointer = L;//旧表的工作指针，用来两格两格的移动
        IntList retPtr = new IntList(pointer.head, null);//新表的工作指针，作用是安装新表
        IntList retHead = retPtr;//新表的头指针，便于返回
        while (pointer.tail != null && pointer.tail.tail != null) {
            retPtr.tail = new IntList(pointer.tail.tail.head, null);
            pointer = pointer.tail.tail;
            retPtr = retPtr.tail;
        }
        return retHead;
    }*/
    //destructive
    public static void skipDestructive(IntList L) {
        if (L == null || L.tail == null) {
            return ;
        }
        L.tail = L.tail.tail;
        skipDestructive(L.tail);//错误的写成了L.tail.tail，一画图就看出了错误地方，因为在上一步L.tail已经变了
    }
}
