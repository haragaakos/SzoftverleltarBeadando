module szoftverleltar.szoftverleltar {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires java.naming;
    requires java.sql;


    opens szoftverleltar.szoftverleltar to javafx.fxml;
    exports szoftverleltar.szoftverleltar;
}