package discussion3;

import java.io.PrintStream;
import java.io.StringReader;

public class IntList {

    public int head;
    public IntList tail;

    /*List cell containing (HEAD, TAIL)*/
    public IntList(int head, IntList tail) {
        this.head = head;
        this.tail = tail;
    }

    public static IntList list(String[] args) {
        IntList L; //并不是new了一个新的IntList对象，这仅仅是一个盒子
        L = null;

        /*尾插法建表*/
        for (int i = args.length - 1; i >= 0 ; i--) {
            L = new IntList(Integer.parseInt(args[i]), L);
        }
        return L;
    }

    /*A new IntList containing the ints in ARGS*/
    /* From HW #1.  The ... syntax here is Java's way of allowing arbitrary
        numbers of arguments
    * */
    /*这样传递参数可以用{1,2,3,4}来传递，而上面那种就需要用命令行
    */
    public  static IntList list(int ... args) {//可变长参数列表...表示可以传入多个参数，
        IntList result, p;

        if (args.length > 0)
            result = new IntList(args[0], null);
        else
            return null;

        /*头插法建表*/
        int k;
        for (k = 1, p = result; k < args.length; k += 1, p = p.tail)
            p.tail = new IntList(args[k], null);
        return  result;
    }

    public static void printList(IntList L) {
        String sep;
        sep = ""; //sep盒子里是两个引号中间的内容，实际为空格
        while (L != null) {
            System.out.print(sep + L.head);
            sep = ", ";
            L = L.tail;
        }
    }
}
