/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurant;

import Insurance.Insurance;

/**
 *
 * @author whh
 */
public class Insurant {
    private String insurantName;
    private String insuranceId;
    private String insurantEmail;
    private int insurantPhonenum;
    private String insurantAddress;
    private Insurance insurance;
    
    public Insurant(Insurance insurance, String insuranceId){
        this.insurance = insurance;
        this.insuranceId = insuranceId;
    }

    public String getInsurantName() {
        return insurantName;
    }

    public void setInsurantName(String insurantName) {
        this.insurantName = insurantName;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsurantEmail() {
        return insurantEmail;
    }

    public void setInsurantEmail(String insurantEmail) {
        this.insurantEmail = insurantEmail;
    }

    public int getInsurantPhonenum() {
        return insurantPhonenum;
    }

    public void setInsurantPhonenum(int insurantPhonenum) {
        this.insurantPhonenum = insurantPhonenum;
    }

    public String getInsurantAddress() {
        return insurantAddress;
    }

    public void setInsurantAddress(String insurantAddress) {
        this.insurantAddress = insurantAddress;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    
    @Override
    public String toString(){
        return insuranceId;
    }
}
