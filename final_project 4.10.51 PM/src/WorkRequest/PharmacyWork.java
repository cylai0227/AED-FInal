/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import Account.Account;
import Patient.Patient;

/**
 *
 * @author whh
 */
public class PharmacyWork extends WorkRequest{
    private Patient patientName;
    private Account doctorName;
    private String prescription;
    private double amount;
    
    public PharmacyWork(Patient patientName){
        this.patientName = patientName;
    }

    public Patient getPatientName() {
        return patientName;
    }

    public void setPatientName(Patient patientName) {
        this.patientName = patientName;
    }

    public Account getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(Account doctorName) {
        this.doctorName = doctorName;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}

