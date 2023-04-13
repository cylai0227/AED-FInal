/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Account.Account;
import EcoSystem.EcoSystem;
import Enterprise.Enterprise;
import Organization.Organization;
import javax.swing.JFrame;

/**
 *
 * @author whh
 */
public abstract class Role {

    private static String[] roles = {"Admin", "Doctor", "Patient", "Accountant", "Insurance Agent", "Government Health Official", "Government Financial Official", "Pharmacy Manager"};

    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(Account account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem);
}
