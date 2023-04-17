/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Account.Account;
import Insurant.Insurant;
import java.util.Date;

/**
 *
 * @author whh
 */
public class Patient {
    private String patientId;
    private String patientName;
    private int patientAge;
    private String patientAddress;
    private int patientPhonenum;
    private boolean finishVisit;
    private Date appointmentDate;
    private Account userAccount;
    private Insurant insurantInfo;
    
    public Patient(){
        
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public int getPatientPhonenum() {
        return patientPhonenum;
    }

    public void setPatientPhonenum(int patientPhonenum) {
        this.patientPhonenum = patientPhonenum;
    }

    public boolean isFinishVisit() {
        return finishVisit;
    }

    public void setFinishVisit(boolean finishVisit) {
        this.finishVisit = finishVisit;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Account userAccount) {
        this.userAccount = userAccount;
    }

    public Insurant getInsurantInfo() {
        return insurantInfo;
    }

    public void setInsurantInfo(Insurant insurantInfo) {
        this.insurantInfo = insurantInfo;
    }
    
    @Override
    public String toString(){
        return patientId;
    }
}
