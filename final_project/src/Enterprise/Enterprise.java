/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Organization.Organization;
import Organization.Organization_Dicrectory;

/**
 *
 * @author whh
 */
public class Enterprise extends Organization{
    private String enterpriseAddress;
    private String enterpriseEmail;
    private Type enterpriseTypes;
    private Organization_Dicrectory organizationDicrectory;
    
    public Enterprise(){
        this.enterpriseAddress = enterpriseAddress;
        this.enterpriseEmail = enterpriseEmail;
        this.enterpriseTypes = new Type();
        this.organizationDicrectory = new Organization_Dicrectory();
    }
    
    public class Type{
        public static final String GOVERNMENT = "Government";
        public static final String INSURANCE = "insurance";
        public static final String PHARMACY = "Pharmacy";
        public static final String HOSPITAL = "Hospital";

        public static String getGOVERNMENT() {
            return GOVERNMENT;
        }

        public static String getINSURANCE() {
            return INSURANCE;
        }

        public static String getPHARMACY() {
            return PHARMACY;
        }

        public static String getHOSPITAL() {
            return HOSPITAL;
        }
        
        
    }
}
