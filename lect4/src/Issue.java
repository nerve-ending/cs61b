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
    /*destructive 递归版本*/
    /*这个递归我是这样理解的，如果此节点是要删除的（值是x），就直接把他的子节点拿去递归，这个就不要了
    * 因为返回结果是子节点的，跟这个节点再没有关系
    * 而如果这个节点不是，那就还是用L标记，最后继续返回它*/
    static IntList dRemoveALL(IntList L, int x) {
        if (L == null) {
            return null;
        }else if (L.head == x) {
            return dRemoveALL(L.tail, x);
        }else {
            L.tail = dRemoveALL(L.tail, x);
            return L;
        }
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

