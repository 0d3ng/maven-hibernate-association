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
import com.odeng.maven.hibernate.association.entitas.MataKuliah;
import com.odeng.maven.hibernate.association.util.HibernateUtil;
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
        m.getMataKuliahs().add(new MataKuliah("001", "Algoritma dan Pemrograman", (short) 3));
        m.getMataKuliahs().add(new MataKuliah("002", "Praktikum Algoritma dan Pemrograman", (short) 2));
        m.getMataKuliahs().add(new MataKuliah("003", "Struktur Data", (short) 3));
        m.getMataKuliahs().add(new MataKuliah("004", "Praktikum Struktur Data", (short) 2));
        assertTrue(service.save(m));
    }

}
