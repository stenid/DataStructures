package dynamicArrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        dynamicArray.insert(50);
        dynamicArray.insert(60);

        dynamicArray.removeAt(0);

        int a = 20;
        int b = 100;
        System.out.println("Index of "+ a + " is: " + dynamicArray.indexOf(a));
        System.out.println("Index of "+ b + " is: " + dynamicArray.indexOf(b));

        dynamicArray.print();
    }
}
