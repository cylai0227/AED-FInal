/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author whh
 */
public class Insurance {
    private String insuranceName;
    private String companyName;
    private double insurancePrice;
    private String insuranceLastTime;
    
    public Insurance(String insuranceName, String companyName, double insurancePrice, String insuranceLastTime){
        this.insuranceName = insuranceName;
        this.companyName = companyName;
        this.insurancePrice = insurancePrice;
        this.insuranceLastTime = insuranceLastTime;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public String getInsuranceLastTime() {
        return insuranceLastTime;
    }

    public void setInsuranceLastTime(String insuranceLastTime) {
        this.insuranceLastTime = insuranceLastTime;
    }
    
}

