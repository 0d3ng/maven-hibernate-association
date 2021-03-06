/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 6:55:27 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.service;

import com.odeng.maven.hibernate.association.dao.GenericRepository;
import com.odeng.maven.hibernate.association.entitas.Mahasiswa;

/**
 *
 * @author od3ng
 */
public interface MahasiswaService extends GenericRepository<Mahasiswa> {

    public Mahasiswa getMahasiswaByNim(String nim);
}
