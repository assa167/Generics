package org.src;

public class ArrayWorker<T extends Number & Comparable<T>> {

    Integer[] IntegerArray = {1, 2, 3, 4, 5, 5, 5, 5};
    Double[] DoubleArray = {1.2, 2.3, 3.5, 5.5, 6.7};

    Integer integerComparator = 5;
    Double doubleComparator = 3.5;

    public int countGreaterThan(T[] array, T element) {
        int count = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a].equals(element)){
                count++;
            }
        }
        System.out.println("Count: " + count + "\n");
        return count;
    }

}
