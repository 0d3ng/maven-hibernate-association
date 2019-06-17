/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 17, 2019 6:37:06 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.entitas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table
public class Alamat implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String nama_jalan;
    private int RT;
    private int RW;
    private String kota;
    private String provinsi;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nim")
    private Mahasiswa mahasiswa;

    public Alamat() {
    }

    public Alamat(String nama_jalan, int RT, int RW, String kota, String provinsi) {
        this.nama_jalan = nama_jalan;
        this.RT = RT;
        this.RW = RW;
        this.kota = kota;
        this.provinsi = provinsi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_jalan() {
        return nama_jalan;
    }

    public void setNama_jalan(String nama_jalan) {
        this.nama_jalan = nama_jalan;
    }

    public int getRT() {
        return RT;
    }

    public void setRT(int RT) {
        this.RT = RT;
    }

    public int getRW() {
        return RW;
    }

    public void setRW(int RW) {
        this.RW = RW;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    @Override
    public String toString() {
        return "Alamat{" + "id=" + id + ", nama_jalan=" + nama_jalan + ", RT=" + RT + ", RW=" + RW + ", kota=" + kota + ", provinsi=" + provinsi + '}';
    }

}
