/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Organization.Organization;
import Organization.Organization_Dicrectory;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public abstract class Enterprise extends Organization {

    private String enterpriseAddress;
    private String enterpriseEmail;
    private Type enterpriseTypes;
    private Organization_Dicrectory organizationDicrectory;

    public Enterprise(Type type, String enterpriseEmail, String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
        this.enterpriseEmail = enterpriseEmail;
        this.enterpriseTypes = type;
        this.organizationDicrectory = new Organization_Dicrectory();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public Type getEnterpriseTypes() {
        return enterpriseTypes;
    }

    public void setEnterpriseTypes(Type enterpriseTypes) {
        this.enterpriseTypes = enterpriseTypes;
    }

    public Organization_Dicrectory getOrganizationDicrectory() {
        return organizationDicrectory;
    }

    public void setOrganizationDicrectory(Organization_Dicrectory organizationDicrectory) {
        this.organizationDicrectory = organizationDicrectory;
    }


    public enum Type { 
        Government("Government"), 
        Insurance("Insurance"),
        Hopital("Hospital"),
        Pharmacy("Pharmacy");

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
        public abstract ArrayList<Role> getSupportedEnterpriseRole();
}
