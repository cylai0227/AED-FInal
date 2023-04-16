/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class InsuranceDirectory {
    public ArrayList<Insurance> insuranceList;
    
    public InsuranceDirectory(){
        this.insuranceList = new ArrayList<>();
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
    
}
