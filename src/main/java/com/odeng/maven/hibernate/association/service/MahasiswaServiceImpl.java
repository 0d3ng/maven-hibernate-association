/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 6:56:02 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.service;

import com.odeng.maven.hibernate.association.dao.MahasiswaDao;
import com.odeng.maven.hibernate.association.entitas.Mahasiswa;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class MahasiswaServiceImpl implements MahasiswaService {

    private final MahasiswaDao dao;

    public MahasiswaServiceImpl(MahasiswaDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Mahasiswa o) {
        return dao.save(o);
    }

    @Override
    public boolean update(Mahasiswa o) {
        return dao.update(o);
    }

    @Override
    public boolean delete(Mahasiswa o) {
        return dao.delete(o);
    }

    @Override
    public List<Mahasiswa> getAll() {
        return dao.getAll();
    }

    @Override
    public Mahasiswa getMahasiswaByNim(String nim) {
        return dao.getMahasiswaByNim(nim);
    }

}
