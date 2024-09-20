CREATE DATABASE gestion_patients;

USE gestion_patients;

CREATE TABLE patients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    date_naissance DATE NOT NULL,
    adresse VARCHAR(100),
    contact VARCHAR(15),
    date_admission DATETIME,
    id_medecin INT,
    chambre VARCHAR(10)
);

CREATE TABLE consultations (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT,
    date_consultation DATETIME,
    id_medecin INT,
    notes TEXT,
    FOREIGN KEY (patient_id) REFERENCES patients(id)
);

CREATE TABLE traitements (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT,
    medicament VARCHAR(100),
    dose VARCHAR(50),
    duree VARCHAR(50),
    FOREIGN KEY (patient_id) REFERENCES patients(id)
);
