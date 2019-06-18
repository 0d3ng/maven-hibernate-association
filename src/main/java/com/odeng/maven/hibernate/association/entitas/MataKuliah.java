/*
 * maven-hibernate-association

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 18, 2019 6:39:17 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.hibernate.association.entitas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table(name = "mata_kuliah")
public class MataKuliah implements Serializable {

    @Id
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private short sks;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, short sks) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public short getSks() {
        return sks;
    }

    public void setSks(short sks) {
        this.sks = sks;
    }

}
