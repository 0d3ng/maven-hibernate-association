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

import com.odeng.maven.hibernate.association.entitas.Mahasiswa;
import com.odeng.maven.hibernate.association.entitas.Tugas;
import com.odeng.maven.hibernate.association.util.HibernateUtil;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void testSave() {
        Mahasiswa m = new Mahasiswa("075410099", "Noprianto", 3.99F, "Teknologi Informasi");
        Mahasiswa m2 = new Mahasiswa("075410100", "Noureen Akhleema Shannum", 4F, "Teknologi Informasi");
        Tugas t = new Tugas("Buat web menggunakan teknologi hibernate", new Date());
        Tugas t1 = new Tugas("Buat aplikasi mobile dengan penggunaan Fragment", new Date());
        m.getTugases().add(t);
        m.getTugases().add(t1);
        m2.getTugases().add(t);
        assertTrue(service.save(m));
        assertTrue(service.save(m2));
    }

}
