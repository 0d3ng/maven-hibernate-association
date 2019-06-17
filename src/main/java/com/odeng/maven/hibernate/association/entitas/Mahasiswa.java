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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table
public class Mahasiswa implements Serializable {

    @Id
    private String nim;
    private String nama;
    private float ipk;
    private String jurusan;
    @OneToOne(mappedBy = "mahasiswa", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Alamat alamat;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, float ipk, String jurusan, Alamat alamat) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.jurusan = jurusan;
        this.alamat = alamat;
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

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        if (alamat == null) {
            if (this.alamat != null) {
                this.alamat.setMahasiswa(null);
            }
        } else {
            alamat.setMahasiswa(this);
        }
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + ", jurusan=" + jurusan + ", alamat=" + alamat + '}';
    }

}
