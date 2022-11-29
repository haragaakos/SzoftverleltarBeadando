package com.szoftverleltar;

import javax.persistence.Column;
import java.util.Date;

public class Telepites {
    @Column(name = "id")
    public int Id;
    @Column(name = "gepid")
    public int Gepid;
    @Column(name = "szoftverid")
    public int SzoftverId;
    @Column(name = "verzio")
    public String Verzio;
    @Column(name = "datum")
    public Date Datum;

    public Telepites(int gepid, int szoftverid, String verzio, Date datum) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getGepid() {
        return Gepid;
    }

    public void setGepid(int gepid) {
        Gepid = gepid;
    }

    public int getSzoftverId() {
        return SzoftverId;
    }

    public void setSzoftverId(int szoftverId) {
        SzoftverId = szoftverId;
    }

    public String getVerzio() {
        return Verzio;
    }

    public void setVerzio(String verzio) {
        Verzio = verzio;
    }

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date datum) {
        Datum = datum;
    }
}
