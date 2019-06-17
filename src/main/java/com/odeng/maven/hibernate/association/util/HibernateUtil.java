/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 6:57:54 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.util;

import com.odeng.maven.hibernate.association.dao.MahasiswaDao;
import com.odeng.maven.hibernate.association.dao.MahasiswaDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author od3ng
 */
public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY;

    private static MahasiswaDao mahasiswaDao;

    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            Logger.getLogger(HibernateUtil.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    private static SessionFactory getSESSION_FACTORY() {
        return SESSION_FACTORY;
    }

    public static MahasiswaDao getMahasiswaDao() {
        if (mahasiswaDao == null) {
            mahasiswaDao = new MahasiswaDaoImpl(getSESSION_FACTORY().openSession());
        }
        return mahasiswaDao;
    }

    public static void shutdown() {
        try {
            SESSION_FACTORY.close();
        } catch (HibernateException e) {
            Logger.getLogger(HibernateUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
