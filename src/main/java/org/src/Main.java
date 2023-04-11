package org.src;

public class Main {
    public static void main(String[] args) {
        ArrayWorker<Integer> arrayWorkerInteger = new ArrayWorker<Integer>();
        System.out.println("Integer type");
        arrayWorkerInteger.countGreaterThan(arrayWorkerInteger.IntegerArray, arrayWorkerInteger.integerComparator);

        ArrayWorker<Double> arrayWorkerDouble = new ArrayWorker<Double>();
        System.out.println("Double type");
        arrayWorkerDouble.countGreaterThan(arrayWorkerDouble.DoubleArray, arrayWorkerDouble.doubleComparator);
    }

}