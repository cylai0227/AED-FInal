/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import Patient.Patient;

/**
 *
 * @author whh
 */
public class GovernmentWork extends WorkRequest{
    private String financialSupportReason;
    private double amount;
    private Patient patientName;
    private boolean isAllowed;
    
    public GovernmentWork(String financialSupportReason, int amount, Patient patientName){
        this.financialSupportReason = financialSupportReason;
        this.amount = amount;
        this.patientName = patientName;
    }

    public String getFinancialSupportReason() {
        return financialSupportReason;
    }

    public void setFinancialSupportReason(String financialSupportReason) {
        this.financialSupportReason = financialSupportReason;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Patient getPatientName() {
        return patientName;
    }

    public void setPatientName(Patient patientName) {
        this.patientName = patientName;
    }

    public boolean isIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }
    
    
}
