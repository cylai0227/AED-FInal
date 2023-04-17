/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import Insurant.Insurant;

/**
 *
 * @author whh
 */
public class InsuranceWork extends WorkRequest{
    private Insurant insurantName;
    private String insurantPhonenum;
    private double insuranceAmount;
    private String insuranceId;
    

    public Insurant getInsurantName() {
        return insurantName;
    }

    public void setInsurantName(Insurant insurantName) {
        this.insurantName = insurantName;
    }

    public String getInsurantPhonenum() {
        return insurantPhonenum;
    }

    public void setInsurantPhonenum(String insurantPhonenum) {
        this.insurantPhonenum = insurantPhonenum;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }
    
}
