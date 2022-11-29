package szoftverleltar.szoftverleltar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class AdatbazisController {
    public VBox vBox;
    @FXML
    private Label welcomeText;
    public Menu adatbazis;
    public MenuItem olvas;
    public MenuItem olvas2;
    public MenuItem ir;
    public MenuItem modosit;
    public MenuItem torol;
    @FXML
    private Label action_result;
    @FXML private GridPane telepites_gp;
    @FXML private TextField tGép, tSzoftver, tVerzio, tDatum;
    @FXML private TableView tv1;
    @FXML private TableColumn<Telepites, Integer> IDCol;
    @FXML private TableColumn<Telepites, Integer> GepCol;
    @FXML private TableColumn<Telepites, Integer> SzoftverCol;
    @FXML private TableColumn<Telepites, String> VerzioCol;
    @FXML private TableColumn<Telepites, String> DatumCol;
    SessionFactory factory;
    @FXML void initialize() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onOlvasMenuItemClick(ActionEvent actionEvent) {
        tv1.setVisible(true);
        tv1.setManaged(true);
        tv1.getColumns().removeAll(tv1.getColumns());
        IDCol = new TableColumn("Id");
        GepCol = new TableColumn("Gép");
        SzoftverCol = new TableColumn("Szoftver");
        VerzioCol = new TableColumn("Verzió");
        DatumCol = new TableColumn("Dátum");
        tv1.getColumns().addAll(IDCol, GepCol, SzoftverCol, VerzioCol,DatumCol);
        IDCol.setCellValueFactory(new PropertyValueFactory<>("Id"));
        GepCol.setCellValueFactory(new PropertyValueFactory<>("GepId"));
        SzoftverCol.setCellValueFactory(new PropertyValueFactory<>("SzoftverId"));
        VerzioCol.setCellValueFactory(new PropertyValueFactory<>("Verzio"));
        DatumCol.setCellValueFactory(new PropertyValueFactory<>("Datum"));
        tv1.getItems().clear();

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        List<Telepites> lista = session.createQuery("FROM Telepites").list();
        for(Telepites telepites:lista)
            tv1.getItems().add(telepites);
        System.out.println();
        t.commit();
    }

    public void OnCreateTelepites(ActionEvent actionEvent) {
    }
}