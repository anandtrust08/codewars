package io.pello.codewars.paginationhelper;

import java.util.List;

public class PaginationHelper<I> {
    private List<I> collection;
    private int itemsPerPage;

  
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

   
    public int itemCount() {
        return nullOrEmpty() ? 0 : collection.size();
    }

   
    public int pageCount() {
        return nullOrEmpty() ? 0 : (collection.size() / itemsPerPage) + 1;
    }

  
    public int pageItemCount(int pageIndex) {
        if (nullOrEmpty() || pageIndex > pageCount() - 1 || pageIndex < 0) return -1;

        if (pageCount() == 1) {
            return collection.size();
        } else if (pageIndex < pageCount() - 1) {
            return itemsPerPage;
        } else {
            return collection.size() % itemsPerPage;
        }
    }

    
    public int pageIndex(int itemIndex) {
        if (nullOrEmpty() || itemIndex > collection.size() || itemIndex < 0)  return -1;
        return (itemIndex / itemsPerPage);
    }

    public boolean nullOrEmpty() {
        return (null == collection || collection.size() == 0);
    }
}