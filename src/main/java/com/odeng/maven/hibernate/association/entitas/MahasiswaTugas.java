/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 19, 2019 6:33:21 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.entitas;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table(name = "mhs_tgs")
public class MahasiswaTugas implements Serializable {

    @Id
    @ManyToOne
    private Mahasiswa mahasiswa;
    @Id
    @ManyToOne
    private Tugas tugas;

    public MahasiswaTugas() {
    }

    public MahasiswaTugas(Mahasiswa mahasiswa, Tugas tugas) {
        this.mahasiswa = mahasiswa;
        this.tugas = tugas;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Tugas getTugas() {
        return tugas;
    }

    public void setTugas(Tugas tugas) {
        this.tugas = tugas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.mahasiswa);
        hash = 79 * hash + Objects.hashCode(this.tugas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MahasiswaTugas other = (MahasiswaTugas) obj;
        if (!Objects.equals(this.mahasiswa, other.mahasiswa)) {
            return false;
        }
        if (!Objects.equals(this.tugas, other.tugas)) {
            return false;
        }
        return true;
    }

}
