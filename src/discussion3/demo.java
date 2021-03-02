package discussion3;

public class demo {

    /*非毁坏原始列表版本（可以新建节点）*/
    public static IntList reverseNondestructive(IntList L) {
        IntList result = null;
        while (L != null) {
            result = new IntList(L.head, result);
            L = L.tail;
        }
        return result;
    }

    /*敲一遍递归版本*/
    public static IntList reverseNondestructiveRecursive(IntList L) {
        if (L == null || L.tail == null) {
            return L;
        }
        else {
            IntList result = reverseNondestructiveRecursive(L.tail);
            L.tail.tail = L;
            L.tail = null;
            return result;
        }
    }
    /*敲一遍迭代版本*/
    public static IntList reverseNondestructiveIterative(IntList L) {
        if (L == null || L.tail ==null) {
            return L;
        }
        IntList A = L;
        IntList B = L.tail;
        A.tail = null;
        IntList C = null;
        while (B != null) {
            C = B.tail;
            B.tail = A;
            A = B;
            B = C;
        }
        return A;
    }

    public static IntList insertIterative(IntList L, int item, int position) {
        if (L == null) {
            return new IntList(item, L);
        }
        if (position == 0) {
            return new IntList(item, L);
        }
        else {
            IntList current = L;
            for (int i = item; i > 1; i--) {
                if (current.tail != null) {
                    current = current.tail;
                }
            }
            IntList C = new IntList(item, current.tail);
            current.tail = C;
        }
        return L;
    }

    /*敲一遍递归，有趣，其中一个参数—1，直到这个参数减完了就找到了位置*/
    public static IntList insertRecursive(IntList L, int item, int position) {
        if (L == null) {
            return new IntList(item, L);
        }
        if (position == 0) {
            return new IntList(item, L);
        }else {
            L.tail = insertIterative(L.tail, item, position - 1);
        }
        return L;
    }

    public static IntList shiftListDestructive(IntList L) {
        if (L == null) {
            return null;
        }
        IntList current = L;
        while (current.tail != null) {
            current = current.tail;
        }
        current.tail = L;
        IntList result = L.tail;
        L.tail = null;
        return result;

    }
}
