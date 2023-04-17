/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import Account.Account;
import Patient.Patient;
import java.util.Date;

/**
 *
 * @author whh
 */
public class HospitalWork extends WorkRequest{
    private Date visitDate;
    private String illnessDescription;
    private String treatmentSuggestion;
    private Account doctorName;
    private Patient patientName;
    private boolean complete;
    
    public HospitalWork(Date visitDate, Patient patientName, Account doctorName, String illnessDescription){
        this.visitDate = visitDate;
        this.illnessDescription = illnessDescription;
        this.doctorName = doctorName;
        this.patientName = patientName;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getIllnessDescription() {
        return illnessDescription;
    }

    public void setIllnessDescription(String illnessDescription) {
        this.illnessDescription = illnessDescription;
    }

    public String getTreatmentSuggestion() {
        return treatmentSuggestion;
    }

    public void setTreatmentSuggestion(String treatmentSuggestion) {
        this.treatmentSuggestion = treatmentSuggestion;
    }

    public Account getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(Account doctorName) {
        this.doctorName = doctorName;
    }

    public Patient getPatientName() {
        return patientName;
    }

    public void setPatientName(Patient patientName) {
        this.patientName = patientName;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    
}
