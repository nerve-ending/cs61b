/*
* final example
* In Java,the keyword final in variable declaration means that
* the variable's value may not be changed after the variable is initialized
* */

public class Issue {

    private final IntList aList = new IntList(0, null);

    public void modify(int k) {
        this.aList.head = k;
    }

    /*List Deletion*/
    /*Non-destructive 递归版本*/
    /*static IntList removeAll(IntList L, int n) {
        if (L == null)
            return null;
        else if (L.head == n) {
            return removeAll(L.tail, n);
        }
        else return new IntList(L.head, removeAll(L.tail, n));
    }*/

    /*Iterative Non-destructive 迭代版本*/
    static IntList removeAll(IntList L, int n) {
        IntList result = null, last = null;//last是新表的工作指针，而result用来标记新表头部
        for ( ; L != null; L = L.tail) { //L是工作指针
            if (L.head == n) {
                continue;
            }else if (last == null) {
                result = last = new IntList(L.head, null); //创造头部
            }else {
                last.tail = new IntList(L.head, null);
                last = last.tail;
            }
        }
        return result;
    }
}

class IntList {
    public int head;
    public IntList tail;

    public IntList(int head, IntList tail) {
        this.head = head;
        this.tail = tail;
    }
}

