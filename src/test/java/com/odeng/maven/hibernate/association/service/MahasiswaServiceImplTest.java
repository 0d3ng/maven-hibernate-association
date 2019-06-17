/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 9:20:19 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.service;

import com.odeng.maven.hibernate.association.entitas.Alamat;
import com.odeng.maven.hibernate.association.entitas.Mahasiswa;
import com.odeng.maven.hibernate.association.util.HibernateUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author od3ng
 */
public class MahasiswaServiceImplTest {

    MahasiswaService service;

    @Before
    public void setUp() {
        service = new MahasiswaServiceImpl(HibernateUtil.getMahasiswaDao());
    }

    @After
    public void tearDown() {
        HibernateUtil.shutdown();
    }

    @Ignore
    @Test
    public void testSave() {
        Alamat a = new Alamat("Jln. Simpang Setaman 1", 6, 15, "Malanga", "Jawa Timur");
        Mahasiswa m = new Mahasiswa("075410099", "Noprianto", 3.99F, "Teknologi Informasi", a);
        assertTrue(service.save(m));
    }

//    @Ignore
    @Test
    public void testDelete() {
        Mahasiswa m = service.getMahasiswaByNim("075410099");
        assertTrue(service.delete(m));
    }

}
