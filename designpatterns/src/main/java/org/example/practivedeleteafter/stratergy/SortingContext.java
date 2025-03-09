package org.example.practivedeleteafter.stratergy;

public class SortingContext {
    private SortingStratergy sortingStratergy;

    public SortingContext(SortingStratergy sortingStratergy)
    {
        this.sortingStratergy=sortingStratergy;
    }

    public void setSortingStratergy(SortingStratergy sortingStratergy)
    {
        this.sortingStratergy=sortingStratergy;
    }

    public void peformSorting(int[] array)
    {
        sortingStratergy.sort(array);
    }
}
