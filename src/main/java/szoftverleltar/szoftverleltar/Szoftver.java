package szoftverleltar.szoftverleltar;


import javax.persistence.*;

@Entity
@Table(name = "gep")
public class Szoftver {
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int Id;
    @Column(name = "nev")
    public String Nev;
    @Column(name = "kategoria")
    public String Kategoria;

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

    public void setId(Integer id) {
        this.Id = id;
    }

    public Integer getId() {
        return Id;
    }
}

