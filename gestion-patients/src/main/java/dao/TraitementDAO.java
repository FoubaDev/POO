package dao;

import model.Traitement;
import java.sql.*;

public class TraitementDAO {
    private Connection connection;

    public TraitementDAO(Connection connection) {
        this.connection = connection;
    }

    public void ajouterTraitement(Traitement traitement) {
        String sql = "INSERT INTO traitements (patient_id, medicament, dose, duree) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, traitement.getPatientId());
            stmt.setString(2, traitement.getMedicament());
            stmt.setString(3, traitement.getDose());
            stmt.setString(4, traitement.getDuree());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
