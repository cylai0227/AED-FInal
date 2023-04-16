/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Enterprise.Enterprise.Type;
import Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }


    public Enterprise CreateEnterprise(Type EnterpriseName, String enterpriseEmail, String enterpriseAddress) {
        Enterprise enterprise;
        if(EnterpriseName == Type.Government) {
            enterprise = new GovernmentEnterprise(enterpriseEmail, enterpriseAddress);
            enterpriseList.add(enterprise);
            return enterprise;     
        }
        if(EnterpriseName == Type.Hopital) {
            enterprise = new HospitalEnterprise(enterpriseEmail, enterpriseAddress);
            enterpriseList.add(enterprise);
            return enterprise;     
        }
        if(EnterpriseName == Type.Pharmacy) {
            enterprise = new PharmacyEnterprise(enterpriseEmail, enterpriseAddress);
            enterpriseList.add(enterprise);
            return enterprise;     
        }
        if(EnterpriseName == Type.Insurance) {
            enterprise = new InsuranceEnterprise(enterpriseEmail, enterpriseAddress);
            enterpriseList.add(enterprise);
            return enterprise;     
        }
        return null;
    }
}
