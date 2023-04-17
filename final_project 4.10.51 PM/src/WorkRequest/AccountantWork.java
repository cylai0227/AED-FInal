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
public class AccountantWork extends WorkRequest{
    private Patient patientName;
    private double amount;
    private boolean withInsurance;
    
    public AccountantWork(){
        
    }

    public Patient getPatientName() {
        return patientName;
    }

    public void setPatientName(Patient patientName) {
        this.patientName = patientName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isWithInsurance() {
        return withInsurance;
    }

    public void setWithInsurance(boolean withInsurance) {
        this.withInsurance = withInsurance;
    }
    @Override 
    public String toString(){
        return String.valueOf(amount);
    }
}
