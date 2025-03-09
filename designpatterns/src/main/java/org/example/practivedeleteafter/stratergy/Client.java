package org.example.practivedeleteafter.stratergy;

public class Client {
    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        SortingContext sortingContext=new SortingContext(mergeSort);
        sortingContext.peformSorting(new int[] {1,2,3});
    }
}
