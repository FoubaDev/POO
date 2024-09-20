package model;

public class Traitement {
    private int id;
    private int patientId;
    private String medicament;
    private String dose;
    private String duree;

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }
    public String getMedicament() { return medicament; }
    public void setMedicament(String medicament) { this.medicament = medicament; }
    public String getDose() { return dose; }
    public void setDose(String dose) { this.dose = dose; }
    public String getDuree() { return duree; }
    public void setDuree(String duree) { this.duree = duree; }
}
