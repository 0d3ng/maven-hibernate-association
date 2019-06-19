/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 6:36:14 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.entitas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable {

    @Id
    private String nim;
    private String nama;
    private float ipk;
    private String jurusan;
    @OneToMany(mappedBy = "mahasiswa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MahasiswaTugas> tugases = new ArrayList<>();

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, float ipk, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void addTugas(Tugas tugas) {
        MahasiswaTugas mahasiswaTugas = new MahasiswaTugas(this, tugas);
        tugases.add(mahasiswaTugas);
        tugas.getMahasiswas().add(mahasiswaTugas);
    }

    public void removeTugas(Tugas tugas) {
        MahasiswaTugas mahasiswaTugas = new MahasiswaTugas(this, tugas);
        tugas.getMahasiswas().remove(mahasiswaTugas);
        tugases.remove(mahasiswaTugas);
        mahasiswaTugas.setMahasiswa(null);
        mahasiswaTugas.setTugas(null);
    }

    public List<MahasiswaTugas> getTugases() {
        return tugases;
    }

    public void setTugases(List<MahasiswaTugas> tugases) {
        this.tugases = tugases;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + ", jurusan=" + jurusan + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nim);
        hash = 59 * hash + Objects.hashCode(this.nama);
        hash = 59 * hash + Float.floatToIntBits(this.ipk);
        hash = 59 * hash + Objects.hashCode(this.jurusan);
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
        final Mahasiswa other = (Mahasiswa) obj;
        if (Float.floatToIntBits(this.ipk) != Float.floatToIntBits(other.ipk)) {
            return false;
        }
        if (!Objects.equals(this.nim, other.nim)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.jurusan, other.jurusan)) {
            return false;
        }
        return true;
    }

}
