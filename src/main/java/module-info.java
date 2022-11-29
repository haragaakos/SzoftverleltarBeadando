module szoftverleltar.szoftverleltar {
    requires javafx.controls;
    requires javafx.fxml;


    opens szoftverleltar.szoftverleltar to javafx.fxml;
    exports szoftverleltar.szoftverleltar;
}