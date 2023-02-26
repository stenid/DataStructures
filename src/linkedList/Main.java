package linkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.removeLast();

        System.out.println(list.indexOf(50));
        System.out.println(list.contains(40));

        list.removeFirst();
        System.out.println(list.indexOf(10));
    }
}
