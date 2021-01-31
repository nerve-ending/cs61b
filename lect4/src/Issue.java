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
    /*static IntList dRemoveALL(IntList L, int x) {
        if (L == null) {
            return null;
        }else if (L.head == x) {
            return dRemoveALL(L.tail, x);
        }else {
            L.tail = dRemoveALL(L.tail, x);
            return L;
        }
    }*/

    /*Iterative Destructive deletion*/
    /*迭代和循环的区别：
        迭代和递归都是循环的一种
        递归(recursion)是重复调用自身实现循环，将复杂问题逐步转化为基本问题
        循环(loop) - 最基础的概念, 所有重复的行为
        遍历(traversal) - 按规则访问非线性结构中的每一项
        迭代(iterate) - 按顺序访问线性结构中的每一项
    */
    /*模拟了一半，留*/
    static IntList dRemoveAll(IntList L, int x) {
        IntList result, last;
        result = last = null;
        while (L != null) {
            IntList next = L.tail;
            if (L.head != x) {
                if (last == null) {
                    result = last = L;
                }
                else {
                    last = last.tail = L;
                }
                L.tail = null;
            }
            L = next;
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

