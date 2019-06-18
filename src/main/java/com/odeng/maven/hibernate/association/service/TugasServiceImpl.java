/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 19, 2019 6:53:26 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.service;

import com.odeng.maven.hibernate.association.dao.TugasDao;
import com.odeng.maven.hibernate.association.entitas.Tugas;
import com.odeng.maven.hibernate.association.entitas.Tugas;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class TugasServiceImpl implements TugasService{

    private final TugasDao dao;

    public TugasServiceImpl(TugasDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Tugas o) {
        return dao.save(o);
    }

    @Override
    public boolean update(Tugas o) {
        return dao.update(o);
    }

    @Override
    public boolean delete(Tugas o) {
        return dao.delete(o);
    }

    @Override
    public List<Tugas> getAll() {
        return dao.getAll();
    }
    
}
