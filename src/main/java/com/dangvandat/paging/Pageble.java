package com.dangvandat.paging;

public interface Pageble {
    Integer getPage();
    Integer getOffSet();
    Integer getLimit();
    Sorter getSorter();
}
