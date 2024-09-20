package model;

import java.util.Date;

public class Patient {
    private int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private String contact;
    private Date dateAdmission;
    private int idMedecin;
    private String chambre;

    // Getters et Setters
    // ... (ajoutez les getters et setters pour les nouveaux champs)

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(String dateNaissance) { this.dateNaissance = dateNaissance; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
    public Date getDateAdmission() { return dateAdmission; }
    public void setDateAdmission(Date dateAdmission) { this.dateAdmission = dateAdmission; }
    public int getIdMedecin() { return idMedecin; }
    public void setIdMedecin(int idMedecin) { this.idMedecin = idMedecin; }
    public String getChambre() { return chambre; }
    public void setChambre(String chambre) { this.chambre = chambre; }
}
