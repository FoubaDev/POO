package model;

import java.util.Date;

public class Consultation {
    private int id;
    private int patientId;
    private Date dateConsultation;
    private int idMedecin;
    private String notes;

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }
    public Date getDateConsultation() { return dateConsultation; }
    public void setDateConsultation(Date dateConsultation) { this.dateConsultation = dateConsultation; }
    public int getIdMedecin() { return idMedecin; }
    public void setIdMedecin(int idMedecin) { this.idMedecin = idMedecin; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
