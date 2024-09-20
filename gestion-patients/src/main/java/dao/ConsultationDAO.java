package dao;

import model.Consultation;
import java.sql.*;

public class ConsultationDAO {
    private Connection connection;

    public ConsultationDAO(Connection connection) {
        this.connection = connection;
    }

    public void ajouterConsultation(Consultation consultation) {
        String sql = "INSERT INTO consultations (patient_id, date_consultation, id_medecin, notes) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, consultation.getPatientId());
            stmt.setTimestamp(2, new Timestamp(consultation.getDateConsultation().getTime()));
            stmt.setInt(3, consultation.getIdMedecin());
            stmt.setString(4, consultation.getNotes());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
