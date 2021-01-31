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

    /*
    This is valid:
    Although modify changes the head variable of the object pointed
    to by aList, it does not modify the contents of aList itself(which is a pointer)
    */
    /*递归，破坏版本
     * 所以不用return new*/
    /*static IntList dIncrList(IntList P, int n) {
        if (P == null)
            return null;
        else {
            P.head += n;
            P.tail = dIncrList(P.tail, n);
            return P;
        }
    }*/

    /*for循环版本，非递归，破坏版本*/
    static IntList dIncrList(IntList L, int n) {
        IntList p;
        for (p = L; p != null; p = p.tail) {
            p.head += n;
        }
        return L;
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

