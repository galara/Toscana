package com.toscana.model.dao.interfaces;

import java.io.Serializable;
import java.util.List;

public interface GeneralDAO<T, ID extends Serializable> {

    public void update(T e);

    public void delete(T e);

    public void add(T e);

    public T findByID(Class c, Integer ID);
    
    public List<T> findAll(Class c);
}
