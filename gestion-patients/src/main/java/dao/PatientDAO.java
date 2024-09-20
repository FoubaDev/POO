package dao;

import model.Patient;
import java.sql.*;

public class PatientDAO {
    private Connection connection;

    // Constructeur acceptant une connexion
    public PatientDAO(Connection connection) {
        this.connection = connection;
    }

    public void ajouterPatient(Patient patient) {
        String sql = "INSERT INTO patients (nom, prenom, date_naissance, adresse, contact, date_admission, id_medecin, chambre) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, patient.getNom());
            stmt.setString(2, patient.getPrenom());
            stmt.setString(3, patient.getDateNaissance());
            stmt.setString(4, patient.getAdresse());
            stmt.setString(5, patient.getContact());
            stmt.setTimestamp(6, new Timestamp(patient.getDateAdmission().getTime()));
            stmt.setInt(7, patient.getIdMedecin());
            stmt.setString(8, patient.getChambre());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Ajoutez d'autres méthodes pour gérer les patients
}
