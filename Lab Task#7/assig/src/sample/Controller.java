package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.sql.*;

public class Controller {
    @FXML
    private TextField txtName;
    @FXML
    private Button btnSearch;
    @FXML
    private TableView<Model> table;
    @FXML
    private TableColumn<Model, String> col_Name;
    @FXML
    private TableColumn<Model, String> col_Roll;
    @FXML
    private TableColumn<Model, String> col_FName;
    @FXML
    private TableColumn<Model, String> col_Gender;
    @FXML
    private TableColumn<Model, String> col_Email;
    @FXML
    private TableColumn<Model, String> col_Address;

    private Connection cn;

    public void connect() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Student", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private ObservableList<studentDetails> data;

    public void initialize() {
        String name = txtName.getText();
        //System.out.println("name = "+name);
        connect();
        String query = "SELECT * FROM `Student_Info` WHERE Name = '" + name + "';";
        //System.out.println("name = "+query);
        try {
            data = FXCollections.observableArrayList();
            Statement stmnt = cn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);

            while (rs.next()) {
                data.add(new studentDetails(rs.getString("roll_no"), rs.getString("st_name"), rs.getString("f_name"), rs.getString("gender"), rs.getString("email"), rs.getString("address")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        colRollNo.setCellValueFactory(new PropertyValueFactory<>("RollNo"));
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colFName.setCellValueFactory(new PropertyValueFactory<>("FName"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));

        infoTbl.setItems(null);
        infoTbl.setItems(data);
    }


    table.getColumns().addAll(RollNo,Name);
    }
}
