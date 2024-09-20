package controller;

import model.Patient;
import dao.PatientDAO;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.util.Date;

public class PatientController {
    @FXML
    private TextField nomField;
    @FXML
    private TextField prenomField;
    @FXML
    private TextField dateNaissanceField;
    @FXML
    private TextField adresseField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField idMedecinField;
    @FXML
    private TextField chambreField;

    private PatientDAO patientDAO;

    // Méthode pour définir la connexion
    public void setConnection(Connection connection) {
        this.patientDAO = new PatientDAO(connection);
    }

    @FXML
    public void ajouterPatient() {
        Patient patient = new Patient();
        patient.setNom(nomField.getText());
        patient.setPrenom(prenomField.getText());
        patient.setDateNaissance(dateNaissanceField.getText());
        patient.setAdresse(adresseField.getText());
        patient.setContact(contactField.getText());
        patient.setDateAdmission(new Date()); // ou récupérez la date d'admission d'un champ
        patient.setIdMedecin(Integer.parseInt(idMedecinField.getText()));
        patient.setChambre(chambreField.getText());

        patientDAO.ajouterPatient(patient);
        clearFields();
    }

    private void clearFields() {
        nomField.clear();
        prenomField.clear();
        dateNaissanceField.clear();
        adresseField.clear();
        contactField.clear();
        idMedecinField.clear();
        chambreField.clear();
    }
}
