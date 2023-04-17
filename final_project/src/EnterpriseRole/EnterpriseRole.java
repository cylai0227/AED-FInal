/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnterpriseRole;

import javax.swing.JFrame;

/**
 *
 * @author whh
 */
public abstract class EnterpriseRole {
    public enum Type{
        GovernmentAdmin("Government_Admin"),
        HospitalAdmin("Hospital_Admin"),
        InsuranceAdmin("Insurance_Admin"),
        PharmacyAdmin("Pharmacy_Admin");
        
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
    public abstract JFrame createEnterpriseAdminWorkArea();   
}
