package com.dangvandat.repository;

import com.dangvandat.paging.Pageble;

import java.util.List;
import java.util.Map;

public interface GenericJDBC<T> {
    List<T> findAll(Map<String , Object> properties , Pageble pageble, Object... where);
}
