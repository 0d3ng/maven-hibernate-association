/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 19, 2019 6:51:00 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.dao;

import com.odeng.maven.hibernate.association.entitas.Tugas;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author od3ng
 */
public class TugasDaoImpl implements TugasDao{

    private final Session session;

    public TugasDaoImpl(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(Tugas m) {
        try {
            session.beginTransaction();
            session.saveOrUpdate(m);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(TugasDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        }
        return false;
    }

    @Override
    public boolean update(Tugas m) {
        try {
            session.beginTransaction();
            session.update(m);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(TugasDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Tugas m) {
        try {
            session.beginTransaction();
            session.delete(m);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(TugasDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Tugas> getAll() {
        try {
            return session.createQuery("FROM Tugas", Tugas.class).list();
        } catch (Exception e) {
            Logger.getLogger(TugasDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return null;
    }
    
}
