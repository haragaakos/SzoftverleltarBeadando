package com.szoftverleltar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TelepitesController {
    @FXML
    private Label action_result;
    @FXML private GridPane telepites_gp;
    @FXML private TextField tGép, tSzoftver, tVerzio, tDatum;
    @FXML private TableView tv1;
    @FXML private TableColumn<Telepites, String> GepCol;
    @FXML private TableColumn<Telepites, String> SzoftverCol;
    @FXML private TableColumn<Telepites, String> VerzioCol;
    @FXML private TableColumn<Telepites, String> DatumCol;
    SessionFactory factory;
    @FXML void initialize() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();


    }
    @FXML protected void menuCreateClick() {
        telepites_gp.setVisible(true);
        telepites_gp.setManaged(true);
    }
    void Create() {
        Session session = null;
        session = factory.openSession();
        Transaction t = session.beginTransaction();

        SimpleDateFormat formatter1= new SimpleDateFormat("yyyy.mm.dd");
        Date date1 = formatter1.parse(tDatum.getText());


        Telepites telepites=new Telepites(Integer.parseInt(tGép.getText()), Integer.parseInt(tSzoftver.getText()), tVerzio.getText(), date1);
        session.save(telepites);
        t.commit();
    }
    @FXML void bt1Click(){
      /*  Create();
        vBox.getChildren().clear();
        action_result.setVisible(true);
        action_result.setManaged(true);
        action_result.setText("Adatok beírva az adatbázisba");*/
    }

    @FXML protected void menuReadClick() {
        /*tv1.setVisible(true);
        tv1.setManaged(true);
        tv1.getColumns().removeAll(tv1.getColumns());
        IDCol = new TableColumn("Id");
        névCol = new TableColumn("Név");
        korCol = new TableColumn("Kor");
        súlyCol = new TableColumn("Súly");
        tv1.getColumns().addAll(IDCol, névCol, korCol, súlyCol);
        IDCol.setCellValueFactory(new PropertyValueFactory<>("Id"));
        névCol.setCellValueFactory(new PropertyValueFactory<>("Név"));
        korCol.setCellValueFactory(new PropertyValueFactory<>("Kor"));
        súlyCol.setCellValueFactory(new PropertyValueFactory<>("Súly"));
        tv1.getItems().clear();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        List<Dolgozó> lista = session.createQuery("FROM Dolgozó").list();
        for(Dolgozó dolgozó:lista)
            tv1.getItems().add(dolgozó);
        System.out.println();
        t.commit();*/
    }
    @FXML protected void menuUpdateClick() {}
    @FXML protected void menuDeleteClick() {}



}
