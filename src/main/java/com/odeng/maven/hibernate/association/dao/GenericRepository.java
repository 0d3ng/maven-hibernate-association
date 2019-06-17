/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 6:51:01 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.dao;

import java.util.List;

/**
 *
 * @author od3ng
 * @param <T>
 */
public interface GenericRepository<T> {

    public boolean save(T o);

    public boolean update(T o);

    public boolean delete(T o);

    public List<T> getAll();
}
