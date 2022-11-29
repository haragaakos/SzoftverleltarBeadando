package com.szoftverleltar;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(name = "gep")
public class Gep {
    @Id @GeneratedValue // Elsődleges kulcs, Auto_Increment
    @Column(name = "id")
    public int Id;
    @Column(name = "hely")
    public String Hely;
    @Column(name = "tipus")
    public int Tipus;
    @Column(name = "ipcim")
    public double IpCim;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getHely() {
        return Hely;
    }

    public void setHely(String hely) {
        Hely = hely;
    }

    public int getTipus() {
        return Tipus;
    }

    public void setTipus(int tipus) {
        Tipus = tipus;
    }

    public double getIpCim() {
        return IpCim;
    }

    public void setIpCim(double ipCim) {
        IpCim = ipCim;
    }
}