package com.szoftverleltar;

import javax.persistence.Column;

public class Szoftver {
    @Column(name = "id")
    public int Id;
    @Column(name = "nev")
    public String Nev;
    @Column(name = "kategoria")
    public String Kategoria;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNev() {
        return Nev;
    }

    public void setNev(String nev) {
        Nev = nev;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public void setKategoria(String kategoria) {
        Kategoria = kategoria;
    }
}

