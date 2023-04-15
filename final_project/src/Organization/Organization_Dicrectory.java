/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class Organization_Dicrectory {

    private ArrayList<Organization> organizationList;

    public Organization_Dicrectory() {
        this.organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization getOrganization(OrganizationType organizationName) {
        for (Organization organization : organizationList) {
            if (organization.getOrganizationName().equals(organizationName)) {
                return organization;
            }
        }
        return null;
    }
}
