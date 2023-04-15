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


    public Enterprise CreateEnterprise(Type EnterpriseName) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getEnterpriseType().equals(Type.getGOVERNMENT()) || enterprise.getEnterpriseType().equals(Type.getHOSPITAL()) || enterprise.getEnterpriseType().equals(Type.getINSURANCE()) ||  enterprise.getEnterpriseType().equals(Type.getPHARMACY())) {
                enterpriseList.add(enterprise);
            }
        }
        return null;
    }
}
