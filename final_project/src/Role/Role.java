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

    public enum Type{
    SysAdmin("Admin"),
    Doctor("Doctor"),
    Patient("Patient"),
    Accountant("Accountant"),
    Insurance("Insurance Agent"),
    Government_health("Government Health Official"),
    Government_Financial("Government Financial Official"),
    Pharmacy("Pharmacy Manager");
            private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    

    
    public abstract JFrame createWorkArea(Account account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem);
}
