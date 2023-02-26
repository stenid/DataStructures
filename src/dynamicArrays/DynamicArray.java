package dynamicArrays;

public class DynamicArray {
    private int[] items;
    private int count = 0;


    public DynamicArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }


    public void insert(int item) {
        if (items.length == count) {
            int[] newArray = new int[items.length * 2];
            for (int i = 0; i < count; i++)
                newArray[i] = items[i];

            items = newArray;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Enter value between 0 and " + (count - 1));

        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf (int value) {
        for (int i = 0; i < count; i++) {
            if (items[i] == value)
                return i;
        }
        return -1;
    }


}
