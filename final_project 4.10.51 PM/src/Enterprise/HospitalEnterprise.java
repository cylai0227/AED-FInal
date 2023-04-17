/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String enterpriseEmail, String enterpriseAddress) {
        super(Type.Hopital, enterpriseEmail, enterpriseAddress);
    }

    @Override
    public ArrayList<Role> getSupportedEnterpriseRole() {
        return null;
    }
}
