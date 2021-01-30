public class IntList {
    public int head;
    public IntList tail;

    public IntList() {

    }
    public IntList(int head, IntList tail) {
        this.head = head;
        this.tail = tail;
    }

    public static void main(String[] args) {
        IntList Q, L;

        L = new IntList(3, null);
        Q = L;

        Q= new IntList(42, null);
        L.tail = Q;

        L.tail.head += 1;
        System.out.println(L.tail.head);
    }
}
