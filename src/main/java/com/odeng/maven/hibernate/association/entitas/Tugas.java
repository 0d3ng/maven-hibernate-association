/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 18, 2019 7:47:47 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.entitas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author od3ng
 */
@Entity
@Table(name = "tugas")
public class Tugas implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nama;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal_submitted;
    @OneToMany(mappedBy = "tugas",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<MahasiswaTugas> mahasiswas = new ArrayList<>();

    public Tugas() {
    }

    public Tugas(String nama, Date tanggal_submitted) {
        this.nama = nama;
        this.tanggal_submitted = tanggal_submitted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggal_submitted() {
        return tanggal_submitted;
    }

    public void setTanggal_submitted(Date tanggal_submitted) {
        this.tanggal_submitted = tanggal_submitted;
    }

    public List<MahasiswaTugas> getMahasiswas() {
        return mahasiswas;
    }

    public void setMahasiswas(List<MahasiswaTugas> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }

}
